package com.alom.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alom.dto.EmployeeDto;
import com.alom.entities.Employee;
import com.alom.modelMapper.EmployeeMapper;
import com.alom.repository.EmployeeRepository;
import com.alom.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;
	private final EmployeeMapper employeeMapper;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
		this.employeeRepository = employeeRepository;
		this.employeeMapper = employeeMapper;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public EmployeeDto findById(Integer id) {
		 Optional<Employee> existingEmployee = employeeRepository.findById(id);
		 Employee employee = existingEmployee.get();
		 return employeeMapper.employeeToEmployeeDto(employee);
	}

	@Override
	public String employeeSave(EmployeeDto employeeDto) {
		
		Employee save = employeeRepository.save(employeeMapper.employeeDtoToEmployee(employeeDto));
		System.out.println(employeeMapper.employeeToEmployeeDto(save));
		return "employee details successfully saved";
	}

}
