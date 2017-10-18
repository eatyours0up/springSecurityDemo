package com.example.springsecurity.springSecurityDemo.repository;

import com.example.springsecurity.springSecurityDemo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
