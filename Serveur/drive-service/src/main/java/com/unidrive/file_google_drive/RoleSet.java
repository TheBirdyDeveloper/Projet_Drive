
package com.unidrive.file_google_drive;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryRole",
    "additionalRoles"
})
public class RoleSet {

    @JsonProperty("primaryRole")
    private String primaryRole;
    @JsonProperty("additionalRoles")
    private List<String> additionalRoles = null;

    @JsonProperty("primaryRole")
    public String getPrimaryRole() {
        return primaryRole;
    }

    @JsonProperty("primaryRole")
    public void setPrimaryRole(String primaryRole) {
        this.primaryRole = primaryRole;
    }

    @JsonProperty("additionalRoles")
    public List<String> getAdditionalRoles() {
        return additionalRoles;
    }

    @JsonProperty("additionalRoles")
    public void setAdditionalRoles(List<String> additionalRoles) {
        this.additionalRoles = additionalRoles;
    }

}
