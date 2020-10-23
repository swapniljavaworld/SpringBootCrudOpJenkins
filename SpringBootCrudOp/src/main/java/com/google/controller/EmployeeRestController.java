package com.google.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.entity.Employee;
import com.google.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/emp")
	public List<Employee> showEmp(){
		return service.getAllEmp();
	}


}
