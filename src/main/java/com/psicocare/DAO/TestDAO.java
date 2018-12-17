package com.psicocare.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 

public class TestDAO {

	private static TestDAO instance = null;

//Singleton de instancias de TESTDAO//
	public static TestDAO getInstance() throws Exception {
		if (instance == null)
			instance = new TestDAO();

		return instance;
	}
	
	
	
	//Esta funcion sirve para contar el numero de veces que un caracter aparece en una string
	//En este caso lo usaremos para asegurarnos que el correo solo tiene una @
	public int countChar(String str, char c)
	{
	    int count = 0;

	    for(int i=0; i < str.length()-1; i++)
	    {    if(str.charAt(i) == c)
	            count++;
	    }

	    return count;
	}

	// Metodo para validar los campos del Registro (register)
	public int validateregisterform(String nombrerec, String emailrec, String userrec, String password1rec,	String password2rec) {

		System.out.println("Empieza el metodo");
		int ok = 1;

		if ((nombrerec == null) || (nombrerec.equals(""))||(nombrerec.length()<=3)) {//.length comprueba el numero de caracteres
			ok = 0;
			System.out.println("1 mal");
		}
		 if ((emailrec == null) || (emailrec.equals(""))||(countChar(emailrec,'@')!= 1)) {//Comprobar si mail (simplemente si no tiene una @
		
			ok = 0;
			System.out.println("2 mal");
		}
		 if ((userrec == null) || (userrec.equals(""))||(userrec.length()<=3)) {
			ok = 0;
			System.out.println("3 mal");
		}
		 if ((password1rec == null) || (password1rec.equals("")) || (!password1rec.equals( password2rec))||(password1rec.length()<=3)) {
			ok = 0;
			System.out.println(password1rec + "!=" + password2rec);
			System.out.println("4 mal");
		}

		else {}

		System.out.println("Empieza el metodo"+ok);
		

		// String regex = "[a-zA-Z0-9\\._\\-]{3,}";
		// OR || OR//

		return ok;

	}


	

	public boolean validatecomponentes(Double anxiedad, Double depresion, Double estres, Double anxiedadsocial) {
//Los componentes son %s
		boolean ok=false;
		

		if ((anxiedad instanceof Double)&&(anxiedad<=100)&&(depresion instanceof Double)&&(depresion<=100)&&(estres instanceof Double)&&(estres<=100)&&(anxiedadsocial instanceof Double)&&(anxiedadsocial<=100)) {
			//
			ok=true;System.out.println("Las componentes estan bien");
			
		}

		else {ok=false;System.out.println("Las componentes estan mal");}
		
		
		return ok;
	}
	
	
	

	
}
