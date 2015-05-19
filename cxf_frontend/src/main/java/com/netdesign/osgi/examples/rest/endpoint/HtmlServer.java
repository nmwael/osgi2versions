package com.netdesign.osgi.examples.rest.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.netdesign.osgi.examples.rest.domain.MessageProvider;
import com.netdesign.osgi.examples.rest.endpoint.domain.FancyClass;

@Path("/rest")
public class HtmlServer {

	private MessageProvider messageProvider;

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_XHTML_XML)
	public String giveMeHTML() {
		return getMessageProvider().getMessage();
	}

	@GET
	@Path("/produceFancyClass")
	@Produces(MediaType.APPLICATION_XML)
	public Response giveMeXML() {
		FancyClass fancyClass=new FancyClass();
		fancyClass.setName("Michael");
		fancyClass.setNumber(99);
		
		
		
		return Response.ok(fancyClass).build();
	}


	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
}
