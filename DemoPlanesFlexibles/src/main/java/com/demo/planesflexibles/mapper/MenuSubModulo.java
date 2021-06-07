package com.demo.planesflexibles.mapper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "menu_sub_modulo")
public class MenuSubModulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_submodulo")
	private Integer id_submodulo;

	@Column(name = "descripcion")
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "id_modulo_fk")
	private ModuloMenu moduloMenu;

	public MenuSubModulo() {
		super();
	}

	public MenuSubModulo(Integer id_submodulo, String descripcion, ModuloMenu moduloMenu) {
		super();
		this.id_submodulo = id_submodulo;
		this.descripcion = descripcion;
		this.moduloMenu = moduloMenu;
	}

	public Integer getId_submodulo() {
		return id_submodulo;
	}

	public void setId_submodulo(Integer id_submodulo) {
		this.id_submodulo = id_submodulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ModuloMenu getModuloMenu() {
		return moduloMenu;
	}

	public void setModuloMenu(ModuloMenu moduloMenu) {
		this.moduloMenu = moduloMenu;
	}

}
