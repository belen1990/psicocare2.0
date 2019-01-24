package com.psicocare.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import com.psicocare.models.Intermediate;
import com.psicocare.models.User;

public class UserDAOImpl extends UserDAO {

	private static UserDAOImpl instance = null;

	public static UserDAOImpl getInstance() throws Exception {
		if (instance == null) {
			instance = new UserDAOImpl();
		}
		return instance;
	}

	public boolean getuserbyusarnameormailandpassword(String username, String passwordrec) throws SQLException {

		boolean ok = false;

		String url = "jdbc:mysql://localhost/psicoCare";

		Connection conn = DriverManager.getConnection(url, "psicocare_user", "psicokiller");

		String sql = "SELECT `name`,`password`,`username`FROM `usuario` WHERE Username=? OR email=? AND password=?;";
		PreparedStatement psmt = conn.prepareStatement(sql);

		psmt.setString(1, username);
		psmt.setString(2, username);
		psmt.setString(3, passwordrec);// Añadir nombre de usuario en tabla de datos final

		psmt.close();
		conn.close();

		return ok;

	}

	public boolean checkmail(String emailrec) {

		boolean vale = false;
		try {
			Connection conn = datasource.getConnection();
			String sql = "SELECT count(*) email FROM usuario  WHERE  email=?";
			// Count realiza la cuenta de cuantos elementos cumplen la condicion
			// especificada en where.
			// En este caso contara cuantas veces hay un usuario en la tabla usuario que
			// tenga los valores
			// introducidos en el formulario

			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, emailrec);
			// Añadir nombre de usuario en tabla de datos final
			ResultSet rs = psmt.executeQuery();
			int count = 0;
			while (rs.next())
				count = rs.getInt(1);
			if (count == 0) {
				System.out.println("El usuario no esta en la base de datos");
				vale = true;
			}
			if (count != 0) {
				System.out.println("El usuario ya esta");
				vale = false;
			}
			psmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vale;
	}

	public boolean checkuser(String userrec) {
		boolean vale = false;
		try {
			Connection conn = datasource.getConnection();
			String sql = "SELECT count(*) username   FROM usuario  WHERE  username=?";
			// Count realiza la cuenta de cuantos elementos cumplen la condicion
			// especificada en where.
			// En este caso contara cuantas veces hay un usuario en la tabla usuario que
			// tenga los valores
			// introducidos en el formulario

			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, userrec);
			// Añadir nombre de usuario en tabla de datos final
			ResultSet rs = psmt.executeQuery();
			int count = 0;
			while (rs.next())
				count = rs.getInt(1);
			if (count == 0) {
				System.out.println("El usuario no esta en la base de datos");
				vale = true;
			}
			if (count != 0) {
				System.out.println("El usuario ya esta");
				vale = false;
			}
			psmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vale;
	}

	public User getuserbymailandpassword(String email, String password) throws Exception {
		User aUser = null;

		Connection conn = datasource.getConnection();
		String sql = "SELECT `id`,`email`,`name`,`password`,`Username` FROM usuario WHERE email=? AND password=?;";
		PreparedStatement psmt = conn.prepareStatement(sql);

		psmt.setString(1, email);
		psmt.setString(2, password);

		ResultSet rs = psmt.executeQuery();
		while (rs.next()) {
			aUser = new User();
			aUser.setId(rs.getInt("id"));
			aUser.setName(rs.getString("name"));
			aUser.setPassword(rs.getString("password"));
			aUser.setEmail(rs.getString("email"));

			// Object test = rs.getTest("test");

			// aUser.setTest(rs.getString("test"));
			aUser.setUsername(rs.getString("username"));

			break;
		}

		psmt.close();
		conn.close();

		return aUser;

	}

