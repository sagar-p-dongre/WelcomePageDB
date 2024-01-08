package com.app.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
