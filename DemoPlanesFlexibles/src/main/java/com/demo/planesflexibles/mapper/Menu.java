package com.demo.planesflexibles.mapper;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_menu")
	private Integer id_menu;

	@Column(name = "descripcion")
	private String descripcion;

	@OneToMany(mappedBy = "menu")
	@JsonIgnore
	private Set<ModuloMenu> moduloMenu;

	public Menu() {
		super();
	}

	public Menu(Integer id_menu, String descripcion, Set<ModuloMenu> moduloMenu) {
		super();
		this.id_menu = id_menu;
		this.descripcion = descripcion;
		this.moduloMenu = moduloMenu;
	}

	public Integer getId_menu() {
		return id_menu;
	}

	public void setId_menu(Integer id_menu) {
		this.id_menu = id_menu;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<ModuloMenu> getModuloMenu() {
		return moduloMenu;
	}

	public void setModuloMenu(Set<ModuloMenu> moduloMenu) {
		this.moduloMenu = moduloMenu;
	}

}
