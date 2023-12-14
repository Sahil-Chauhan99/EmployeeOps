package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired 
	EmployeeService employeeService;
	
//	@GetMapping("/{id}")
//	public ResponseEntity<Employee> getEmployeeId(@PathVariable Integer id) {
//		Employee employee = employeeService.getEmployeeById(id);
//		return ResponseEntity.ok(employee);
	
	@GetMapping("/allemployee")	
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployee();
		
	}
	}
