package hello.domain;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name="idorder")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idorder;

    private String timestart;
    private String timefinish;
    private int amount;
    @ManyToOne
    @JoinColumn(name="id")
    private User id;
    @ManyToOne
    @JoinColumn(name="idmaster")
    private Master idmaster;
    private String status;

    public Order() {
    }

    public Order(String timestart, String timefinish, int amount, User id, Master idmaster, String status) {
        this.timestart = timestart;
        this.timefinish = timefinish;
        this.amount = amount;
        this.id = id;
        this.idmaster = idmaster;
        this.status = status;
    }

    public Order(String timestart, User id, String status) {
        this.timestart = timestart;
        this.id = id;
        this.status = status;
    }

    public String getTimestart() {
        return timestart;
    }

    public void setTimestart(String timestart) {
        this.timestart = timestart;
    }

    public String getTimefinish() {
        return timefinish;
    }

    public void setTimefinish(String timefinish) {
        this.timefinish = timefinish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public User getId() {
        return id;
    }

    public void setId(User id) {
        this.id = id;
    }

    public Master getIdmaster() {
        return idmaster;
    }

    public void setIdmaster(Master idmaster) {
        this.idmaster = idmaster;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getIdorder() {
        return idorder;
    }

    public void setIdorder(Long idorder) {
        this.idorder = idorder;
    }
}
