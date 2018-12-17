package com.psicocare.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.psicocare.models.Activity;
import com.psicocare.models.User;

public class UserDAO extends DAO  {

	protected UserDAO() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	private static UserDAO instance = null;

	public static UserDAO getInstance() throws Exception {
		if (instance == null)
			instance = new UserDAO();

		return instance;
	}

	
	
	
	public boolean subidausuario(String nombrerec, String emailrec, String userrec, String password1rec, Double anxiedad, Double depresion, Double estres, Double anxiedadsocial,Double R1,Double R2,Double R3,Double R4,Double R5) throws SQLException {
		
		
		boolean ok=false;
		

		Connection conn = datasource.getConnection();

//		conn.setAutoCommit(false);
		try {
		
			int idusuarioentablausuario_test=0;
			int idtestentablausuario_test=0;

			System.out.println(emailrec+nombrerec+userrec+password1rec);
			String sql = "	INSERT INTO usuario (email, name,Username, password) VALUES (?,?,?,?);";
			
			PreparedStatement psmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			psmt.setString(1,emailrec);
			psmt.setString(2,nombrerec );
			psmt.setString(3,userrec );
			psmt.setString(4,password1rec );

			System.out.println(psmt);
			psmt.executeUpdate();

			ResultSet rs = psmt.getGeneratedKeys();
			if (rs.next()) {
			 idusuarioentablausuario_test = rs.getInt(1);
			System.out.println("idusuario"+idusuarioentablausuario_test);
			}
			//rs.close();			
			rs.close();

			psmt.close();
			System.out.println("Usuario bien");
			
			
			
		 sql = "INSERT INTO test( respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, anxiety, depression, social_anxiety, stress) VALUES (?,?,?,?,?,?,?,?,?);";
		  psmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			psmt.setDouble(1,R1);//Se generan solos o me va a tocar darle al AI?//
			psmt.setDouble(2,R2 );
			psmt.setDouble(3,R3 );
			psmt.setDouble(4,R4 );
			psmt.setDouble(5,R5 );
			psmt.setDouble(6, anxiedad );
			psmt.setDouble(7, depresion);
			psmt.setDouble(8, estres );
			psmt.setDouble(9, anxiedadsocial);	
			
			System.out.println(psmt);

			psmt.executeUpdate();

			 rs = psmt.getGeneratedKeys();
			 
			 if (rs.next()) {
				 idtestentablausuario_test = rs.getInt(1);
				System.out.println("idusuario"+idtestentablausuario_test);
				}
			 
				
			rs.close();
			psmt.close();
			System.out.println("Test bien");

			
			
			 sql = "INSERT INTO test_usuario(tid, uid) VALUES (?,?);";
			  psmt = conn.prepareStatement(sql);
			  psmt.setInt(1,idtestentablausuario_test);
			  psmt.setInt(2,idusuarioentablausuario_test);

				psmt.executeUpdate();
				
				rs.close();
				psmt.close();
				conn.close();
				System.out.println("Usuario-test bien");


		} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				conn.rollback();

			} 
			
			
			ok=true;
			
			
			return ok;
		

	}

	public boolean getuserbyusarnameormailandpassword(String username, String passwordrec) throws SQLException {

		boolean ok=false;
		
		String url = "jdbc:mysql://localhost/psicoCare";

		Connection conn = DriverManager.getConnection(url, "psicocare_user", "psicokiller");

		
		String sql = "SELECT `name`,`password`,`Username`FROM `usuario` WHERE Username=? OR email=? AND password=?;"; 
		 PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1,username);
			psmt.setString(2,username );
			psmt.setString(3,passwordrec );//Añadir nombre de usuario en tabla de datos final
		
		
			 psmt.close();
			 conn.close();
		
		
		return ok;
		
		
					
			
		}




	public boolean checkmail( String emailrec) {

		boolean vale=false;
		try {
		Connection	conn = datasource.getConnection();
		String sql = "SELECT count(*) email FROM usuario  WHERE  email=?"; 
			//Count realiza la cuenta de cuantos elementos cumplen la condicion especificada en where.
			//En este caso contara cuantas veces hay un usuario en la tabla usuario que tenga los valores
			//introducidos en el formulario
			
		 PreparedStatement psmt = conn.prepareStatement(sql);
		 psmt.setString(1,emailrec );
		 //Añadir nombre de usuario en tabla de datos final
		 ResultSet rs=	psmt.executeQuery();
		 int count=0;	
		 while(rs.next())
		 count=rs.getInt(1);
		 if(count==0)	{
		 System.out.println("El usuario no esta en la base de datos");			
		 vale=true;}
		 if (count!=0) {
		 System.out.println("El usuario ya esta");		
		 vale=false;}				
		 psmt.close();
		 conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return vale;
	}




	public boolean checkuser(String userrec) {
		boolean vale=false;
		try {
		Connection	conn = datasource.getConnection();
		String sql = "SELECT count(*) Username   FROM usuario  WHERE  Username=?"; 
			//Count realiza la cuenta de cuantos elementos cumplen la condicion especificada en where.
			//En este caso contara cuantas veces hay un usuario en la tabla usuario que tenga los valores
			//introducidos en el formulario
			
		 PreparedStatement psmt = conn.prepareStatement(sql);
		 psmt.setString(1,userrec );
		 //Añadir nombre de usuario en tabla de datos final
		 ResultSet rs=	psmt.executeQuery();
		 int count=0;	
		 while(rs.next())
		 count=rs.getInt(1);
		 if(count==0)	{
		 System.out.println("El usuario no esta en la base de datos");			
		 vale=true;}
		 if (count!=0) {
		 System.out.println("El usuario ya esta");		
		 vale=false;}				
		 psmt.close();
		 conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return vale;		
	}
	
		
	
	public int getuserbymailandpassword(String mail, String passwordrec) throws SQLException {

		int ID=0;
		Connection conn = datasource.getConnection();
		String sql = "SELECT id FROM usuario WHERE email=? AND password=?;";
		PreparedStatement psmt = conn.prepareStatement(sql);

		psmt.setString(1,mail);
		psmt.setString(2,passwordrec );
		
	

		
		psmt.close();
		conn.close();
		
		return ID;
		
		
					
			
		}
		
	
	
	
	public boolean validateloginform(String nombrerec, String password) {

		System.out.println("Empieza el metodo para validar el login");
		boolean ok = true;

		if ((nombrerec == null) || (nombrerec.equals(""))) {//.length comprueba el numero de caracteres
			ok = false;
			System.out.println("mail/username mal");
		}
		
		 if ((password == null) || (password.equals(""))) {
			ok = false;
					System.out.println("password mal");
		}

		else {}

		System.out.println("Fin del metodo para validar el login");
		

		// String regex = "[a-zA-Z0-9\\._\\-]{3,}";
		// OR || OR//

		return ok;

	}
	
	
	
	
	
	
	
		
		
	}
		
		
	
	
	
	
	
	
	
	

