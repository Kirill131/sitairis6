package hello.repos;

import hello.domain.Order;
import hello.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends CrudRepository<Order, Object> {
    List<Order> findByStatus(String status);
    List<Order> findById(User user);
    Order findByIdorder(Long idorder);
}
