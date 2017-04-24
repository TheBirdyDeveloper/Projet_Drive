package com.unidrive.drive_service;

import java.util.ArrayList;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.MultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;
import com.unidrive.file_dropbox.FileDropBox;
import com.unidrive.file_google_drive.ChildList;
import com.unidrive.file_google_drive.File;

public class ClientDropBox {
	private static Client client = Client.create();
	private static ObjectMapper mapper = new ObjectMapper();
	private static WebResource webResource;
	private static ClientResponse response;
	private static TrackToken token_ = new TrackToken();
	private final static String clientID = "p8ohrm26izkscws";
	private final static String clientSecret = "ovydv03up9b2zj7";
	
	
	public ListFileTranslator getFiles(String rep){
		FileDropBox liste = new FileDropBox();
		ListFileTranslator listeFT = new ListFileTranslator();
		try {
			webResource = client
			   .resource("https://api.dropboxapi.com/1/metadata/auto/"+rep+"?access_token="+token_.getAccess_token());
			
			response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

			String output = response.getEntity(String.class);
			//System.out.println(output);
			liste= mapper.readValue(output, FileDropBox.class);
			
			//System.out.println("Output from Server .... \n");
			if(liste.getContents() != null){
				for(int i = 0; i <liste.getContents().size();i++){
					FileDropBox current = liste.getContents().get(i);
					FileTranslator currentFT = new FileTranslator();
					currentFT.setName(current.getPath().substring(1, current.getPath().length()));
					if(current.getIsDir()){
						currentFT.setType("folder");
					}else{
						currentFT.setType("file");
					}
					currentFT.setDrive(new ArrayList<String>());
					listeFT.add(currentFT);
				}
			}
			
		  } catch (Exception e) {

			e.printStackTrace();

		  }
		return listeFT;
	}
	public void getToken(String code){
		try{
			WebResource webResource = client
					   .resource("https://api.dropboxapi.com/1/oauth2/token");

			MultivaluedMap<String,String> formData = new MultivaluedMapImpl();
			formData.add("code", code);
			formData.add("client_id", clientID);
			formData.add("client_secret", clientSecret);
			formData.add("redirect_uri","http://localhost:8080/drive-service/rest/DropBox/Response" );
			formData.add("grant_type", "authorization_code");
			ClientResponse response = webResource
			    .type(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
			    .post(ClientResponse.class, formData);
			String output = response.getEntity(String.class);
			token_= mapper.readValue(output, TrackToken.class);
			//System.out.println(token_);
			
			
		}catch (Exception e) {

			e.printStackTrace();

		  }
	}
	
	public void createFile(){
		try{
			WebResource webResource = client
					   .resource("https://www.googleapis.com/upload/drive/v2/files?access_token="+token_.getAccess_token()+"&upload_Type=multipart");
			java.io.File fileContent = new java.io.File("C:/Users/Mehidine/Desktop/cc.txt");
			java.io.File fileMeta = new java.io.File("C:/Users/Mehidine/Desktop/file.json");
			//MultiPart multipart = new MultiPart(MediaType.MULTIPART_FORM_DATA_TYPE);
			FileDataBodyPart fileDataBodyPart = new FileDataBodyPart("file",
					fileContent,
	                MediaType.APPLICATION_OCTET_STREAM_TYPE);
			
	        fileDataBodyPart.setContentDisposition(
	                FormDataContentDisposition.name("file")
	                        .fileName(fileContent.getName()).build());
	        
	        File file =  new File();
			   
		    file.setTitle("coucou");
		    file.setDescription("test");
		    file.setMimeType("text/plain");
		    
		    mapper.writeValue(fileMeta, file);
			
	        MultiPart multipart = new FormDataMultiPart()
	        		.field("metadata", fileMeta, MediaType.APPLICATION_JSON_TYPE)
	        		.bodyPart(fileDataBodyPart);
	        multipart.setMediaType(MediaType.MULTIPART_FORM_DATA_TYPE);
		    
		   
		    
		    
			response = webResource
			    .type(MediaType.MULTIPART_FORM_DATA_TYPE).post(ClientResponse.class, multipart);
			String output = response.getEntity(String.class);
			System.out.println(output);
			
			
		}catch (Exception e) {

			e.printStackTrace();

		  }
	}
}