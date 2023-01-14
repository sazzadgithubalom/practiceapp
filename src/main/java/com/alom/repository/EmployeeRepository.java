package com.alom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alom.entities.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
