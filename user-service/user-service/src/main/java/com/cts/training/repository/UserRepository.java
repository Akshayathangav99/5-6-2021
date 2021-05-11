package com.cts.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.cts.training.bean.User;

@Component
public interface UserRepository extends JpaRepository<User, Long>{

}