	public boolean validateloginform(String nombrerec, String password) {

		System.out.println("Empieza el metodo para validar el login");
		boolean ok = true;

		if ((nombrerec == null) || (nombrerec.equals(""))) {// .length comprueba el numero de caracteres
			ok = false;
			System.out.println("mail/username mal");
		}

		if ((password == null) || (password.equals(""))) {
			ok = false;
			System.out.println("password mal");
		}

		else {
		}

		System.out.println("Fin del metodo para validar el login");

		// String regex = "[a-zA-Z0-9\\._\\-]{3,}";
		// OR || OR//

		return ok;

	}

	public User getUserById(int id) throws SQLException {
		User resUser = null;

		Connection conn = datasource.getConnection();

		String sql = "SELECT id, name, email, username FROM `usuario` WHERE id=?";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setInt(1, id);

		ResultSet rs = psmt.executeQuery();

		while (rs.next()) {

			resUser = new User(rs.getInt(1), rs.getString(2), rs.getString(3), null, null, rs.getString(4));

		}
		rs.close();
		psmt.close();
		conn.close();

		return resUser;
	}

	public User createNuevo(User usuario) throws SQLException {
		User ues = usuario;

		Connection conn = datasource.getConnection();

		conn.setAutoCommit(false);

		try {
			// INSERTAR USER
			String sql = "INSERT INTO usuario (email, name, password, username) VALUES (?, ?, ?, ?)";
			PreparedStatement psmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			psmt.setString(1, usuario.getEmail());
			psmt.setString(2, usuario.getName());
			psmt.setString(3, usuario.getPassword());
			psmt.setString(4, usuario.getUsername());

			psmt.executeUpdate();

			ResultSet rs = psmt.getGeneratedKeys();

			if (rs.next()) {
				ues.setId(rs.getInt(1));
			}

			rs.close();
			psmt.close();

			conn.commit();
		} catch (Exception e) {
			System.out.println("Excepcion tx:" + e.getMessage());
			ues = null;
			conn.rollback();
			throw new SQLException();
		}

		conn.close();

		return ues;
	}

	public boolean borrarUsuario(int id) throws SQLException {
		boolean resUser = false;

		Connection conn = datasource.getConnection();

		// conn.setAutoCommit(true);//Change to true

		try {
			// String sql = "DELETE FROM test_usuario WHERE uid=?";
			// PreparedStatement psmt = conn.prepareStatement(sql);
			// psmt.setInt(1, id);

			// psmt.executeUpdate();
			// psmt.close();

			String sql = "DELETE FROM usuario WHERE id=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);

			psmt.executeUpdate();
			resUser = true;

			psmt.close();
			conn.close();
			// conn.commit();
		} catch (Exception e) {
			System.out.println("Excep Tx:" + e.getMessage());
			// conn.rollback();
			// throw new SQLException();
		}

		return resUser;
	}

	public User actualizarUser(User userAct) throws SQLException {
		User resUser = userAct;

		Connection conn = datasource.getConnection();

		String sql = "UPDATE usuario SET email=?, name=?, password=?, username=? WHERE id=? ";

		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, userAct.getEmail());
		psmt.setString(2, userAct.getName());
		psmt.setString(3, userAct.getPassword());
		psmt.setString(4, userAct.getUsername());
		psmt.setInt(5, userAct.getId());

		System.out.println("SQL Update:" + psmt.toString());

		psmt.executeUpdate();

		psmt.close();
		conn.close();

