package com.psicocare.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.psicocare.models.Activity;
import com.psicocare.models.StatusMessage;
import com.psicocare.persistence.ActivityManager;


@Path("/activities")
public class ActivitiesService {

	@GET
	@Produces("application/json")
	public Response getActivity(@PathParam("id") int aid) {
		Response resp = null;
		ActivityManager pm = ActivityManager.getInstance();

		resp = Response.status(200).entity(pm.getActivities()).build();

		return resp;
	}

	@Path("/{aid}") // El parametro del Path tiene que coincidir con el Pathparam de la linea 36
	@GET
	@Produces("application/json")
	public Response getActivitiesByAid(@PathParam("aid") int aid) { // Con el Headerparam especificamos que "token" es
																	// lo que esperamos recibir

		if (aid > 0) {
			Activity pma = ActivityManager.getInstance().getActivityByAid(aid);
			try {
				return Response.status(200).entity(pma).build();
			} catch (Exception e) {
				System.out.println("Exception" + e.getMessage());
				return Response.status(500).entity(pma).build();
			}
		}else {
			return Response.status(400).entity(new StatusMessage(400, "No existe")).build();
		}
		
	}

}
