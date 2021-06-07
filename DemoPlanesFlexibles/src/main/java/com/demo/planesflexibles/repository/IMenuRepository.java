package com.demo.planesflexibles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.planesflexibles.mapper.Menu;

public interface IMenuRepository extends JpaRepository<Menu, Integer> {

}
