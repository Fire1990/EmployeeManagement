package com.web.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.management.model.Employee;
import com.web.management.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	

	public String saveEmployee(Employee emp) {
		repository.save(emp);
		return "data is saved";
	
		
		
	}

}
