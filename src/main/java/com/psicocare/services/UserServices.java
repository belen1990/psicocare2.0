package com.psicocare.services;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.psicocare.DAO.UserDAO;
import com.psicocare.models.Intermediate;
import com.psicocare.models.StatusMessage;
import com.psicocare.models.Test;
import com.psicocare.models.User;

import javassist.expr.Instanceof;









@Path("/users")
public class UserServices {
	
	@Path("/{id}")
	@GET
	@Produces("application/json")
	
	public Response getdo(@PathParam("id") int id) throws SQLException, Exception {
		Response resp = null;
		User unUsuario = UserDAO.getInstance().getUserById(id);

		if (unUsuario == null) {
			resp = Response.status(404).entity(new StatusMessage(404, "El usuario no existe")).build();
		} else {
			resp = Response.status(200).entity(unUsuario).build();
		}

		return resp;
	}
	
	@Path("/mail/{email}")

    @GET

    @Produces("application/json")

    

    public Response getmail(@PathParam("email") String email) throws SQLException, Exception {        Response resp = null;

        boolean presente = UserDAO.getInstance().checkmail(email);

        

             if (presente == true) {

            resp = Response.status(202).entity(new StatusMessage(202, "The email is not yet registered")).build();

        } else {

            resp = Response.status(200).entity(new StatusMessage(200, "The email is already in use")).build();        }        return resp;

    }
	
	
	
	
	
	
	@Path("/username/{username}")

    @GET

    @Produces("application/json")

    

    public Response getusername(@PathParam("username") String user) throws SQLException, Exception {        Response resp = null;

        boolean presente = UserDAO.getInstance().checkuser(user);

        

             if (presente == true) {

            resp = Response.status(202).entity(new StatusMessage(202, "The username is not yet registered")).build();

        } else {

            resp = Response.status(200).entity(new StatusMessage(200, "The username is already in use")).build();        }        return resp;

    }
	
	
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Response addUsuario(User usuarioNuevo) throws SQLException, Exception {
Response resp = null;

if (usuarioNuevo.validate()) {			
resp = Response.status(200).entity( UserDAO.getInstance().createNuevo(usuarioNuevo)).build();
} else {
resp = Response.status(400).entity(new StatusMessage(400, "Faltan campos obligatorios por rellenar")).build();
	}

return resp;
}


@Path("/intermediate")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Response intermediate(Intermediate inter) throws SQLException, Exception {
Response resp = null;
Intermediate control =UserDAO.getInstance().intermediate(inter);
if (control instanceof Intermediate) {

    resp = Response.status(202).entity(new StatusMessage(202, "Intermediate relationship uploaded")).build();
    return resp;

} else {

    resp = Response.status(200).entity(new StatusMessage(200, "Internal error. Please try again later")).build();        }    
	return resp;

}
	
	
	
	
	@Path("/{id}")
	@DELETE
	@Produces("application/json")
	public boolean deleteUsuario(@PathParam("id") int id) throws Exception {
		
		return UserDAO.getInstance().borrarUsuario(id) ;
	}
	
	
	@Path("/{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response actualizarUser(@PathParam("id") int id,User unUser) throws SQLException, Exception {
		Response resp = null;

		unUser.setId(id);
		User unUsuario = UserDAO.getInstance().actualizarUser(unUser);

		if (unUsuario == null) {
			resp = Response.status(404).entity(new StatusMessage(404, "El usuario no existe")).build();
		} else {
			resp = Response.status(200).entity(unUsuario).build();
		}

		return resp;
	}
	
	
	
	

}
