package hello.controller;

import hello.domain.Master;
import hello.domain.Order;
import hello.domain.User;
import hello.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/order")
@PreAuthorize("hasAuthority('ADMIN')")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public String orderList(Map<String, Object> model) {
        Iterable<Order> orders = orderService.loadAllOrders();
        model.put("orders", orders);

        return "order";
    }

    @PostMapping
    public String addMaster(@RequestParam String timestart, @RequestParam String timefinish, @RequestParam int amount,
                            @RequestParam User id, @RequestParam Master idmaster,
                            @RequestParam String status, Map<String, Object> model) {
        Order order = new Order(timestart, timefinish, amount, id, idmaster, status);

        orderService.saveOrders(order);

        Iterable<Order> orders = orderService.loadAllOrders();
        model.put("orders", orders);

        return "order";
    }

    @PostMapping("/filter")
    public String filterOrder(@RequestParam("filter") String filter, Map<String, Object> model) {
        Iterable<Order> orders;
        if (filter != null && !filter.isEmpty()) {
            orders = orderService.loadOrderByStatus(filter);
        } else {
            orders = orderService.loadAllOrders();
        }

        model.put("orders", orders);

        return "order";
    }

    @GetMapping("/{orders}")
    public String editOrder(@PathVariable Order orders, Model model) {
        model.addAttribute("orders", orders);
        return "editOrder";
    }

    @PostMapping("/show")
    public String edit(@RequestParam("idorder") Order orders, @RequestParam String timestart, @RequestParam String timefinish,
                       @RequestParam int amount, @RequestParam User id, @RequestParam Master idmaster,
                       @RequestParam String status) {

        orders.setTimestart(timestart);
        orders.setTimefinish(timefinish);
        orders.setAmount(amount);
        orders.setIdmaster(idmaster);
        orders.setId(id);
        orders.setStatus(status);
        orderService.saveOrders(orders);

        return "redirect:/order";
    }
}
