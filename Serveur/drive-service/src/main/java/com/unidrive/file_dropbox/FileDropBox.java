package com.unidrive.file_dropbox;

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
"size",
"hash",
"bytes",
"thumb_exists",
"rev",
"modified",
"path",
"is_dir",
"icon",
"root",
"contents",
"client_mtime",
"mime_type",
"revision"
})
public class FileDropBox {

@JsonProperty("size")
private String size;
@JsonProperty("hash")
private String hash;
@JsonProperty("bytes")
private Integer bytes;
@JsonProperty("thumb_exists")
private Boolean thumbExists;
@JsonProperty("rev")
private String rev;
@JsonProperty("modified")
private String modified;
@JsonProperty("path")
private String path;
@JsonProperty("is_dir")
private Boolean isDir;
@JsonProperty("icon")
private String icon;
@JsonProperty("root")
private String root;
@JsonProperty("contents")
private List<FileDropBox> contents = null;
@JsonProperty("client_mtime")
private String clientMtime;
@JsonProperty("mime_type")
private String mimeType;
@JsonProperty("revision")
private Integer revision;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("size")
public String getSize() {
return size;
}

@JsonProperty("size")
public void setSize(String size) {
this.size = size;
}

@JsonProperty("hash")
public String getHash() {
return hash;
}

@JsonProperty("hash")
public void setHash(String hash) {
this.hash = hash;
}

@JsonProperty("bytes")
public Integer getBytes() {
return bytes;
}

@JsonProperty("bytes")
public void setBytes(Integer bytes) {
this.bytes = bytes;
}

@JsonProperty("thumb_exists")
public Boolean getThumbExists() {
return thumbExists;
}

@JsonProperty("thumb_exists")
public void setThumbExists(Boolean thumbExists) {
this.thumbExists = thumbExists;
}

@JsonProperty("rev")
public String getRev() {
return rev;
}

@JsonProperty("rev")
public void setRev(String rev) {
this.rev = rev;
}

@JsonProperty("modified")
public String getModified() {
return modified;
}

@JsonProperty("modified")
public void setModified(String modified) {
this.modified = modified;
}

@JsonProperty("path")
public String getPath() {
return path;
}

@JsonProperty("path")
public void setPath(String path) {
this.path = path;
}

@JsonProperty("is_dir")
public Boolean getIsDir() {
return isDir;
}

@JsonProperty("is_dir")
public void setIsDir(Boolean isDir) {
this.isDir = isDir;
}

@JsonProperty("icon")
public String getIcon() {
return icon;
}

@JsonProperty("icon")
public void setIcon(String icon) {
this.icon = icon;
}

@JsonProperty("root")
public String getRoot() {
return root;
}

@JsonProperty("root")
public void setRoot(String root) {
this.root = root;
}

@JsonProperty("contents")
public List<FileDropBox> getContents() {
return contents;
}

@JsonProperty("contents")
public void setContents(List<FileDropBox> contents) {
this.contents = contents;
}

@JsonProperty("client_mtime")
public String getClientMtime() {
return clientMtime;
}

@JsonProperty("client_mtime")
public void setClientMtime(String clientMtime) {
this.clientMtime = clientMtime;
}

@JsonProperty("mime_type")
public String getMimeType() {
return mimeType;
}

@JsonProperty("mime_type")
public void setMimeType(String mimeType) {
this.mimeType = mimeType;
}

@JsonProperty("revision")
public Integer getRevision() {
return revision;
}

@JsonProperty("revision")
public void setRevision(Integer revision) {
this.revision = revision;
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