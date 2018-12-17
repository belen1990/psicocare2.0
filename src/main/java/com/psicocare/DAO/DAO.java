package com.psicocare.DAO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class DAO {
	protected String driverclass = "com.mysql.jdbc.Driver";
	protected String url = "jdbc:mysql://localhost/psicocare";
	protected DataSource datasource = null;

	protected DAO() throws Exception {
//		Class.forName(driverclass).newInstance();// new com.mysql.jdbc.Driver

		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		datasource = (DataSource) envContext.lookup("jdbc/psicocare");

	}
}