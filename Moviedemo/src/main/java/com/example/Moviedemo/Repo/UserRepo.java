package com.example.Moviedemo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Moviedemo.Models.User;

public interface UserRepo extends JpaRepository<User, Long>{
}
