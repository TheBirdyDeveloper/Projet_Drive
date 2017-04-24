
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
    "starred",
    "hidden",
    "trashed",
    "restricted",
    "viewed",
    "modified"
})
public class Labels {

    @JsonProperty("starred")
    private String starred;
    @JsonProperty("hidden")
    private String hidden;
    @JsonProperty("trashed")
    private String trashed;
    @JsonProperty("restricted")
    private String restricted;
    @JsonProperty("viewed")
    private String viewed;
    @JsonProperty("modified")
    private String modified;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("starred")
    public String getStarred() {
        return starred;
    }

    @JsonProperty("starred")
    public void setStarred(String starred) {
        this.starred = starred;
    }

    @JsonProperty("hidden")
    public String getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    @JsonProperty("trashed")
    public String getTrashed() {
        return trashed;
    }

    @JsonProperty("trashed")
    public void setTrashed(String trashed) {
        this.trashed = trashed;
    }

    @JsonProperty("restricted")
    public String getRestricted() {
        return restricted;
    }

    @JsonProperty("restricted")
    public void setRestricted(String restricted) {
        this.restricted = restricted;
    }

    @JsonProperty("viewed")
    public String getViewed() {
        return viewed;
    }

    @JsonProperty("viewed")
    public void setViewed(String viewed) {
        this.viewed = viewed;
    }

    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
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
