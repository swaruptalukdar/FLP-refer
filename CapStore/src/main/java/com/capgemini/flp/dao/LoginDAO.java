package com.capgemini.flp.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capgemini.flp.model.AdminLogin;
@Repository
public class LoginDAO implements ILoginDAO{

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public AdminLogin login(AdminLogin login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean loginVerifier(String email, String password) {
		
			AdminLogin user=entityManager.find(AdminLogin.class,email);
			System.out.println(user);
			return false;
			
	}
		
	}


