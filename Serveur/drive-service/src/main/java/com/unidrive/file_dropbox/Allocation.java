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
".tag",
"allocated"
})
public class Allocation {

@JsonProperty(".tag")
private String tag;
@JsonProperty("allocated")
private String allocated;

@JsonProperty(".tag")
public String getTag() {
return tag;
}

@JsonProperty(".tag")
public void setTag(String tag) {
this.tag = tag;
}

@JsonProperty("allocated")
public String getAllocated() {
return allocated;
}

@JsonProperty("allocated")
public void setAllocated(String allocated) {
this.allocated = allocated;
}

}