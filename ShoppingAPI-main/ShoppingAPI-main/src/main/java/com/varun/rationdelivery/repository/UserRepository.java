package com.varun.rationdelivery.repository;

import com.varun.rationdelivery.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends MongoRepository<User, String> {
    public void deleteByRationCardNumber(@Param("userId") String userId);
    public User getUserByRationCardNumber(@Param("userId") String userId);
}
