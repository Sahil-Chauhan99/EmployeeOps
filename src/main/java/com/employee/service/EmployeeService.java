package com.employee.service;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public interface EmployeeService {
	
	public Employee getEmployeeById(Integer id);
}
