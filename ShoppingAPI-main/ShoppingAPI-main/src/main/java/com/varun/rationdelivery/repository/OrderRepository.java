package com.varun.rationdelivery.repository;

import com.varun.rationdelivery.model.Order;
import com.varun.rationdelivery.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface OrderRepository extends MongoRepository<Order, String> {
    public void deleteByOrderId(@Param("orderId") String orderId);
    public void deleteAllByBuyer(@Param("buyer") User user);
    public Order getOrderByOrderId(@Param("orderId") String orderId);
}
