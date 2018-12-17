package com.psicocare.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psicocare.DAO.ActivityDAO;
import com.psicocare.models.Activity;


public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		request.getRequestDispatcher("/menu.jsp").forward(request, response);		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String aidrec = request.getParameter("aid");

		int aidInt = Integer.parseInt(aidrec);

		Activity myActivity = null;
		try {
			myActivity = ActivityDAO.getInstance().getActivityByAid(aidInt);			
			
			System.out.println("myActivity: "+ myActivity);
			
			request.setAttribute("myActivity", myActivity);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
		
		doGet(request, response);
	}

}
