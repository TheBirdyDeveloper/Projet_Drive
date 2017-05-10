package com.unidrive.file_dropbox;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
".tag"
})
public class Visibility {

@JsonProperty(".tag")
private String tag;

@JsonProperty(".tag")
public String getTag() {
return tag;
}

@JsonProperty(".tag")
public void setTag(String tag) {
this.tag = tag;
}

}