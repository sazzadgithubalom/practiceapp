package com.alom.service;

import java.util.List;
import java.util.Optional;

import com.alom.entities.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();
	Optional<Employee> findById(Integer id); 
}
