package com.capgemini.flp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.flp.dao.ILoginDAO;

@Service
public class LoginService implements ILoginService {

	@Autowired
	private ILoginDAO dao;
	@Override
	public boolean loginVerifier(String email, String pass) {
		return dao.loginVerifier(email, pass);
	}

}
