
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
    "canAddChildren",
    "canComment",
    "canCopy",
    "canDelete",
    "canDownload",
    "canEdit",
    "canListChildren",
    "canMoveItemIntoTeamDrive",
    "canMoveTeamDriveItem",
    "canReadRevisions",
    "canReadTeamDrive",
    "canRemoveChildren",
    "canRename",
    "canShare",
    "canTrash",
    "canUntrash"
})
public class Capabilities {

    @JsonProperty("canAddChildren")
    private String canAddChildren;
    @JsonProperty("canComment")
    private String canComment;
    @JsonProperty("canCopy")
    private String canCopy;
    @JsonProperty("canDelete")
    private String canDelete;
    @JsonProperty("canDownload")
    private String canDownload;
    @JsonProperty("canEdit")
    private String canEdit;
    @JsonProperty("canListChildren")
    private String canListChildren;
    @JsonProperty("canMoveItemIntoTeamDrive")
    private String canMoveItemIntoTeamDrive;
    @JsonProperty("canMoveTeamDriveItem")
    private String canMoveTeamDriveItem;
    @JsonProperty("canReadRevisions")
    private String canReadRevisions;
    @JsonProperty("canReadTeamDrive")
    private String canReadTeamDrive;
    @JsonProperty("canRemoveChildren")
    private String canRemoveChildren;
    @JsonProperty("canRename")
    private String canRename;
    @JsonProperty("canShare")
    private String canShare;
    @JsonProperty("canTrash")
    private String canTrash;
    @JsonProperty("canUntrash")
    private String canUntrash;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("canAddChildren")
    public String getCanAddChildren() {
        return canAddChildren;
    }

    @JsonProperty("canAddChildren")
    public void setCanAddChildren(String canAddChildren) {
        this.canAddChildren = canAddChildren;
    }

    @JsonProperty("canComment")
    public String getCanComment() {
        return canComment;
    }

    @JsonProperty("canComment")
    public void setCanComment(String canComment) {
        this.canComment = canComment;
    }

    @JsonProperty("canCopy")
    public String getCanCopy() {
        return canCopy;
    }

    @JsonProperty("canCopy")
    public void setCanCopy(String canCopy) {
        this.canCopy = canCopy;
    }

    @JsonProperty("canDelete")
    public String getCanDelete() {
        return canDelete;
    }

    @JsonProperty("canDelete")
    public void setCanDelete(String canDelete) {
        this.canDelete = canDelete;
    }

    @JsonProperty("canDownload")
    public String getCanDownload() {
        return canDownload;
    }

    @JsonProperty("canDownload")
    public void setCanDownload(String canDownload) {
        this.canDownload = canDownload;
    }

    @JsonProperty("canEdit")
    public String getCanEdit() {
        return canEdit;
    }

    @JsonProperty("canEdit")
    public void setCanEdit(String canEdit) {
        this.canEdit = canEdit;
    }

    @JsonProperty("canListChildren")
    public String getCanListChildren() {
        return canListChildren;
    }

    @JsonProperty("canListChildren")
    public void setCanListChildren(String canListChildren) {
        this.canListChildren = canListChildren;
    }

    @JsonProperty("canMoveItemIntoTeamDrive")
    public String getCanMoveItemIntoTeamDrive() {
        return canMoveItemIntoTeamDrive;
    }

    @JsonProperty("canMoveItemIntoTeamDrive")
    public void setCanMoveItemIntoTeamDrive(String canMoveItemIntoTeamDrive) {
        this.canMoveItemIntoTeamDrive = canMoveItemIntoTeamDrive;
    }

    @JsonProperty("canMoveTeamDriveItem")
    public String getCanMoveTeamDriveItem() {
        return canMoveTeamDriveItem;
    }

    @JsonProperty("canMoveTeamDriveItem")
    public void setCanMoveTeamDriveItem(String canMoveTeamDriveItem) {
        this.canMoveTeamDriveItem = canMoveTeamDriveItem;
    }

    @JsonProperty("canReadRevisions")
    public String getCanReadRevisions() {
        return canReadRevisions;
    }

    @JsonProperty("canReadRevisions")
    public void setCanReadRevisions(String canReadRevisions) {
        this.canReadRevisions = canReadRevisions;
    }

    @JsonProperty("canReadTeamDrive")
    public String getCanReadTeamDrive() {
        return canReadTeamDrive;
    }

    @JsonProperty("canReadTeamDrive")
    public void setCanReadTeamDrive(String canReadTeamDrive) {
        this.canReadTeamDrive = canReadTeamDrive;
    }

    @JsonProperty("canRemoveChildren")
    public String getCanRemoveChildren() {
        return canRemoveChildren;
    }

    @JsonProperty("canRemoveChildren")
    public void setCanRemoveChildren(String canRemoveChildren) {
        this.canRemoveChildren = canRemoveChildren;
    }

    @JsonProperty("canRename")
    public String getCanRename() {
        return canRename;
    }

    @JsonProperty("canRename")
    public void setCanRename(String canRename) {
        this.canRename = canRename;
    }

    @JsonProperty("canShare")
    public String getCanShare() {
        return canShare;
    }

    @JsonProperty("canShare")
    public void setCanShare(String canShare) {
        this.canShare = canShare;
    }

    @JsonProperty("canTrash")
    public String getCanTrash() {
        return canTrash;
    }

    @JsonProperty("canTrash")
    public void setCanTrash(String canTrash) {
        this.canTrash = canTrash;
    }

    @JsonProperty("canUntrash")
    public String getCanUntrash() {
        return canUntrash;
    }

    @JsonProperty("canUntrash")
    public void setCanUntrash(String canUntrash) {
        this.canUntrash = canUntrash;
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
