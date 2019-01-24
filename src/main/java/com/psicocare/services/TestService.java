package com.psicocare.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.psicocare.DAO.TestDAO;
import com.psicocare.models.StatusMessage;
import com.psicocare.models.Test;

@Path("/test")
public class TestService {

	@GET
	@Produces("application/json")
	public Response getPedidos() {

		TestDAO testDAO;

		try {
			testDAO = TestDAO.getInstance();
			return Response.status(200).entity(testDAO.getAllTest()).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity(new StatusMessage(500, "el test no existe")).build();
			//
		}

	}

	@Path("/{tid}")
	@GET // va arespondeer en la ruta pedidos a las respuestas de tipo GET
	@Produces("application/json")
	public Response getTest(@PathParam("tid") int tid) {

		TestDAO testDAO;

		try {
			testDAO = TestDAO.getInstance();
			return Response.status(200).entity(testDAO.getTest(tid)).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity(new StatusMessage(500, "el test no existe")).build();
			//
		}

	}

	// Errores de tipo 404 resuesta

	@Path("/{tid}")
	@DELETE
	@Produces("application/json")
	public Response deletetest(@PathParam("tid") int tid) {
		boolean testDAO;

		try {
			testDAO = TestDAO.getInstance().deletetest(tid);

			return Response.status(200).entity(testDAO).build();

		} catch (SQLException e) {
			return Response.status(404).entity(new StatusMessage(404, "el test no existe")).build();
		} catch (Exception e) {
			return Response.status(500).entity(new StatusMessage(500, "Internal server error")).build();
		}

	}
	
	
	
	
	
	@Path("/{tid}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response actualizarPedido(@PathParam("tid") int tid,Test untest)
	 {
		Test testDAO;
		try {
			
			untest.setTid(tid);
			testDAO=TestDAO.getInstance().getTest(tid);
			
			return Response.status(200).entity(TestDAO.getInstance().updatetest(untest)).build();

		} catch (SQLException e) {
			return Response.status(404).entity(new StatusMessage(404, "el test no existe")).build();
		} catch (Exception e) {
			return Response.status(500).entity(new StatusMessage(500, "Internal server error")).build();
		}
		
	

}
	
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
   public Response addTest(Test testNuevo) throws SQLException, Exception {


        Response testresp = null; // El objeto del tipo response nos permite ajustar con precision con respecto a

                                    // los datos que quiero devolver. No spermite recibir el códgio de respuesta en

                                    // funciçón de los ti`pos de datos

        if (testNuevo.validate()) {

            Test testADev=TestDAO.getInstance().addtest(testNuevo);

            

            testresp = Response.status(200).entity(testADev).build();

        } else {

            testresp = Response.status(400).entity(new StatusMessage(400, "Nose ha podido crear el test")).build();

        }

        return testresp;

    }
	
	
	
	
	
}