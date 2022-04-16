package com.varun.rationdelivery.controller;

import com.varun.rationdelivery.model.Order;
import com.varun.rationdelivery.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    DatabaseService databaseService;

    @GetMapping("/orders/{orderId}")
    public Order getOrderDetails(@PathVariable("orderId") String orderId)
    {
        return databaseService.getOrderRepository().getOrderByOrderId(orderId);
    }

    @PostMapping("/orders")
    public void addOrder(@RequestBody Order order)
    {
        databaseService.getOrderRepository().save(order);
    }

    @PutMapping("/orders/{orderId}")
    public void modifyOrder(@RequestBody Order order,
                            @PathVariable("orderId") String orderId) {
        databaseService.getOrderRepository().deleteByOrderId(orderId);
        databaseService.getOrderRepository().save(order);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable("orderId") String orderId) {
        databaseService.getOrderRepository().deleteByOrderId(orderId);
    }
}
