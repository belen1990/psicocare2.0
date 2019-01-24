package com.psicocare.DAO;

import com.psicocare.models.User;



public abstract class UserDAO extends DAO {
	public abstract User getuserbymailandpassword(String username, String password) throws Exception;
	public abstract User getUserByMail(String email) throws Exception;
	
}
