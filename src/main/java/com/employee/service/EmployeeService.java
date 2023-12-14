package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public interface EmployeeService {
	
	public Employee getEmployeeById(Integer id);
	public List<Employee> getAllEmployee();
}
