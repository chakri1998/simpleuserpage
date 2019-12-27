package com.mindtree.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.repository.EmployeeRepository;
import com.mindtree.employee.service.EmployeeService;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void setEmployeeDetailsIntoDataBase(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	

	}

	@Override
	public Employee getEmployee(int employeeId) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.findById(employeeId).orElse(new Employee());
		System.out.println(employee);
		return employee;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee>employees=employeeRepository.findAll();
		return employees;
	}

	@Override
	public Employee getId(int employeeId) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.getOne(employeeId);
		employeeRepository.deleteById(employeeId);
		return employee;
	}
	
	
	
}
