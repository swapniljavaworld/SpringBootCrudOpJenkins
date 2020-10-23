package com.google.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
