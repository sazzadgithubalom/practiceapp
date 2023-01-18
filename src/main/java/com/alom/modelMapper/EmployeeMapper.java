package com.alom.modelMapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.alom.dto.EmployeeDto;
import com.alom.entities.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
	
	@Mapping(source = "employee.mobile", target = "phone")
	EmployeeDto employeeToEmployeeDto(Employee employee);
	
//	@Mapping(source = "employeeDto.phone", target = "mobile")
	@InheritInverseConfiguration
	Employee employeeDtoToEmployee(EmployeeDto employeeDto);
}
