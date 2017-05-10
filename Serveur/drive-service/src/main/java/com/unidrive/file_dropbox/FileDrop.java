package com.unidrive.file_dropbox;

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
"path",
"mode",
"autorename",
"mute"
})
public class FileDrop {

@JsonProperty("path")
private String path;
@JsonProperty("mode")
private String mode;
@JsonProperty("autorename")
private Boolean autorename;
@JsonProperty("mute")
private Boolean mute;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("path")
public String getPath() {
return path;
}

@JsonProperty("path")
public void setPath(String path) {
this.path = path;
}

@JsonProperty("mode")
public String getMode() {
return mode;
}

@JsonProperty("mode")
public void setMode(String mode) {
this.mode = mode;
}

@JsonProperty("autorename")
public Boolean getAutorename() {
return autorename;
}

@JsonProperty("autorename")
public void setAutorename(Boolean autorename) {
this.autorename = autorename;
}

@JsonProperty("mute")
public Boolean getMute() {
return mute;
}

@JsonProperty("mute")
public void setMute(Boolean mute) {
this.mute = mute;
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