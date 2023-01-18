package com.alom.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alom.dto.EmployeeDto;
import com.alom.entities.Employee;
import com.alom.service.EmployeeService;

/**
 * @author sazzad.alom
 *
 */
@RestController
@RequestMapping("/employee")
public class EmployeeApi {

	private final EmployeeService employeeService;
	
	public EmployeeApi(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody EmployeeDto employeeDto){
		String response = employeeService.employeeSave(employeeDto);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/find-all")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
		
	}
	@PostMapping("/find-byId")
	public EmployeeDto getEmployeeById(@RequestBody Employee employee){
		return employeeService.findById(employee.getId());
		
	}
}
