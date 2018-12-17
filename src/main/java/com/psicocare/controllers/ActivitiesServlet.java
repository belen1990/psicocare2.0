package com.psicocare.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.psicocare.DAO.ActivityDAO;
import com.psicocare.models.Activity;

/**
 * Servlet implementation class ActivityServlet
 */
public class ActivitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ActivitiesServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		//verificar que estamos logueados	
		/*if (request.getSession().getAttribute("id") != null) {
		} else {
			response.sendRedirect("login");
		
		}*/
//		String aidrec = request.getParameter("aid");
//		Activity unContent = null;
//		try {
//			
//			int aidint = Integer.parseInt(aidrec);
//			
//			unContent = ActivityDAO.getInstance().getActivityByAid(aidint);
//			request.setAttribute("unContent", unContent);
//			
//			
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		request.getRequestDispatcher("/activityGeneral.jsp").forward(request, response);	
//	}
		String aidrec = request.getParameter("aid");

		int aidInt = Integer.parseInt(aidrec);

		Activity myActivity = null;
		try {
			myActivity = ActivityDAO.getInstance().getActivityByAid(aidInt);
			
			System.out.println(aidInt);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
 System.out.println("Exception:"+e.getMessage());
		}
		request.setAttribute("miActivity", myActivity);
		request.getRequestDispatcher("/activityGeneral.jsp").forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
