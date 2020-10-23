package com.google.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.entity.Employee;
import com.google.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	
	public List<Employee> getAllEmp(){
		return empRepo.findAll();
	}
	public void save(Employee e) {
		empRepo.save(e);
		
	}

}
