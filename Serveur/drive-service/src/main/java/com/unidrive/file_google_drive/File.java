
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
    "id",
    "etag",
    "selfLink",
    "webContentLink",
    "webViewLink",
    "alternateLink",
    "embedLink",
    "openWithLinks",
    "defaultOpenWithLink",
    "iconLink",
    "hasThumbnail",
    "thumbnailLink",
    "thumbnailVersion",
    "thumbnail",
    "title",
    "mimeType",
    "description",
    "labels",
    "createdDate",
    "modifiedDate",
    "modifiedByMeDate",
    "lastViewedByMeDate",
    "markedViewedByMeDate",
    "sharedWithMeDate",
    "version",
    "sharingUser",
    "parents",
    "downloadUrl",
    "exportLinks",
    "indexableText",
    "userPermission",
    "permissions",
    "hasAugmentedPermissions",
    "originalFilename",
    "fileExtension",
    "fullFileExtension",
    "md5Checksum",
    "fileSize",
    "quotabytesUsed",
    "ownerNames",
    "owners",
    "teamDriveId",
    "lastModifyingUserName",
    "lastModifyingUser",
    "ownedByMe",
    "capabilities",
    "editable",
    "canComment",
    "canReadRevisions",
    "shareable",
    "copyable",
    "writersCanShare",
    "shared",
    "explicitlyTrashed",
    "trashingUser",
    "trashedDate",
    "appDataContents",
    "headRevisionId",
    "properties",
    "folderColorRgb",
    "imageMediaMetadata",
    "videoMediaMetadata",
    "spaces",
    "isAppAuthorized"
})
public class File {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("id")
    private String id;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonProperty("webContentLink")
    private String webContentLink;
    @JsonProperty("webViewLink")
    private String webViewLink;
    @JsonProperty("alternateLink")
    private String alternateLink;
    @JsonProperty("embedLink")
    private String embedLink;
    @JsonProperty("openWithLinks")
    private OpenWithLinks openWithLinks;
    @JsonProperty("defaultOpenWithLink")
    private String defaultOpenWithLink;
    @JsonProperty("iconLink")
    private String iconLink;
    @JsonProperty("hasThumbnail")
    private String hasThumbnail;
    @JsonProperty("thumbnailLink")
    private String thumbnailLink;
    @JsonProperty("thumbnailVersion")
    private String thumbnailVersion;
    @JsonProperty("thumbnail")
    private Thumbnail thumbnail;
    @JsonProperty("title")
    private String title;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("labels")
    private Labels labels;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("modifiedByMeDate")
    private String modifiedByMeDate;
    @JsonProperty("lastViewedByMeDate")
    private String lastViewedByMeDate;
    @JsonProperty("markedViewedByMeDate")
    private String markedViewedByMeDate;
    @JsonProperty("sharedWithMeDate")
    private String sharedWithMeDate;
    @JsonProperty("version")
    private String version;
    @JsonProperty("sharingUser")
    private SharingUser sharingUser;
    @JsonProperty("parents")
    private List<Parents> parents = null;
    @JsonProperty("downloadUrl")
    private String downloadUrl;
    @JsonProperty("exportLinks")
    private ExportLinks exportLinks;
    @JsonProperty("indexableText")
    private IndexableText indexableText;
    @JsonProperty("userPermission")
    private Permissions userPermission;
    @JsonProperty("permissions")
    private List<Permissions> permissions = null;
    @JsonProperty("hasAugmentedPermissions")
    private String hasAugmentedPermissions;
    @JsonProperty("originalFilename")
    private String originalFilename;
    @JsonProperty("fileExtension")
    private String fileExtension;
    @JsonProperty("fullFileExtension")
    private String fullFileExtension;
    @JsonProperty("md5Checksum")
    private String md5Checksum;
    @JsonProperty("fileSize")
    private String fileSize;
    @JsonProperty("quotabytesUsed")
    private String quotabytesUsed;
    @JsonProperty("ownerNames")
    private List<String> ownerNames = null;
    @JsonProperty("owners")
    private List<Owner> owners = null;
    @JsonProperty("teamDriveId")
    private String teamDriveId;
    @JsonProperty("lastModifyingUserName")
    private String lastModifyingUserName;
    @JsonProperty("lastModifyingUser")
    private LastModifyingUser lastModifyingUser;
    @JsonProperty("ownedByMe")
    private String ownedByMe;
    @JsonProperty("capabilities")
    private Capabilities capabilities;
    @JsonProperty("editable")
    private String editable;
    @JsonProperty("canComment")
    private String canComment;
    @JsonProperty("canReadRevisions")
    private String canReadRevisions;
    @JsonProperty("shareable")
    private String shareable;
    @JsonProperty("copyable")
    private String copyable;
    @JsonProperty("writersCanShare")
    private String writersCanShare;
    @JsonProperty("shared")
    private String shared;
    @JsonProperty("explicitlyTrashed")
    private String explicitlyTrashed;
    @JsonProperty("trashingUser")
    private TrashingUser trashingUser;
    @JsonProperty("trashedDate")
    private String trashedDate;
    @JsonProperty("appDataContents")
    private String appDataContents;
    @JsonProperty("headRevisionId")
    private String headRevisionId;
    @JsonProperty("properties")
    private List<Properties> properties = null;
    @JsonProperty("folderColorRgb")
    private String folderColorRgb;
    @JsonProperty("imageMediaMetadata")
    private ImageMediaMetadata imageMediaMetadata;
    @JsonProperty("videoMediaMetadata")
    private VideoMediaMetadata videoMediaMetadata;
    @JsonProperty("spaces")
    private List<String> spaces = null;
    @JsonProperty("isAppAuthorized")
    private String isAppAuthorized;
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

