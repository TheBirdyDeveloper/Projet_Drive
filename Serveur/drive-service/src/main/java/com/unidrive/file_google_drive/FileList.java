
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
"selfLink",
"nextPageToken",
"nextLink",
"incompleteSearch",
"items"
})
public class FileList {

@JsonProperty("kind")
private String kind;
@JsonProperty("etag")
private String etag;
@JsonProperty("selfLink")
private String selfLink;
@JsonProperty("nextPageToken")
private String nextPageToken;
@JsonProperty("nextLink")
private String nextLink;
@JsonProperty("incompleteSearch")
private Boolean incompleteSearch;
@JsonProperty("items")
private List<File> items = null;
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

@JsonProperty("nextPageToken")
public String getNextPageToken() {
return nextPageToken;
}

@JsonProperty("nextPageToken")
public void setNextPageToken(String nextPageToken) {
this.nextPageToken = nextPageToken;
}

@JsonProperty("nextLink")
public String getNextLink() {
return nextLink;
}

@JsonProperty("nextLink")
public void setNextLink(String nextLink) {
this.nextLink = nextLink;
}

@JsonProperty("incompleteSearch")
public Boolean getIncompleteSearch() {
return incompleteSearch;
}

@JsonProperty("incompleteSearch")
public void setIncompleteSearch(Boolean incompleteSearch) {
this.incompleteSearch = incompleteSearch;
}

@JsonProperty("items")
public List<File> getItems() {
return items;
}

@JsonProperty("items")
public void setItems(List<File> items) {
this.items = items;
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