package com.google.jpa.learningjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.google.jpa.learningjpa.entity.User;
import com.google.jpa.learningjpa.service.UserDaoService;


@Component
public class UserDaoServiceCommnadLineRunner implements CommandLineRunner {
	public static final Logger log=
			                 LoggerFactory.getLogger(UserDaoServiceCommnadLineRunner.class);
	@Autowired
	private UserDaoService userDaoService;
	
	

	@Override
	public void run(String... args) throws Exception {

		User user = new User("Rohit", "Mumbai");
		long insert = userDaoService.insert(user);
		log.info("New User is Created==> "+user);
		

	}

}
