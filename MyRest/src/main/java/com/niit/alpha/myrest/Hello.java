package com.niit.alpha.myrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello()
	{
		return"hello Jersey Plain";
		
	}
	@GET
	@Path("/xmlhello")
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return"<?xml version=\"1.0\"?>"+"<hello>Hello Jersy"+"<hello>";
	} 
	@GET
	@Path("/htmlhello")
	@Produces(MediaType.TEXT_XML)
	public String sayHTMLHello() {
		return"<HTML>"+"<title>"+"Hello Jersey "+"</title>"+"<body><h1>"+"hello from the other side"+"</h1></body>"+"</html>";
}
}
