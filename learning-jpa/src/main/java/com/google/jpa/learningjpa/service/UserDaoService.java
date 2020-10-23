package com.google.jpa.learningjpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.jpa.learningjpa.entity.User;
import com.google.jpa.learningjpa.repo.UserRepository;

@Repository
@Transactional
public class UserDaoService {
	@Autowired
	private UserRepository repo;
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
	public String getMsg() {
		return "From Service";
	}

}
