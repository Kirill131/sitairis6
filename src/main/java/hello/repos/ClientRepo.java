package hello.repos;

import com.mysql.cj.jdbc.jmx.LoadBalanceConnectionGroupManager;
import hello.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Client, Long> {
    Client findByPhoneAndEmail(String phone, String email);
}
