package com.psicocare.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.psicocare.DAO.UserDAO;
import com.psicocare.models.User;

/**
 * Servlet implementation class LoginServlett
 */
public class LoginServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlett() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		request.getRequestDispatcher("./login.jsp").forward(request, response);
		
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String emailrec= request.getParameter("username");
	    String passwordrec= request.getParameter("password");
		
		
		
	 boolean check;
	try {
		check = UserDAO.getInstance().validateloginform(emailrec, passwordrec);
		 if(check==true) { 	
				//Get access from database

		 int Access= UserDAO.getInstance().getuserbymailandpassword(emailrec,passwordrec);
		
		 if(Access==0){   HttpSession session = request.getSession();
		    session.setAttribute("login", emailrec);
		    
		    response.sendRedirect("menu");
		    }}
		 else{ System.out.println("El usuario no existe");	
		 }
		 }
		 
	 catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 
	} 	} 
	
	
	

		
	 
		
		
	


