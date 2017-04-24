package com.unidrive.drive_service;

public class TrackToken {
	
	private String access_token;
	private int expires_in;
	private String token_type;
	private String refresh_token;
	private String token_refresh;
	private String account_id;
	private String uid;
	
	public String getUid() {
		return uid;
	}



	public void setUid(String uid) {
		this.uid = uid;
	}



	public String getAccount_id() {
		return account_id;
	}



	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}



	public String getRefresh_token() {
		if(refresh_token == null){
			refresh_token = token_refresh;
		}
		return refresh_token;
	}



	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}



	public String getAccess_token() {
		return access_token;
	}



	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}



	public int getExpires_in() {
		return expires_in;
	}



	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}



	public String getToken_type() {
		return token_type;
	}



	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}



	public String getToken_refresh() {
		if(token_refresh == null){
			token_refresh = refresh_token;
		}
		return refresh_token;
	}



	public void setToken_refresh(String token_refresh) {
		this.refresh_token = token_refresh;
	}


	
	public String toString() {
		return "[token=" + access_token + ", expires=" + expires_in +", type=" +token_type +", refresh=" +this.getRefresh_token()+", account_id="+ account_id+", uid="+uid + "]";
	}
}
