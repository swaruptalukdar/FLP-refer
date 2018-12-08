package com.capgemini.flp.dao;

import com.capgemini.flp.model.AdminLogin;

public interface ILoginDAO {

	public AdminLogin login(AdminLogin login);
	public boolean loginVerifier(String email, String password);
}
