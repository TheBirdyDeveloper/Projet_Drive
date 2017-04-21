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
"id",
"selfLink",
"childLink"
})
public class Child {

@JsonProperty("kind")
private String kind;
@JsonProperty("id")
private String id;
@JsonProperty("selfLink")
private String selfLink;
@JsonProperty("childLink")
private String childLink;
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

@JsonProperty("childLink")
public String getChildLink() {
return childLink;
}

@JsonProperty("childLink")
public void setChildLink(String childLink) {
this.childLink = childLink;
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