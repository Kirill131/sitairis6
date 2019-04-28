package hello.service;

import hello.domain.Order;
import hello.repos.OrderRepo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Transactional
    public List<Order> loadOrderByStatus(String status){
        return  orderRepo.findByStatus(status);
    }

    @Transactional
    public Iterable<Order> loadAllOrders(){
        return orderRepo.findAll();
    }

    @Transactional
    public Order saveOrders(Order orders){
        return orderRepo.save(orders);
    }
}
