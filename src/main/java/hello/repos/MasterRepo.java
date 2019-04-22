package hello.repos;

import hello.domain.Master;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterRepo extends CrudRepository<Master, Long> {
    List<Master> findByCategory(int category);
}
