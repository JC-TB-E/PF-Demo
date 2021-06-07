package com.demo.planesflexibles.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.planesflexibles.mapper.MenuSubModulo;

import com.demo.planesflexibles.repository.IMenuSubModuloRepository;

@RestController
@RequestMapping
public class MenuSubModuloController {

	@Autowired
	private IMenuSubModuloRepository repository;

	//http://localhost:8002/findMenuSubModuloid/
	@GetMapping("/findMenuSubModuloid/{id_submodulo}")
	public Optional<MenuSubModulo> findById(@PathVariable("id_submodulo") int id_submodulo) {
		return repository.findById(id_submodulo);
	}

	@GetMapping("/listMenuSubModulo")
	public List<MenuSubModulo> listModuloMenu() {
		return repository.findAll();
	}

}
