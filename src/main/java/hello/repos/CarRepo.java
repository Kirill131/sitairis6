package hello.repos;

import hello.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends CrudRepository<Car, Long> {
    List<Car> findByVincode(String vincode);

    List<Car> findByIdcar(int idcar);

    List<Car> findByIduser(int iduser);



//    Car findByState_number(String state_number);
}
