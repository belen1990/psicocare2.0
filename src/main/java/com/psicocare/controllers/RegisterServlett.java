package com.psicocare.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.psicocare.DAO.TestDAO;
import com.psicocare.DAO.UserDAO;

/**
 * Servlet implementation class RegisterServlett
 */
public class RegisterServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlett() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.getRequestDispatcher("./welcome2.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
		boolean vuela=false;
		// Capturamos las variables metidas en el formulario de registro*/
		String nombrerec = request.getParameter("name");
		String emailrec = request.getParameter("email");
		String userrec = request.getParameter("username");
		String password1rec = request.getParameter("password");
		String password2rec = request.getParameter("confirm");

		// Capturamos las variables metidas en la sesion tanto las respuestas como l//
		HttpSession session = request.getSession();
		Double anxiedad = (Double) session.getAttribute("Anxiety");
		Double depresion = (Double) session.getAttribute("Depression");
		Double estres = (Double) session.getAttribute("Stress");
		Double anxiedadsocial = (Double) session.getAttribute("Socialanxiety");

		
		
		
		double R1=(Integer) session.getAttribute("respuesta1");
		double R2=(Integer) session.getAttribute("respuesta2");
		double R3=(Integer) session.getAttribute("respuesta3");
		double R4=4;
		double R5=(Integer) session.getAttribute("respuesta5");
		// Obtener usuario de la sesion//
		// Comprobar nombre en resultados//

		// Llamar a las funciones de validacion de parametros y almacenarlas en la Base
		// de Datos//

		try {

			System.out.println("Comienzan las validaciones");

			// Validar formularios (PS HAY QUE HACER UN BUEN TEST PARA COMPROBAR QUE SE
			// PORTEN BIEN
			int ok = TestDAO.getInstance().validateregisterform(nombrerec, emailrec, userrec, password1rec,
					password2rec);

			// No pueden registrarse 2 personas con mismo username o mismo mail
			boolean okc = TestDAO.getInstance().validatecomponentes(anxiedad, depresion, estres, anxiedadsocial);
			// Validar componentes almacenados en la sesion?

			// Validar que el usuario y la contraseña no estan guardados

			boolean okay = UserDAO.getInstance().checkmail( emailrec);
			boolean okay2 = UserDAO.getInstance().checkuser( userrec);


			if ((okay == true)&&(okay2==true)) {

				System.out.println("Fin de las validaciones");

				if ((ok == 1) && (okc = true)) {// Inicio de if A

					boolean Store = UserDAO.getInstance().subidausuario(nombrerec, emailrec, userrec, password1rec,
							anxiedad, depresion, estres, anxiedadsocial,R1,R2,R3,R4,R5);

					// Si el metodo sale bienHaeemos un set attribute que validara la sesion con
					// username(con string al azar) (con email)
					while (Store = true) {
						request.setAttribute("login", emailrec);
						request.setAttribute("login1", userrec);

						// Login//
						vuela=true;

						

					}
				} else {

					request.setAttribute("errorsubida", "Los datos del formulario son incorrectos");

				} // Fin de else A
			} // Fin del primer if
 
			if ((okay == true)&&(okay2==false)) {request.setAttribute("errorsubida", "El correo introducido ya se encuentra en la base de datos. Por favor introduce un correo diferente");
}
			if ((okay == false)&&(okay2==true)) {request.setAttribute("errorsubida", "El nombre de usuario introducido ya se encuentra en la base de datos. Por favor introduce un nombre de usuario diferente");
}

			else {
				
				request.setAttribute("errorsubida", "El usuario y el email introducidos ya se encuentran registrados. Por favor,  ");

			}
 
		} // Fin del try

		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			request.setAttribute("errorsubida", "Hubo un error durante la subida, por favor intentalo otra vez");

		}


	}

}
