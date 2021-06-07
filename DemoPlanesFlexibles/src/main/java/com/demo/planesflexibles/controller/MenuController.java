package com.demo.planesflexibles.controller;
import java.util.Optional;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.planesflexibles.mapper.Menu;
import com.demo.planesflexibles.repository.IMenuRepository;



@RestController
@RequestMapping
public class MenuController {
	
	@Autowired
	private IMenuRepository repository;
	
	@GetMapping("/findid/{id}")
	public Optional<Menu> findById(@PathVariable("id") int id){
		
		return repository.findById(id);
	}
	
	@GetMapping("/list")
	public List<Menu> listMenu(){
		return repository.findAll();
	}
	
	
}
