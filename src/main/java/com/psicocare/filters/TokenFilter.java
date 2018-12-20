package com.psicocare.filters;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;

import com.psicocare.models.StatusMessage;
import com.psicocare.services.JSONService;

//@WebFilter(filterName = "TokenFilter", urlPatterns = { "/api/pedidos/*" }) //el flitro esta anotado, su patrçon en la lista que vamos a filtrar
public class TokenFilter implements Filter {
	private static final Logger logger = Logger.getLogger(TokenFilter.class.getName());

	public TokenFilter() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) // Es el método que filtra
			throws IOException, ServletException {
		
		String token=((HttpServletRequest) request).getHeader("token"); //cogemos el request a partir del token
		logger.info("Filtrando requests: TOKEN:"+token); //Es un syso pero que capturan los login
		
		String email=JSONService.getUserEmailFromToken(token);
		
		if(email!=null) {
			chain.doFilter(request, response); //Si tenemos varios filtros, el chain reenvia la peticion als iguiente paso
		}else {
			byte[] responseToSend = restResponseBytes(Response.status(403).entity(new StatusMessage(403, "Prohibido")).build());
			((HttpServletResponse)response).setStatus(403);
			response.getOutputStream().write(responseToSend); //Devuleve directamente la respuesta sin pasar la petición al siguiente paso						
		}
				
	}

	@Override
	public void destroy() {

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}
	
	private byte[] restResponseBytes(Response eErrorResponse) throws IOException {
        String serialized = new ObjectMapper().writeValueAsString(eErrorResponse);
        return serialized.getBytes();
    }

}
