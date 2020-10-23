package com.google.jpa.learningjpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.google.jpa.learningjpa.entity.User;
import com.google.jpa.learningjpa.repo.UserRepository;
import com.google.jpa.learningjpa.service.UserDaoService;


@Component
public class UserRepositoryCommnadLineRunner implements CommandLineRunner {
	public static final Logger log=
			                 LoggerFactory.getLogger(UserRepositoryCommnadLineRunner.class);
	@Autowired
	private UserRepository userRepository;
	
	

	@Override
	public void run(String... args) throws Exception {

		User user = new User("Virat", "RCB");
		userRepository.save(user);
		log.info("New User is Created==> "+user);
		
		Optional<User> UserByIdOne = userRepository.findById(1L);
		log.info("User having ID=1  ==> "+UserByIdOne);
		
		List<User> AllUser = userRepository.findAll();
		log.info("User List  ==> "+AllUser);
		
		List<User> findMYByName = userRepository.findMYByName("rohit");
		log.info("Rohit in  List  ==> "+findMYByName);

	}

}
