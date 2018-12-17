package com.psicocare.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psicocare.DAO.ActivityDAO;
import com.psicocare.models.Activity;


public class HomeActivitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HomeActivitiesServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String aidrec = request.getParameter("aid");
//		Activity actContent = null;
//		try {
//			
//			int aidint = Integer.parseInt(aidrec);
//			
//			actContent = ActivityDAO.getInstance().getActivityByAid(aidint);
//			
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		request.setAttribute("actcontent", actContent);
		request.getRequestDispatcher("/activities.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
