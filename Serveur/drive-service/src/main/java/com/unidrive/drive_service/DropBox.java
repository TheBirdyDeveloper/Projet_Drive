package com.unidrive.drive_service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/DropBox")
public class DropBox {
	private static String code_;
	
	private final static String clientID = "p8ohrm26izkscws";
	private final static String clientSecret = "ovydv03up9b2zj7";
	
	//This method is called if HTML is request
	@Path("/OAuth")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String dropBoxAuth(@QueryParam("auth") String auth) {
	String url = "https://www.dropbox.com/1/oauth2/authorize?response_type=code&client_id="+clientID+"&redirect_uri=http://localhost:8080/drive-service/rest/DropBox/Response";
	return "L'authentification a ete demander par " + auth + " <a href="+ url+">CLIQUE ICI SALOPE !</a>";
	}
	
	//This method is called if HTML is request
	@Path("/Response")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String dorpBoxDriveResponse(@QueryParam("code") String code ) {
	code_ = code;
	System.out.println(code_);
	return "L'authentification a ete effectue avec succes ! Pour accéder a tes fichiers de ton google drive bah va sur ton drive ! " +"\n";
	}
	
//	@Path("/Post")
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	public String uploadFile(){
//		
//	}

}
