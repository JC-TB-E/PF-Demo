package com.demo.planesflexibles.mapper;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name = "module_menu")
public class ModuloMenu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_modulo")
	private Integer id_modulo;

	@ManyToOne
	@JoinColumn(name = "id_menu")
	private Menu menu;

	@OneToMany(mappedBy = "moduloMenu")
	@JsonIgnore
	private Set<MenuSubModulo> menuSubModulo;

	public ModuloMenu() {
		super();
	}

	public ModuloMenu(Integer id_modulo, Menu menu, Set<MenuSubModulo> menuSubModulo) {
		super();
		this.id_modulo = id_modulo;
		this.menu = menu;
		this.menuSubModulo = menuSubModulo;
	}

	public Integer getId_modulo() {
		return id_modulo;
	}

	public void setId_modulo(Integer id_modulo) {
		this.id_modulo = id_modulo;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Set<MenuSubModulo> getMenuSubModulo() {
		return menuSubModulo;
	}

	public void setMenuSubModulo(Set<MenuSubModulo> menuSubModulo) {
		this.menuSubModulo = menuSubModulo;
	}

}
