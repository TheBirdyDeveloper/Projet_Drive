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
"id",
"backgroundImageLink",
"colorRgb"
})
public class TeamDriveTheme {

@JsonProperty("id")
private String id;
@JsonProperty("backgroundImageLink")
private String backgroundImageLink;
@JsonProperty("colorRgb")
private String colorRgb;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("backgroundImageLink")
public String getBackgroundImageLink() {
return backgroundImageLink;
}

@JsonProperty("backgroundImageLink")
public void setBackgroundImageLink(String backgroundImageLink) {
this.backgroundImageLink = backgroundImageLink;
}

@JsonProperty("colorRgb")
public String getColorRgb() {
return colorRgb;
}

@JsonProperty("colorRgb")
public void setColorRgb(String colorRgb) {
this.colorRgb = colorRgb;
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