package hello.repos;

import hello.domain.Master;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepo extends CrudRepository<Master, Long> {
    Master findByFIO(String FIO);
}
