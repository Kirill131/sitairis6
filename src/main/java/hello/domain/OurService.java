package hello.domain;

import javax.persistence.*;

@Entity
@Table(name = "service")
public class OurService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idservice;

    private String name;
    private String cost;
    private String duration;

    public OurService(String name, String cost, String duration) {
        this.name = name;
        this.cost = cost;
        this.duration = duration;
    }

    public OurService() {
    }

    public int getIdservice() {
        return idservice;
    }

    public void setIdservice(int idservice) {
        this.idservice = idservice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
