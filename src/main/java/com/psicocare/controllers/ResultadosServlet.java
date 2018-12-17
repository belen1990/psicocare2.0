package com.psicocare.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ResultadosServlett
 */
public class ResultadosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Capturar respuestas de la sesion//
		String R1="5";
		String R2="5";
		String R3="5";
		String R4="5";
		String R5="5";

		// Parseamos como double las respuestas de la sesion//
		Double R1b=Double.parseDouble(R1);
		Double R2b=Double.parseDouble(R2);
		Double R3b=Double.parseDouble(R3);
		Double R4b=Double.parseDouble(R4);
		Double R5b=Double.parseDouble(R5);

	// MEtodos que generan las 4 componentes, Quizas es mejor que sean metodos desde un modelo?//		
		Double Anxiety = R1b+R2b+R3b+R4b+R5b;
		Double Stress = R1b+R2b+R3b+R4b+R5b;
		Double Socialanxiety = R1b+R2b+R3b+R4b+R5b;
		Double Depression = R1b+R2b+R3b+R4b+R5b;;
		
		
		// Pasamos los datos (mochila) para que se muestre en las barras de resultados de JSP//
		request.setAttribute("anxiety",Anxiety);
		request.setAttribute("depression",Depression);
		request.setAttribute("socialanxiety",Socialanxiety);
		request.setAttribute("stress",Stress);

		//Los metemos en la sesion con los nombres indicados//
		
		   HttpSession session = request.getSession();
		    session.setAttribute("Anxiety", Anxiety);		
		    session.setAttribute("Depression", Anxiety);		
		    session.setAttribute("Stress", Stress);		
		    session.setAttribute("Socialanxiety", Socialanxiety);		


			  
		// Mostrar en resultados.jsp(ruta /Resultados)//
		request.getRequestDispatcher("./resultados.jsp").forward(request, response);

		

	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//Redireccion al servlet de Registro al pulsar en el boton "Register/	
		response.sendRedirect("Register");
		//(ruta /Register)//
	}

}
