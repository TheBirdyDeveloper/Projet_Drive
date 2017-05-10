package com.unidrive.file_dropbox;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"from_path",
"to_path",
"allow_shared_folder",
"autorename"
})
public class Move {

@JsonProperty("from_path")
private String fromPath;
@JsonProperty("to_path")
private String toPath;
@JsonProperty("allow_shared_folder")
private Boolean allowSharedFolder;
@JsonProperty("autorename")
private Boolean autorename;

@JsonProperty("from_path")
public String getFromPath() {
return fromPath;
}

@JsonProperty("from_path")
public void setFromPath(String fromPath) {
this.fromPath = fromPath;
}

@JsonProperty("to_path")
public String getToPath() {
return toPath;
}

@JsonProperty("to_path")
public void setToPath(String toPath) {
this.toPath = toPath;
}

@JsonProperty("allow_shared_folder")
public Boolean getAllowSharedFolder() {
return allowSharedFolder;
}

@JsonProperty("allow_shared_folder")
public void setAllowSharedFolder(Boolean allowSharedFolder) {
this.allowSharedFolder = allowSharedFolder;
}

@JsonProperty("autorename")
public Boolean getAutorename() {
return autorename;
}

@JsonProperty("autorename")
public void setAutorename(Boolean autorename) {
this.autorename = autorename;
}

}
