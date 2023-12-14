package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee getEmployeeById(Integer id) {
		return employeeRepository.getEmployeeById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.getAllEmployee();
	}

	@Override
	public Employee create(Employee employee) {
		return employeeRepository.create(employee);
	}

	@Override
	public void update(Employee employee) {
		employeeRepository.update(employee);
	}

	@Override
	public void delete(Integer id) {
		employeeRepository.deleteEmployee(id);
	}

}
