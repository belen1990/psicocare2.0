package com.psicocare.models;

import java.sql.SQLException;

public class User {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private Test test;
	private String username;
	
public User(){
		
	}
	
	public User(int id, String name, String email, String password, Test test, String username) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.test = test;
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public boolean validate() {
		boolean isValid = true;

		if (this.name == null || this.password == null || this.username == null || this.email == null)
			isValid = false;
		

		return isValid;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + email + ", email=" + email+ "]";
	}

	



	
}
