package com.employee.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	List<Employee> list;
	
	@Override
	public Employee getEmployeeById(Integer id) {
		List<Employee> employees = getEmployeeList();
		for(Employee e : employees) {
			if(e.getId().equals(id)) {
				return e;
			}
		}
		return null;
	}
 
	

	@Override
	public void update(Employee employee) {
	List<Employee> employees = getEmployeeList();
	for(Employee emp : employees) {
		if(emp.getId() == employee.getId()) {
			if(employee.getName() != null) {
				emp.setName(employee.getName());	
			}
			if(employee.getEmail() != null) {
				emp.setEmail(employee.getEmail());
			}
			if(0L != employee.getPhone()) {
				emp.setPhone(employee.getPhone());
			}	
		}
	}
	}

	@Override
	public void deleteEmployee(Integer id) {
	List<Employee> employees = getEmployeeList();
	Employee emp = null;
	for(Employee e: employees) {
		if(e.getId() == id) {
			emp = e;
		}
	}
	employees.remove(employees.indexOf(emp));
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return getEmployeeList();
	}

	public List<Employee> getEmployeeList() {
		if(list == null) {
			list = new ArrayList<>();	
			list.add(new Employee(1, "Test1", "test1@mail.com", 111111111));
			list.add(new Employee(2, "Test2", "myEmail@mail.com", 222222222));
			list.add(new Employee(3, "Test3", "test3@mail.com", 333333333));
			list.add(new Employee(4, "Test4", "test4@mail.com", 444444444));
			return list;
		} else {
			return list;
		}
	}



	@Override
	public Employee create(Employee employee) {
		List<Employee> employees = getEmployeeList();
		Integer id = employees.size() + 1;
		employee.setId(id);
		employees.add(employee);
		return employee;
	}	
	
}