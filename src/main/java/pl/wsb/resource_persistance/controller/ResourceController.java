package pl.wsb.resource_persistance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.wsb.resource_persistance.model.Resource;
import pl.wsb.resource_persistance.repository.ResourceRepository;

import java.lang.reflect.Field;
import java.net.URI;
import java.util.List;

@Controller
@RequestMapping("/resources")
public class ResourceController {

    @Autowired
    private ResourceRepository resourceRepository;

    @PostMapping
    @ResponseBody
    public ResponseEntity<?> createResource(@RequestBody Resource resource) {
        Resource savedResource = resourceRepository.save(resource);
        URI location = URI.create("/resources/" + savedResource.getId());
        return ResponseEntity.created(location).body(savedResource);
    }

    @PutMapping
    @ResponseBody
    public ResponseEntity<?> increaseResource(@PathVariable long resourceId) throws Exception {
        Resource resource = resourceRepository.findById(resourceId).orElseThrow(() -> new Exception("ups"));
        Field[] fields = Resource.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                if (field.getType() == double.class) {
                    double currentValue = field.getDouble(resource);
                    field.setDouble(resource, currentValue + 0.1);
                } else if (field.getType() == int.class) {
                    int currentValue = field.getInt(resource);
                    field.setInt(resource, currentValue + 1);
                }
            } catch (IllegalAccessException e) {
                throw new Exception("ups");
            }
        }
        return ResponseEntity.accepted().body(resourceRepository.save(resource));
    }

    @PutMapping
    @ResponseBody
    public ResponseEntity<?> reverseResourceFlags(@PathVariable long resourceId) throws Exception {
        Resource resource = resourceRepository.findById(resourceId).orElseThrow(() -> new Exception("ups"));
        resource.setCzyPosiadaRadio(!resource.isCzyPosiadaRadio());
        return ResponseEntity.accepted().body(resourceRepository.save(resource));
    }

    @GetMapping("/api")
    @ResponseBody
    public List<Resource> getResourcesApi() {
        return resourceRepository.findAll();
    }
}