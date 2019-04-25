package hello.repos;

import hello.domain.Service;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ServiceRepo extends CrudRepository<Service, Long> {
    List<Service> findByCost(String cost);
}
