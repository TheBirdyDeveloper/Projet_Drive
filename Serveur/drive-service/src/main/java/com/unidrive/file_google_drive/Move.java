package com.unidrive.file_google_drive;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"parents"
})
public class Move {

@JsonProperty("parents")
private List<Parent> parents = null;

@JsonProperty("parents")
public List<Parent> getParents() {
return parents;
}

@JsonProperty("parents")
public void setParents(List<Parent> parents) {
this.parents = parents;
}

}