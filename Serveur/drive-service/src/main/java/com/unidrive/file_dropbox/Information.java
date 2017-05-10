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
"used",
"allocation"
})
public class Information {

@JsonProperty("used")
private String used;
@JsonProperty("allocation")
private Allocation allocation;

@JsonProperty("used")
public String getUsed() {
return used;
}

@JsonProperty("used")
public void setUsed(String used) {
this.used = used;
}

@JsonProperty("allocation")
public Allocation getAllocation() {
return allocation;
}

@JsonProperty("allocation")
public void setAllocation(Allocation allocation) {
this.allocation = allocation;
}


}