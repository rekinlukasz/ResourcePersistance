package pl.wsb.resource_persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wsb.resource_persistance.model.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
