package com.unidrive.drive_service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/DropBox")
public class DropBox {
	private static String code_;
	private static ClientDropBox client = new ClientDropBox();
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
	@Produces(MediaType.APPLICATION_JSON)
	public ListFileTranslator dorpBoxDriveResponse(@QueryParam("code") String code ) {
	code_ = code;
	client.getToken(code_);
	return client.getFiles("");
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