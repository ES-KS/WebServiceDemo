package com.company.webservicedemo.business.webservices.get;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.company.webservicedemo.dal.CustomerDAO;
import com.company.webservicedemo.entities.Customer;
import com.google.gson.Gson;
import com.xdev.Application;

@Path("/getServices")
public class GetServices {
	
	@GET
	@Path("/{param}")
	public Response getMessage(@PathParam("param") String msg) {
		String output = "Received input " + msg;
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	@Path("/customer/{customerid}")
	public Response getCustomer(@PathParam("customerid") String customerID) {
		
		Future<Customer> customerCall = Application.getExecutorService().submit(() ->{
		return new CustomerDAO().find(customerID);		
		});
		
		Gson g = new Gson();
		String json = null;
		try {
			json = g.toJson(customerCall.get());
		} catch (InterruptedException | ExecutionException e) {
			return Response.status(Status.NO_CONTENT).build();
		}
				
		return Response.status(200).entity(json).build();
	}
}
