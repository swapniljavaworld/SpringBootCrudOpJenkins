package com.google.repo;

import javax.persistence.Id;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import com.google.entity.Employee;

@Configuration
public interface EmployeeRepository  extends JpaRepository<Employee, Id>{
	

}