    @JsonProperty("webContentLink")
    public String getWebContentLink() {
        return webContentLink;
    }

    @JsonProperty("webContentLink")
    public void setWebContentLink(String webContentLink) {
        this.webContentLink = webContentLink;
    }

    @JsonProperty("webViewLink")
    public String getWebViewLink() {
        return webViewLink;
    }

    @JsonProperty("webViewLink")
    public void setWebViewLink(String webViewLink) {
        this.webViewLink = webViewLink;
    }

    @JsonProperty("alternateLink")
    public String getAlternateLink() {
        return alternateLink;
    }

    @JsonProperty("alternateLink")
    public void setAlternateLink(String alternateLink) {
        this.alternateLink = alternateLink;
    }

    @JsonProperty("embedLink")
    public String getEmbedLink() {
        return embedLink;
    }

    @JsonProperty("embedLink")
    public void setEmbedLink(String embedLink) {
        this.embedLink = embedLink;
    }

    @JsonProperty("openWithLinks")
    public OpenWithLinks getOpenWithLinks() {
        return openWithLinks;
    }

    @JsonProperty("openWithLinks")
    public void setOpenWithLinks(OpenWithLinks openWithLinks) {
        this.openWithLinks = openWithLinks;
    }

    @JsonProperty("defaultOpenWithLink")
    public String getDefaultOpenWithLink() {
        return defaultOpenWithLink;
    }

    @JsonProperty("defaultOpenWithLink")
    public void setDefaultOpenWithLink(String defaultOpenWithLink) {
        this.defaultOpenWithLink = defaultOpenWithLink;
    }

    @JsonProperty("iconLink")
    public String getIconLink() {
        return iconLink;
    }

    @JsonProperty("iconLink")
    public void setIconLink(String iconLink) {
        this.iconLink = iconLink;
    }

    @JsonProperty("hasThumbnail")
    public String getHasThumbnail() {
        return hasThumbnail;
    }

    @JsonProperty("hasThumbnail")
    public void setHasThumbnail(String hasThumbnail) {
        this.hasThumbnail = hasThumbnail;
    }

    @JsonProperty("thumbnailLink")
    public String getThumbnailLink() {
        return thumbnailLink;
    }

    @JsonProperty("thumbnailLink")
    public void setThumbnailLink(String thumbnailLink) {
        this.thumbnailLink = thumbnailLink;
    }

    @JsonProperty("thumbnailVersion")
    public String getThumbnailVersion() {
        return thumbnailVersion;
    }

    @JsonProperty("thumbnailVersion")
    public void setThumbnailVersion(String thumbnailVersion) {
        this.thumbnailVersion = thumbnailVersion;
    }

