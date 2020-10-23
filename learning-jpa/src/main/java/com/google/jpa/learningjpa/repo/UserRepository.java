package com.google.jpa.learningjpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.google.jpa.learningjpa.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	@Query("From User where name= ?1")
	List<User> findMYByName (String name);

}
