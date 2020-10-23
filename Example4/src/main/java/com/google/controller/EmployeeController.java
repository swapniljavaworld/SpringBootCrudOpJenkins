package com.google.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.entity.Employee;
import com.google.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	//GetAll Employee
	
	@GetMapping("/getall")
	public List<Employee> getAllEmp(){
		return empService.getAllEmp();
	}
	@PostMapping("/save")
	public void saveEmp(@RequestBody Employee employee) {
		empService.save(employee);
		
	}
	
	

}
