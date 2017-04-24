
package com.unidrive.file_google_drive;

import java.util.HashMap;
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
    "displayName",
    "picture",
    "isAuthenticatedUser",
    "permissionId",
    "emailAddress"
})
public class TrashingUser {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("picture")
    private Picture___ picture;
    @JsonProperty("isAuthenticatedUser")
    private String isAuthenticatedUser;
    @JsonProperty("permissionId")
    private String permissionId;
    @JsonProperty("emailAddress")
    private String emailAddress;
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

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("picture")
    public Picture___ getPicture() {
        return picture;
    }

    @JsonProperty("picture")
    public void setPicture(Picture___ picture) {
        this.picture = picture;
    }

    @JsonProperty("isAuthenticatedUser")
    public String getIsAuthenticatedUser() {
        return isAuthenticatedUser;
    }

    @JsonProperty("isAuthenticatedUser")
    public void setIsAuthenticatedUser(String isAuthenticatedUser) {
        this.isAuthenticatedUser = isAuthenticatedUser;
    }

    @JsonProperty("permissionId")
    public String getPermissionId() {
        return permissionId;
    }

    @JsonProperty("permissionId")
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
