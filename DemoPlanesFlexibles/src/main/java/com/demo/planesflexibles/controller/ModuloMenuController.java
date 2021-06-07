package com.demo.planesflexibles.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.planesflexibles.mapper.ModuloMenu;
import com.demo.planesflexibles.repository.IModuloMenuRepository;

@RestController
@RequestMapping
public class ModuloMenuController {

	@Autowired
	private IModuloMenuRepository repository;

	@GetMapping("/findModuloMenuid/{id_modulo}")
	public Optional<ModuloMenu> findById(@PathVariable("id_modulo") int id_modulo) {
		return repository.findById(id_modulo);
	}

	@GetMapping("/listModuloMenu")
	public List<ModuloMenu> listModuloMenu() {
		return repository.findAll();
	}

}
