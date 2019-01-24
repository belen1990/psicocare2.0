package com.psicocare.DAO;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	protected Properties properties = null;

	protected static String url;
	protected static String user;
	protected static String password;
	protected static String dbdriver;
	protected static String poolresource;
	protected static DataSource dataSource;

	protected String driverclass = "com.mysql.jdbc.Driver";
	protected static DataSource datasource = null;

	public DAO() {

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			datasource = (DataSource) envContext.lookup("jdbc/psicocare");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}