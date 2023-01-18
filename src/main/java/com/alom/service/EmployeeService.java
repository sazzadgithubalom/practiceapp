package com.alom.service;

import java.util.List;

import com.alom.dto.EmployeeDto;
import com.alom.entities.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();
	EmployeeDto findById(Integer id); 
	
	String employeeSave(EmployeeDto employeeDto);
}
