package com.alom.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "employee")
public class Employee{

	
	@Id
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "address")
	private String address;
	
	@Column(name = "mobile")
	private String mobile;
	
	
}