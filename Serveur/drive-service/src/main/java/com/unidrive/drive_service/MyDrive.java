package com.unidrive.drive_service;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;



@Path("/googleDrive")
public class MyDrive {
	private static String code_;
	private final static String clientID = "559854928491-b84f4ejfdhooej6rmqcvqfo4gsiveph1.apps.googleusercontent.com";
	private static ClientGoogle client = new ClientGoogle();
	
	//This method is called if HTML is request
	@Path("/OAuth")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String googleDriveAuth(@QueryParam("auth") String auth) {
	String url = "https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/drive&access_type=offline&redirect_uri=http://localhost:8080/drive-service/rest/googleDrive/Response&response_type=code&client_id="+clientID;
	return "L'authentification a ete demander par " + auth + " <a href="+ url+">CLIQUE ICI SALOPE !</a>";
	}
	
	//This method is called if HTML is request
	@Path("/Response")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ListFileTranslator googleDriveResponse(@QueryParam("code") String code) {
	code_ = code;
	client.getToken(code_);  
	ListFileTranslator liste = client.getFiles("root");
	return liste;
	}
	
	@Path("/Get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ListFileTranslator getChildren(@QueryParam("rep") String rep){
	ListFileTranslator liste = client.getFiles(rep);
	return liste;
	}
	
//	@Path("/Post")
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	public String uploadFile(){
//		
//	}
	
}
