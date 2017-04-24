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
"teamDrivePermissionType",
"role",
"additionalRoles",
"inheritedFrom",
"inherited"
})
public class TeamDrivePermissionDetail {
	@JsonProperty("teamDrivePermissionType")
	private String teamDrivePermissionType;
	@JsonProperty("role")
	private String role;
	@JsonProperty("additionalRoles")
	private List<String> additionalRoles = null;
	@JsonProperty("inheritedFrom")
	private String inheritedFrom;
	@JsonProperty("inherited")
	private String inherited;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("teamDrivePermissionType")
	public String getTeamDrivePermissionType() {
	return teamDrivePermissionType;
	}

	@JsonProperty("teamDrivePermissionType")
	public void setTeamDrivePermissionType(String teamDrivePermissionType) {
	this.teamDrivePermissionType = teamDrivePermissionType;
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

	@JsonProperty("inheritedFrom")
	public String getInheritedFrom() {
	return inheritedFrom;
	}

	@JsonProperty("inheritedFrom")
	public void setInheritedFrom(String inheritedFrom) {
	this.inheritedFrom = inheritedFrom;
	}

	@JsonProperty("inherited")
	public String getInherited() {
	return inherited;
	}

	@JsonProperty("inherited")
	public void setInherited(String inherited) {
	this.inherited = inherited;
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
