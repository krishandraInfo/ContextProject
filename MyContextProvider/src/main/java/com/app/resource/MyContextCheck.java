package com.app.resource;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

@Path("/msg")
public class MyContextCheck {
	@GET
	@Path("/show")
	
	public String show(@Context HttpServletRequest request,
			           @Context ResourceInfo info,
			           @Context HttpHeaders header
			) {
		
		
		System.out.println(request.getMethod());
		System.out.println(request.getRequestURI());
		System.out.println(request.getRequestURL());
		System.out.println("-----------------------------");
		System.out.println(info.getResourceClass());
		System.out.println(info.getResourceMethod());
		System.out.println(info.getResourceMethod().getAnnotations()[0]);
		System.out.println(info.getResourceMethod().getAnnotations()[1]);
		System.out.println(info.getResourceMethod().getReturnType());
		System.out.println("-----------------------------");
		System.out.println(header.getCookies());
		System.out.println(header.getLength());
		System.out.println(header.getMediaType());
		
		System.out.println("sample");
		return "Got!";
	}

}
