package com.employee.repository;

import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public interface EmployeeRepository {
	public Employee getEmployeeById(Integer id);
	public Integer saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Integer id);
}
