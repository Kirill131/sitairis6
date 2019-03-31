package hello.domain;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idclient;
    private String FIO, email, phone;

    public Client() {
    }

    public Client(Integer idclient, String FIO, String email, String phone) {
        this.idclient = idclient;
        this.FIO = FIO;
        this.email = email;
        this.phone = phone;
    }

    public Client(String FIO, String email, String phone) {
        this.FIO = FIO;
        this.email = email;
        this.phone = phone;
    }

    public Integer getId() {
        return idclient;
    }

    public void setId(Integer id) {
        this.idclient = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
