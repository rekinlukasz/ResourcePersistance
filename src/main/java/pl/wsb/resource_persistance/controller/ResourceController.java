package pl.wsb.resource_persistance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.wsb.resource_persistance.model.Resource;
import pl.wsb.resource_persistance.repository.ResourceRepository;

import java.util.List;

@Controller
@RequestMapping("/resources")
public class ResourceController {

    @Autowired
    private ResourceRepository resourceRepository;

//    @GetMapping
//    public String listResources(Model model) {
//        List<Resource> resources = resourceRepository.findAll();
//        model.addAttribute("resources", resources);
//        return "resources";
//    }

    @PostMapping
    @ResponseBody
    public Resource createResource(@RequestBody Resource resource) {
        return resourceRepository.save(resource);
    }

    @GetMapping("/api")
    @ResponseBody
    public List<Resource> getResourcesApi() {
        return resourceRepository.findAll();
    }
}