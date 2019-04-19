package hello.repos;

import hello.domain.User;
<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> 25a7d076a7d96fafb8c66b94842a1626bfa91689
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