    @JsonProperty("thumbnail")
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("labels")
    public Labels getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("modifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("modifiedByMeDate")
    public String getModifiedByMeDate() {
        return modifiedByMeDate;
    }

    @JsonProperty("modifiedByMeDate")
    public void setModifiedByMeDate(String modifiedByMeDate) {
        this.modifiedByMeDate = modifiedByMeDate;
    }

    @JsonProperty("lastViewedByMeDate")
    public String getLastViewedByMeDate() {
        return lastViewedByMeDate;
    }

    @JsonProperty("lastViewedByMeDate")
    public void setLastViewedByMeDate(String lastViewedByMeDate) {
        this.lastViewedByMeDate = lastViewedByMeDate;
    }

    @JsonProperty("markedViewedByMeDate")
    public String getMarkedViewedByMeDate() {
        return markedViewedByMeDate;
    }

    @JsonProperty("markedViewedByMeDate")
    public void setMarkedViewedByMeDate(String markedViewedByMeDate) {
        this.markedViewedByMeDate = markedViewedByMeDate;
    }

    @JsonProperty("sharedWithMeDate")
    public String getSharedWithMeDate() {
        return sharedWithMeDate;
    }

    @JsonProperty("sharedWithMeDate")
    public void setSharedWithMeDate(String sharedWithMeDate) {
        this.sharedWithMeDate = sharedWithMeDate;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("sharingUser")
    public SharingUser getSharingUser() {
        return sharingUser;
    }

    @JsonProperty("sharingUser")
    public void setSharingUser(SharingUser sharingUser) {
        this.sharingUser = sharingUser;
    }

    @JsonProperty("parents")
    public List<Parents> getParents() {
        return parents;
    }

    @JsonProperty("parents")
    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    @JsonProperty("downloadUrl")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    @JsonProperty("downloadUrl")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @JsonProperty("exportLinks")
    public ExportLinks getExportLinks() {
        return exportLinks;
    }

    @JsonProperty("exportLinks")
    public void setExportLinks(ExportLinks exportLinks) {
        this.exportLinks = exportLinks;
    }

    @JsonProperty("indexableText")
    public IndexableText getIndexableText() {
        return indexableText;
    }

    @JsonProperty("indexableText")
    public void setIndexableText(IndexableText indexableText) {
        this.indexableText = indexableText;
    }

    @JsonProperty("userPermission")
    public Permissions getUserPermission() {
        return userPermission;
    }

    @JsonProperty("userPermission")
    public void setUserPermission(Permissions userPermission) {
        this.userPermission = userPermission;
    }

    @JsonProperty("permissions")
    public List<Permissions> getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(List<Permissions> permissions) {
        this.permissions = permissions;
    }

    @JsonProperty("hasAugmentedPermissions")
    public String getHasAugmentedPermissions() {
        return hasAugmentedPermissions;
    }

    @JsonProperty("hasAugmentedPermissions")
    public void setHasAugmentedPermissions(String hasAugmentedPermissions) {
        this.hasAugmentedPermissions = hasAugmentedPermissions;
    }

    @JsonProperty("originalFilename")
    public String getOriginalFilename() {
        return originalFilename;
    }

    @JsonProperty("originalFilename")
    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    @JsonProperty("fileExtension")
    public String getFileExtension() {
        return fileExtension;
    }

    @JsonProperty("fileExtension")
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    @JsonProperty("fullFileExtension")
    public String getFullFileExtension() {
        return fullFileExtension;
    }

    @JsonProperty("fullFileExtension")
    public void setFullFileExtension(String fullFileExtension) {
        this.fullFileExtension = fullFileExtension;
    }

    @JsonProperty("md5Checksum")
    public String getMd5Checksum() {
        return md5Checksum;
    }

    @JsonProperty("md5Checksum")
    public void setMd5Checksum(String md5Checksum) {
        this.md5Checksum = md5Checksum;
    }

    @JsonProperty("fileSize")
    public String getFileSize() {
        return fileSize;
    }

    @JsonProperty("fileSize")
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("quotabytesUsed")
    public String getQuotabytesUsed() {
        return quotabytesUsed;
    }

    @JsonProperty("quotabytesUsed")
    public void setQuotabytesUsed(String quotabytesUsed) {
        this.quotabytesUsed = quotabytesUsed;
    }

    @JsonProperty("ownerNames")
    public List<String> getOwnerNames() {
        return ownerNames;
    }

    @JsonProperty("ownerNames")
    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }

    @JsonProperty("owners")
    public List<Owner> getOwners() {
        return owners;
    }

    @JsonProperty("owners")
    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    @JsonProperty("teamDriveId")
    public String getTeamDriveId() {
        return teamDriveId;
    }

    @JsonProperty("teamDriveId")
    public void setTeamDriveId(String teamDriveId) {
        this.teamDriveId = teamDriveId;
    }

    @JsonProperty("lastModifyingUserName")
    public String getLastModifyingUserName() {
        return lastModifyingUserName;
    }

    @JsonProperty("lastModifyingUserName")
    public void setLastModifyingUserName(String lastModifyingUserName) {
        this.lastModifyingUserName = lastModifyingUserName;
    }

    @JsonProperty("lastModifyingUser")
    public LastModifyingUser getLastModifyingUser() {
        return lastModifyingUser;
    }

    @JsonProperty("lastModifyingUser")
    public void setLastModifyingUser(LastModifyingUser lastModifyingUser) {
        this.lastModifyingUser = lastModifyingUser;
    }

    @JsonProperty("ownedByMe")
    public String getOwnedByMe() {
        return ownedByMe;
    }

    @JsonProperty("ownedByMe")
    public void setOwnedByMe(String ownedByMe) {
        this.ownedByMe = ownedByMe;
    }

    @JsonProperty("capabilities")
    public Capabilities getCapabilities() {
        return capabilities;
    }

    @JsonProperty("capabilities")
    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    @JsonProperty("editable")
    public String getEditable() {
        return editable;
    }

    @JsonProperty("editable")
    public void setEditable(String editable) {
        this.editable = editable;
    }

    @JsonProperty("canComment")
    public String getCanComment() {
        return canComment;
    }

    @JsonProperty("canComment")
    public void setCanComment(String canComment) {
        this.canComment = canComment;
    }

    @JsonProperty("canReadRevisions")
    public String getCanReadRevisions() {
        return canReadRevisions;
    }

    @JsonProperty("canReadRevisions")
    public void setCanReadRevisions(String canReadRevisions) {
        this.canReadRevisions = canReadRevisions;
    }

    @JsonProperty("shareable")
    public String getShareable() {
        return shareable;
    }

    @JsonProperty("shareable")
    public void setShareable(String shareable) {
        this.shareable = shareable;
    }

    @JsonProperty("copyable")
    public String getCopyable() {
        return copyable;
    }

    @JsonProperty("copyable")
    public void setCopyable(String copyable) {
        this.copyable = copyable;
    }

    @JsonProperty("writersCanShare")
    public String getWritersCanShare() {
        return writersCanShare;
    }

    @JsonProperty("writersCanShare")
    public void setWritersCanShare(String writersCanShare) {
        this.writersCanShare = writersCanShare;
    }

    @JsonProperty("shared")
    public String getShared() {
        return shared;
    }

    @JsonProperty("shared")
    public void setShared(String shared) {
        this.shared = shared;
    }

    @JsonProperty("explicitlyTrashed")
    public String getExplicitlyTrashed() {
        return explicitlyTrashed;
    }

    @JsonProperty("explicitlyTrashed")
    public void setExplicitlyTrashed(String explicitlyTrashed) {
        this.explicitlyTrashed = explicitlyTrashed;
    }

    @JsonProperty("trashingUser")
    public TrashingUser getTrashingUser() {
        return trashingUser;
    }

    @JsonProperty("trashingUser")
    public void setTrashingUser(TrashingUser trashingUser) {
        this.trashingUser = trashingUser;
    }

    @JsonProperty("trashedDate")
    public String getTrashedDate() {
        return trashedDate;
    }

    @JsonProperty("trashedDate")
    public void setTrashedDate(String trashedDate) {
        this.trashedDate = trashedDate;
    }

    @JsonProperty("appDataContents")
    public String getAppDataContents() {
        return appDataContents;
    }

    @JsonProperty("appDataContents")
    public void setAppDataContents(String appDataContents) {
        this.appDataContents = appDataContents;
    }

    @JsonProperty("headRevisionId")
    public String getHeadRevisionId() {
        return headRevisionId;
    }

    @JsonProperty("headRevisionId")
    public void setHeadRevisionId(String headRevisionId) {
        this.headRevisionId = headRevisionId;
    }

    @JsonProperty("properties")
    public List<Properties> getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(List<Properties> properties) {
        this.properties = properties;
    }

    @JsonProperty("folderColorRgb")
    public String getFolderColorRgb() {
        return folderColorRgb;
    }

    @JsonProperty("folderColorRgb")
    public void setFolderColorRgb(String folderColorRgb) {
        this.folderColorRgb = folderColorRgb;
    }

    @JsonProperty("imageMediaMetadata")
    public ImageMediaMetadata getImageMediaMetadata() {
        return imageMediaMetadata;
    }

    @JsonProperty("imageMediaMetadata")
    public void setImageMediaMetadata(ImageMediaMetadata imageMediaMetadata) {
        this.imageMediaMetadata = imageMediaMetadata;
    }

    @JsonProperty("videoMediaMetadata")
    public VideoMediaMetadata getVideoMediaMetadata() {
        return videoMediaMetadata;
    }

    @JsonProperty("videoMediaMetadata")
    public void setVideoMediaMetadata(VideoMediaMetadata videoMediaMetadata) {
        this.videoMediaMetadata = videoMediaMetadata;
    }

    @JsonProperty("spaces")
    public List<String> getSpaces() {
        return spaces;
    }

    @JsonProperty("spaces")
    public void setSpaces(List<String> spaces) {
        this.spaces = spaces;
    }

    @JsonProperty("isAppAuthorized")
    public String getIsAppAuthorized() {
        return isAppAuthorized;
    }

    @JsonProperty("isAppAuthorized")
    public void setIsAppAuthorized(String isAppAuthorized) {
        this.isAppAuthorized = isAppAuthorized;
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
