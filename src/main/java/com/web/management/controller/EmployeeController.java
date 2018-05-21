package com.web.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.management.model.Employee;
import com.web.management.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@GetMapping("/reg")
	public String test() {

		return "webService working";
	}
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee emp) {
		return	service.saveEmployee(emp);


	}

}
