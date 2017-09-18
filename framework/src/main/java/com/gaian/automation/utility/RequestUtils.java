/*package com.gaian.automation.utility;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

*//**
 * @author hkandukuri
 *
 *//*
public class RequestUtils {

	private static Logger log = Logger.getLogger(RequestUtils.class);

	public static Response getRequestResponse(String url) {
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(url);
		Response response = target.request().accept(MediaType.APPLICATION_JSON_TYPE).get();
		log.info("Endpoint to GET: [" + url + "]");
		return response;
	}
	
	public static Response postAndgetRequestResponse(String url, String body) {
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(url);
		Response response = target.request().accept(MediaType.APPLICATION_JSON_TYPE).post(Entity.json(body));
		log.info("Endpoint to GET: [" + url + "]");
		return response;
	}
}*/
