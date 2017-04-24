package com.unidrive.file_google_drive;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"kind",
"etag",
"id",
"selfLink",
"name",
"emailAddress",
"domain",
"role",
"additionalRoles",
"type",
"value",
"authKey",
"withLink",
"photoLink",
"expirationDate",
"teamDrivePermissionDetails"
})

public class Permissions {
	@JsonProperty("kind")
	private String kind;
	@JsonProperty("etag")
	private String etag;
	@JsonProperty("id")
	private String id;
	@JsonProperty("selfLink")
	private String selfLink;
	@JsonProperty("name")
	private String name;
	@JsonProperty("emailAddress")
	private String emailAddress;
	@JsonProperty("domain")
	private String domain;
	@JsonProperty("role")
	private String role;
	@JsonProperty("additionalRoles")
	private List<String> additionalRoles = null;
	@JsonProperty("type")
	private String type;
	@JsonProperty("value")
	private String value;
	@JsonProperty("authKey")
	private String authKey;
	@JsonProperty("withLink")
	private String withLink;
	@JsonProperty("photoLink")
	private String photoLink;
	@JsonProperty("expirationDate")
	private String expirationDate;
	@JsonProperty("teamDrivePermissionDetails")
	private List<TeamDrivePermissionDetail> teamDrivePermissionDetails = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("kind")
	public String getKind() {
	return kind;
	}

	@JsonProperty("kind")
	public void setKind(String kind) {
	this.kind = kind;
	}

	@JsonProperty("etag")
	public String getEtag() {
	return etag;
	}

	@JsonProperty("etag")
	public void setEtag(String etag) {
	this.etag = etag;
	}

	@JsonProperty("id")
	public String getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
	this.id = id;
	}

	@JsonProperty("selfLink")
	public String getSelfLink() {
	return selfLink;
	}

	@JsonProperty("selfLink")
	public void setSelfLink(String selfLink) {
	this.selfLink = selfLink;
	}

	@JsonProperty("name")
	public String getName() {
	return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
	this.name = name;
	}

	@JsonProperty("emailAddress")
	public String getEmailAddress() {
	return emailAddress;
	}

	@JsonProperty("emailAddress")
	public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
	}

	@JsonProperty("domain")
	public String getDomain() {
	return domain;
	}

	@JsonProperty("domain")
	public void setDomain(String domain) {
	this.domain = domain;
	}

	@JsonProperty("role")
	public String getRole() {
	return role;
	}

	@JsonProperty("role")
	public void setRole(String role) {
	this.role = role;
	}

	@JsonProperty("additionalRoles")
	public List<String> getAdditionalRoles() {
	return additionalRoles;
	}

	@JsonProperty("additionalRoles")
	public void setAdditionalRoles(List<String> additionalRoles) {
	this.additionalRoles = additionalRoles;
	}

	@JsonProperty("type")
	public String getType() {
	return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
	this.type = type;
	}

	@JsonProperty("value")
	public String getValue() {
	return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
	this.value = value;
	}

	@JsonProperty("authKey")
	public String getAuthKey() {
	return authKey;
	}

	@JsonProperty("authKey")
	public void setAuthKey(String authKey) {
	this.authKey = authKey;
	}

	@JsonProperty("withLink")
	public String getWithLink() {
	return withLink;
	}

	@JsonProperty("withLink")
	public void setWithLink(String withLink) {
	this.withLink = withLink;
	}

	@JsonProperty("photoLink")
	public String getPhotoLink() {
	return photoLink;
	}

	@JsonProperty("photoLink")
	public void setPhotoLink(String photoLink) {
	this.photoLink = photoLink;
	}

	@JsonProperty("expirationDate")
	public String getExpirationDate() {
	return expirationDate;
	}

	@JsonProperty("expirationDate")
	public void setExpirationDate(String expirationDate) {
	this.expirationDate = expirationDate;
	}

	@JsonProperty("teamDrivePermissionDetails")
	public List<TeamDrivePermissionDetail> getTeamDrivePermissionDetails() {
	return teamDrivePermissionDetails;
	}

	@JsonProperty("teamDrivePermissionDetails")
	public void setTeamDrivePermissionDetails(List<TeamDrivePermissionDetail> teamDrivePermissionDetails) {
	this.teamDrivePermissionDetails = teamDrivePermissionDetails;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

}
