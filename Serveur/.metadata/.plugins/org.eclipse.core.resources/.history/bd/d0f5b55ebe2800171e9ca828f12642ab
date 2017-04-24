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
"etag",
"selfLink",
"key",
"visibility",
"value"
})

public class Properties {
	@JsonProperty("kind")
	private String kind;
	@JsonProperty("etag")
	private String etag;
	@JsonProperty("selfLink")
	private String selfLink;
	@JsonProperty("key")
	private String key;
	@JsonProperty("visibility")
	private String visibility;
	@JsonProperty("value")
	private String value;
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

	@JsonProperty("selfLink")
	public String getSelfLink() {
	return selfLink;
	}

	@JsonProperty("selfLink")
	public void setSelfLink(String selfLink) {
	this.selfLink = selfLink;
	}

	@JsonProperty("key")
	public String getKey() {
	return key;
	}

	@JsonProperty("key")
	public void setKey(String key) {
	this.key = key;
	}

	@JsonProperty("visibility")
	public String getVisibility() {
	return visibility;
	}

	@JsonProperty("visibility")
	public void setVisibility(String visibility) {
	this.visibility = visibility;
	}

	@JsonProperty("value")
	public String getValue() {
	return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
	this.value = value;
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
