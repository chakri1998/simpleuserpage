package com.mindtree.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.employee.entity.Employee;

@Service
public interface EmployeeService {

	public void setEmployeeDetailsIntoDataBase(Employee employee);

	

	public Employee getEmployee(int employeeId);



	public List<Employee> getEmployees();



	public Employee getId(int employeeId);

}
