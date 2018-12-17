package com.psicocare.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.psicocare.models.Activity;

public class ActivityDAO extends DAO{

	protected ActivityDAO() throws Exception {
		super();

	}

	private static ActivityDAO instance = null;

	public static ActivityDAO getInstance() throws Exception {
		if (instance == null)
			instance = new ActivityDAO();

		return instance;
	}

	public Activity getActivityByAid(int aidInt) throws SQLException, ClassNotFoundException {
		Activity resactivity = null;

		Connection conn = datasource.getConnection();

		String sql = "SELECT aid, statement, value, description, content, about, countdown FROM actividad WHERE aid=?";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setInt(1, aidInt);

		ResultSet rs = psmt.executeQuery();

		while (rs.next()) {

			resactivity = new Activity(rs.getInt(1), 
					rs.getString(2), 
					rs.getString(3), 
					rs.getString(4), 
					rs.getString(5),
					rs.getString(6),
					rs.getInt(7));
		}
		rs.close();
		psmt.close();
		conn.close();

		return resactivity;

//		Activity resActivity=null;
//
//		// establecemos conexion
//		String url="jdbc:mysql://localhost/psicocare";
//		
//		Connection conexion = DriverManager.getConnection(url, "root", "root");
//		String sql = "SELECT aid, statement, value, description, content, about, countdown FROM actividad WHERE aid=?";			
//		 PreparedStatement psmt = conexion.prepareStatement(sql);
//		 psmt.setInt(1, aidInt);
//		 
//		 ResultSet rs= psmt.executeQuery();
//		 System.out.println("Resultset:"+rs);
//		 
//
//		 while (rs.next()) {
//			System.out.println("Resultset:"+ rs.getInt(1)+" "+ rs.getString(2));	
//			resActivity= new Activity(
//					rs.getInt(1), 
//					rs.getString(2), 
//					rs.getString(3), 
//					rs.getString(4), 
//					rs.getString(5),
//					rs.getString(6),
//					rs.getInt(7)
//					);
//			
//		}
//		 rs.close();
//		
//		 psmt.close();
//
//		conexion.close();
//		
//		return resActivity;

	}
}
