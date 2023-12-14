package com.employee.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public interface EmployeeRepository {
	public Employee getEmployeeById(Integer id);
	public Employee create(Employee employee);
	public void update(Employee employee);
	public void deleteEmployee(Integer id);
	public List<Employee> getAllEmployee();
	}
