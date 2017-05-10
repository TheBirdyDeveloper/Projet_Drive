
package com.unidrive.file_google_drive;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "roleSets"
})
public class AdditionalRoleInfo {

    @JsonProperty("type")
    private String type;
    @JsonProperty("roleSets")
    private List<RoleSet> roleSets = null;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("roleSets")
    public List<RoleSet> getRoleSets() {
        return roleSets;
    }

    @JsonProperty("roleSets")
    public void setRoleSets(List<RoleSet> roleSets) {
        this.roleSets = roleSets;
    }

}
