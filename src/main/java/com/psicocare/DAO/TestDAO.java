package com.psicocare.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.psicocare.models.Activity;
import com.psicocare.models.Test;

public class TestDAO extends DAO  {

	protected TestDAO() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	private static TestDAO instance = null;

//Singleton de instancias de TESTDAO//
	public static TestDAO getInstance() throws Exception {
		if (instance == null)
			instance = new TestDAO();

		return instance;
	}

	// Esta funcion sirve para contar el numero de veces que un caracter aparece en
	// una string
	// En este caso lo usaremos para asegurarnos que el correo solo tiene una @
	public int countChar(String str, char c) {
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == c)
				count++;
		}

		return count;
	}

	// Metodo para validar los campos del Registro (register)
	public int validateregisterform(String nombrerec, String emailrec, String userrec, String password1rec,
			String password2rec) {

		System.out.println("Empieza el metodo");
		int ok = 1;

		if ((nombrerec == null) || (nombrerec.equals("")) || (nombrerec.length() <= 3)) {// .length comprueba el numero
																							// de caracteres
			ok = 0;
			System.out.println("1 mal");
		}
		if ((emailrec == null) || (emailrec.equals("")) || (countChar(emailrec, '@') != 1)) {// Comprobar si mail
																								// (simplemente si no
																								// tiene una @

			ok = 0;
			System.out.println("2 mal");
		}
		if ((userrec == null) || (userrec.equals("")) || (userrec.length() <= 3)) {
			ok = 0;
			System.out.println("3 mal");
		}
		if ((password1rec == null) || (password1rec.equals("")) || (!password1rec.equals(password2rec))
				|| (password1rec.length() <= 3)) {
			ok = 0;
			System.out.println(password1rec + "!=" + password2rec);
			System.out.println("4 mal");
		}

		else {
		}

		System.out.println("Empieza el metodo" + ok);

		// String regex = "[a-zA-Z0-9\\._\\-]{3,}";
		// OR || OR//

		return ok;

	}

	public boolean validatecomponentes(Double anxiedad, Double depresion, Double estres, Double anxiedadsocial) {
//Los componentes son %s
		boolean ok = false;

		if ((anxiedad instanceof Double) && (anxiedad <= 100) && (depresion instanceof Double) && (depresion <= 100)
				&& (estres instanceof Double) && (estres <= 100) && (anxiedadsocial instanceof Double)
				&& (anxiedadsocial <= 100)) {
			//
			ok = true;
			System.out.println("Las componentes estan bien");

		}

		else {
			ok = false;
			System.out.println("Las componentes estan mal");
		}

		return ok;
	}

	public Test getTest(int tid) throws SQLException {

		Test restest = null;		

		//Connection conn = DriverManager.getConnection();
		Connection conn = datasource.getConnection();

		String sql = "SELECT*FROM test WHERE tid=?;";

		PreparedStatement psmt = conn.prepareStatement(sql);

		psmt.setInt(1, tid);

		ResultSet rs = psmt.executeQuery();

		while (rs.next()) {

			restest = new Test(rs.getInt(1),
					rs.getInt(2),
					rs.getInt(3), 
					rs.getInt(4), 
					rs.getInt(5), 
					rs.getInt(6),
					rs.getDouble(7),
					rs.getDouble(8), 
					rs.getDouble(9),
					rs.getDouble(10));
		}
        rs.close();
		psmt.close();
		conn.close();

		System.out.println(restest.getDepression());
		return restest;
	}

	public List<Test> getAllTest() throws SQLException {
		List<Test> restest = new ArrayList<Test>();		

		//Connection conn = DriverManager.getConnection();
		Connection conn = datasource.getConnection();
		
		String sql = "SELECT* FROM test WHERE 1;";

		PreparedStatement psmt = conn.prepareStatement(sql);

		ResultSet rs = psmt.executeQuery();
		
		while (rs.next()) {
			
		Test object = new Test(

			rs.getInt(1),
			rs.getInt(2),
			rs.getInt(3), 
			rs.getInt(4), 
			rs.getInt(5), 
			rs.getInt(6),
			rs.getDouble(7),
			rs.getDouble(8), 
			rs.getDouble(9),
			rs.getDouble(10));

		restest.add(object);
		
		}
		rs.close();
		psmt.close();
		conn.close();
		
	
		return restest;
	}

	
	
	
	public   boolean  deletetest(int tid) throws SQLException {
		
		boolean ok =false;
		
		Connection conn = datasource.getConnection();
		//conn.setAutoCommit(false); Hay que hacer autocommit
		
		String sq2 = "DELETE FROM test_usuario WHERE tid=?;";
		PreparedStatement psmt = conn.prepareStatement(sq2);
		psmt.setInt(1, tid);
		System.out.println(psmt);
		psmt.executeUpdate();
		System.out.println(psmt);


		
		String sql = "DELETE FROM test WHERE tid=?;";

		 psmt = conn.prepareStatement(sql);
		psmt.setInt(1, tid);
		System.out.println(psmt);

		psmt.executeUpdate();
		System.out.println(psmt);

		psmt.close();
		conn.close();
		
		ok=true;
		
		return ok;
		// TODO Auto-generated method stub
		
	}

	public boolean updatetest(Test eltest) throws SQLException {

		boolean ok=false;
		
		Connection conn = datasource.getConnection();

		String sql = "UPDATE test SET respuesta1=?,respuesta2=?,respuesta3=?,respuesta4=?,respuesta5=?,anxiety=?,depression=?,social_anxiety=?,stress=? WHERE tid=?";

		PreparedStatement psmt = conn.prepareStatement(sql);

		System.out.println(eltest.getTid());

		psmt.setInt(1, eltest.getRespuesta1());
		psmt.setInt(2, eltest.getRespuesta2());
		psmt.setInt(3, eltest.getResuesta3());
		psmt.setInt(4, eltest.getRespuesta4());
		psmt.setInt(5, eltest.getRespuesta5());
		psmt.setDouble(6, eltest.getAnxiety());
		psmt.setDouble(7, eltest.getDepression());
		psmt.setDouble(8, eltest.getSocialanxiety());
		psmt.setDouble(9, eltest.getStress());
		psmt.setInt(10, eltest.getTid());
		
		System.out.println(psmt);

	
		psmt.executeUpdate();
		

		psmt.close();
		conn.close();
		
		ok=true;
		
		
		return ok;
	}
	
	public Test addtest(Test elTest) throws SQLException {

		Test addtest = elTest;
		Connection conn = datasource.getConnection();

		String sql = "INSERT INTO test( respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, anxiety, depression, social_anxiety, stress) VALUES (?,?,?,?,?,?,?,?,?);";

		PreparedStatement psmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		psmt.setInt(1, elTest.getRespuesta1());
		psmt.setInt(2, elTest.getRespuesta2());
		psmt.setInt(3, elTest.getResuesta3());
		psmt.setInt(4, elTest.getRespuesta4());
		psmt.setInt(5, elTest.getRespuesta5());
		psmt.setDouble(6, elTest.getAnxiety());
		psmt.setDouble(7, elTest.getDepression());
		psmt.setDouble(8, elTest.getSocialanxiety());
		psmt.setDouble(9, elTest.getStress());


		System.out.println("SQL Insert Test:"+psmt.toString());
		
		psmt.executeUpdate();
		ResultSet rs = psmt.getGeneratedKeys();
		
		if (rs.next()) {
			int id = rs.getInt(1);
			addtest.setTid(id);
		}

		psmt.close();
		conn.close();

		return addtest;
	}
	
	
 
	
	

}
