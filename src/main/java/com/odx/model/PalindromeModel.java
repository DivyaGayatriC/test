package com.odx.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;

@Entity
public class PalindromeModel {
	@Id
	@GeneratedValue
	Long id;
	String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
