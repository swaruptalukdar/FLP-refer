package com.capgemini.flp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

@Entity
public class AdminLogin {
	@Id
	@Column(name="email_Id")
	@Pattern(regexp="^[a-z.0-9]+@[a-z]+.[a-z]{2,4}$", message="Invalid Format.. eg. swarup@gmail.com")
	private String emailId;	
	
	
	@Column(nullable=false)
	@Pattern(regexp="^[A-Z][a-z//s@#$%.]+$", message="use [A-Z][a-z//s@#$%.]+")
	private String password;
	
	@Column(nullable=false,name="name")
	@Pattern(regexp="^[A-Z][a-z//s]+$", message="use [A-Z][a-z//s]+")
	private String name;
	
	@Column(nullable=false,name="phoneNumber")
	@Pattern(regexp="^[6-9][0-9]{9}$", message="use [6-9][0-9]{9}")
	private String phoneNumber;
	
	public AdminLogin() {
		// TODO Auto-generated constructor stub
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public AdminLogin(String emailId, String password, String name, String phoneNumber) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "AdminLogin [emailId=" + emailId + ", password=" + password + ", name=" + name + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
	
}
