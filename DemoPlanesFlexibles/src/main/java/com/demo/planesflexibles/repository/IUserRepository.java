package com.demo.planesflexibles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.planesflexibles.mapper.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
