package com.google.jpa.learningjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.jpa.learningjpa.service.UserDaoService;

@RestController
public class UserController {
	
	@Autowired
	UserDaoService service;
	@Value("${person.name}")
	String name;
	
	@RequestMapping
	public String welocome() {
		return "From Controller---"+name;
		
	}

}
