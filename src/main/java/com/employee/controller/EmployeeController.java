package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired 
	EmployeeService employeeService;
	
	@GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeId(@PathVariable Integer id) {
    	Employee employee = employeeService.getEmployeeById(id);
  		return ResponseEntity.ok(employee);
	}
	
	@GetMapping("/allEmployee")	
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> list =  employeeService.getAllEmployee();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping("/create")	
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.create(employee);
		return ResponseEntity.ok(emp);
	}
	
	@PutMapping("/update")
	public ResponseEntity updateEmployee(@RequestBody Employee employee) {
		employeeService.update(employee);
		return ResponseEntity.ok(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity deleteEmployee(@PathVariable Integer id) {
		employeeService.delete(id);
		return ResponseEntity.ok(HttpStatus.NO_CONTENT);
	}
	
}