package com.varun.rationdelivery.service;

import com.varun.rationdelivery.repository.OrderRepository;
import com.varun.rationdelivery.repository.ProductRepository;
import com.varun.rationdelivery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    DatabaseService() {}

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }
}
