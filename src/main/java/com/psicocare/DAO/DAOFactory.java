package com.psicocare.DAO;

public class DAOFactory {

	public static final DAO getDao(String tipo) throws Exception {
		//if (usuario) {
			//UserDAO uDao = UserDAO.getInstance();
			//return uDao;
		//}
		switch (tipo) {
		case "usuario":
			UserDAO uDao = UserDAOImpl.getInstance();
			return uDao;
		}
		return null;

		
	}

}