		return resUser;
	}

	public List<User> getUsuarios() throws SQLException {
		ArrayList<User> usuarios = new ArrayList<User>();

		Connection conn = datasource.getConnection();

		String sql = "SELECT `id`,`email`,`name`,`password`,`Username` FROM `usuario`";
		PreparedStatement psmt = conn.prepareStatement(sql);
		/*
		 * psmt.setInt(1, usuario.getId()); psmt.setString(2, usuario.getEmail());
		 * psmt.setString(3, usuario.getName()); psmt.setString(4,
		 * usuario.getPassword()); psmt.setString(5, usuario.getUsername());
		 */

		ResultSet rs = psmt.executeQuery(sql);

		while (rs.next()) {

			User usuario = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), null,
					rs.getString(5));
			usuarios.add(usuario);

		}
		rs.close();
		psmt.close();
		conn.close();

		return usuarios;
	}

	@Override
	public User getUserByMail(String email) throws Exception {
		User aUser = null;

		Connection conn = dataSource.getConnection(); // pool de Tomcat

		PreparedStatement pstmt = null;
		String selectSQL = "SELECT * FROM usuario WHERE email=?";
		pstmt = conn.prepareStatement(selectSQL);
		pstmt.setString(1, email);

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			aUser = new User();
			aUser.setId(rs.getInt("id"));
			aUser.setName(rs.getString("name"));
			aUser.setEmail(rs.getString("email"));

			aUser.setUsername(rs.getString("username"));

			break;
		}

		pstmt.close();
		conn.close();

		return aUser;
	}

	public boolean subidausuario(String nombrerec, String emailrec, String userrec, String password1rec,
			Double anxiedad, Double depresion, Double estres, Double anxiedadsocial, Double R1, Double R2, Double R3,
			Double R4, Double R5) throws SQLException {

		boolean ok = false;

		Connection conn = datasource.getConnection();

		// conn.setAutoCommit(true);
		try {

			int idusuarioentablausuario_test = 0;
			int idtestentablausuario_test = 0;

			System.out.println(emailrec + nombrerec + userrec + password1rec);
			String sql = "	INSERT INTO usuario (email, name,Username, password) VALUES (?,?,?,?);";

			PreparedStatement psmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			psmt.setString(1, emailrec);
			psmt.setString(2, nombrerec);
			psmt.setString(3, userrec);
			psmt.setString(4, password1rec);

			System.out.println(psmt);
			psmt.executeUpdate();

			ResultSet rs = psmt.getGeneratedKeys();
			if (rs.next()) {
				idusuarioentablausuario_test = rs.getInt(1);
				System.out.println("idusuario" + idusuarioentablausuario_test);
			}
			// rs.close();
			rs.close();

			psmt.close();
			System.out.println("Usuario bien");

			sql = "INSERT INTO test( respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, anxiety, depression, social_anxiety, stress) VALUES (?,?,?,?,?,?,?,?,?);";
			psmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			psmt.setDouble(1, R1);// Se generan solos o me va a tocar darle al AI?//
			psmt.setDouble(2, R2);
			psmt.setDouble(3, R3);
			psmt.setDouble(4, R4);
			psmt.setDouble(5, R5);
			psmt.setDouble(6, anxiedad);
			psmt.setDouble(7, depresion);
			psmt.setDouble(8, estres);
			psmt.setDouble(9, anxiedadsocial);

			System.out.println(psmt);

			psmt.executeUpdate();

			rs = psmt.getGeneratedKeys();

			if (rs.next()) {
				idtestentablausuario_test = rs.getInt(1);
				System.out.println("idusuario" + idtestentablausuario_test);
			}

			rs.close();
			psmt.close();
			System.out.println("Test bien");

			sql = "INSERT INTO test_usuario(tid, uid) VALUES (?,?);";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, idtestentablausuario_test);
			psmt.setInt(2, idusuarioentablausuario_test);

			psmt.executeUpdate();

			rs.close();
			psmt.close();
			// conn.close();
			System.out.println("Usuario-test bien");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			conn.rollback();

		}

		ok = true;

		return ok;

	}

	public Intermediate intermediate(Intermediate inter) throws SQLException {

		Intermediate resinter = inter;

		Connection conn = datasource.getConnection();

		String sql = "INSERT INTO test_usuario(uid, tid) VALUES (?,?);";
		PreparedStatement psmt = conn.prepareStatement(sql);
		System.out.println(psmt);
		psmt.setInt(1, resinter.getUid());
		psmt.setInt(2, resinter.getTid());

		psmt.executeUpdate();
		System.out.println(psmt);

		psmt.close();
		conn.close();
		System.out.println("Usuario-test bien");

		return resinter;

	}

}