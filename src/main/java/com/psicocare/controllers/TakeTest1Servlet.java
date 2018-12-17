package com.psicocare.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.psicocare.models.Test;

public class TakeTest1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(); // Iniciamos sesion.

		String paso = request.getParameter("paso"); // Cogemos el paramtro paso que esta en el input escondido del
													// formulario y le vamos dando un valor diferente e cada pregunta

		System.out.println(paso);

		int pasoInt = paso == null ? 0 : Integer.parseInt(paso); // Solo lo parseo si no es null

		request.setAttribute("paso", pasoInt); // le pasamos la mochila
		request.getRequestDispatcher("test.jsp").forward(request, response); // lo enviamos a test.jsp

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String respuestarec = request.getParameter("respuestainput"); // Cogemos las respuestas de los name de los
		// input. Si es igual a null ees cero y si no lo
		// parseamos
		int respuestarecInt = respuestarec == null ? 0 : Integer.parseInt(respuestarec);

		String paso = request.getParameter("paso"); // cogemos el parámetro paso para saber en la pregunta en la que now
													// contramos
		int pasoInt = paso == null ? 0 : Integer.parseInt(paso); // Si es null valo cero, en caso contrario lo
																	// parseamos.

		System.out.println("Paso: " + pasoInt);

		int answer = respuestarecInt; //En esta variable vamos a ir guardando als respuestas del input sobre las que vamos air iterando

		if (pasoInt == 1) {

			session.setAttribute("respuesta1", answer);

			System.out.println("answer1:" + session.getAttribute("respuesta1"));

			System.out.println(session.getAttribute("respuesta1"));

		}
		if (pasoInt == 2) {
			
			session = request.getSession();

			session.setAttribute("respuesta2", answer);

			System.out.println("answer2:" + session.getAttribute("respuesta2"));

			System.out.println(session.getAttribute("respuesta2"));

		} else if (pasoInt == 3) {
			
			session = request.getSession();

			session.setAttribute("respuesta3", answer);

			System.out.println("answer3:" + session.getAttribute("respuesta3"));

			System.out.println(session.getAttribute("respuesta3"));

		} else if (pasoInt == 4) {
			
			session = request.getSession();
			
			session.setAttribute("respuesta4", answer);

			System.out.println("answer4:" + session.getAttribute("respuesta4"));

			System.out.println(session.getAttribute("respuesta4"));
		} else if (pasoInt == 5) {
			
			session = request.getSession();
			
			session.setAttribute("respuesta5", answer);

			System.out.println("answer5:" + session.getAttribute("respuesta5"));

			System.out.println(session.getAttribute("respuesta5"));

		}
		doGet(request, response);

	}

}
