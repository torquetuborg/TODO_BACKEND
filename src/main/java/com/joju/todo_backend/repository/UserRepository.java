package com.joju.todo_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joju.todo_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
