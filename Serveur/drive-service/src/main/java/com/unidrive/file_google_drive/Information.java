
package com.unidrive.file_google_drive;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kind",
    "etag",
    "selfLink",
    "name",
    "user",
    "quotaBytesTotal",
    "quotaBytesUsed",
    "quotaBytesUsedAggregate",
    "quotaBytesUsedInTrash",
    "quotaType",
    "quotaBytesByService",
    "largestChangeId",
    "remainingChangeIds",
    "rootFolderId",
    "domainSharingPolicy",
    "permissionId",
    "importFormats",
    "exportFormats",
    "additionalRoleInfo",
    "features",
    "maxUploadSizes",
    "isCurrentAppInstalled",
    "languageCode",
    "folderColorPalette",
    "teamDriveThemes"
})
public class Information {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonProperty("name")
    private String name;
    @JsonProperty("user")
    private User user;
    @JsonProperty("quotaBytesTotal")
    private String quotaBytesTotal;
    @JsonProperty("quotaBytesUsed")
    private String quotaBytesUsed;
    @JsonProperty("quotaBytesUsedAggregate")
    private String quotaBytesUsedAggregate;
    @JsonProperty("quotaBytesUsedInTrash")
    private String quotaBytesUsedInTrash;
    @JsonProperty("quotaType")
    private String quotaType;
    @JsonProperty("quotaBytesByService")
    private List<QuotaBytesByService> quotaBytesByService = null;
    @JsonProperty("largestChangeId")
    private String largestChangeId;
    @JsonProperty("remainingChangeIds")
    private String remainingChangeIds;
    @JsonProperty("rootFolderId")
    private String rootFolderId;
    @JsonProperty("domainSharingPolicy")
    private String domainSharingPolicy;
    @JsonProperty("permissionId")
    private String permissionId;
    @JsonProperty("importFormats")
    private List<ImportFormat> importFormats = null;
    @JsonProperty("exportFormats")
    private List<ExportFormat> exportFormats = null;
    @JsonProperty("additionalRoleInfo")
    private List<AdditionalRoleInfo> additionalRoleInfo = null;
    @JsonProperty("features")
    private List<Feature> features = null;
    @JsonProperty("maxUploadSizes")
    private List<MaxUploadSize> maxUploadSizes = null;
    @JsonProperty("isCurrentAppInstalled")
    private String isCurrentAppInstalled;
    @JsonProperty("languageCode")
    private String languageCode;
    @JsonProperty("folderColorPalette")
    private List<String> folderColorPalette = null;
    
    @JsonProperty("teamDriveThemes")
    private List<TeamDriveTheme> teamDriveThemes = null;
    @JsonProperty("teamDriveThemes")
    public List<TeamDriveTheme> getTeamDriveThemes() {
    return teamDriveThemes;
    }

    @JsonProperty("teamDriveThemes")
    public void setTeamDriveThemes(List<TeamDriveTheme> teamDriveThemes) {
    this.teamDriveThemes = teamDriveThemes;
    }
    
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("quotaBytesTotal")
    public String getQuotaBytesTotal() {
        return quotaBytesTotal;
    }

    @JsonProperty("quotaBytesTotal")
    public void setQuotaBytesTotal(String quotaBytesTotal) {
        this.quotaBytesTotal = quotaBytesTotal;
    }

    @JsonProperty("quotaBytesUsed")
    public String getQuotaBytesUsed() {
        return quotaBytesUsed;
    }

    @JsonProperty("quotaBytesUsed")
    public void setQuotaBytesUsed(String quotaBytesUsed) {
        this.quotaBytesUsed = quotaBytesUsed;
    }

    @JsonProperty("quotaBytesUsedAggregate")
    public String getQuotaBytesUsedAggregate() {
        return quotaBytesUsedAggregate;
    }

    @JsonProperty("quotaBytesUsedAggregate")
    public void setQuotaBytesUsedAggregate(String quotaBytesUsedAggregate) {
        this.quotaBytesUsedAggregate = quotaBytesUsedAggregate;
    }

    @JsonProperty("quotaBytesUsedInTrash")
    public String getQuotaBytesUsedInTrash() {
        return quotaBytesUsedInTrash;
    }

    @JsonProperty("quotaBytesUsedInTrash")
    public void setQuotaBytesUsedInTrash(String quotaBytesUsedInTrash) {
        this.quotaBytesUsedInTrash = quotaBytesUsedInTrash;
    }

    @JsonProperty("quotaType")
    public String getQuotaType() {
        return quotaType;
    }

    @JsonProperty("quotaType")
    public void setQuotaType(String quotaType) {
        this.quotaType = quotaType;
    }

    @JsonProperty("quotaBytesByService")
    public List<QuotaBytesByService> getQuotaBytesByService() {
        return quotaBytesByService;
    }

    @JsonProperty("quotaBytesByService")
    public void setQuotaBytesByService(List<QuotaBytesByService> quotaBytesByService) {
        this.quotaBytesByService = quotaBytesByService;
    }

    @JsonProperty("largestChangeId")
    public String getLargestChangeId() {
        return largestChangeId;
    }

    @JsonProperty("largestChangeId")
    public void setLargestChangeId(String largestChangeId) {
        this.largestChangeId = largestChangeId;
    }

    @JsonProperty("remainingChangeIds")
    public String getRemainingChangeIds() {
        return remainingChangeIds;
    }

    @JsonProperty("remainingChangeIds")
    public void setRemainingChangeIds(String remainingChangeIds) {
        this.remainingChangeIds = remainingChangeIds;
    }

    @JsonProperty("rootFolderId")
    public String getRootFolderId() {
        return rootFolderId;
    }

    @JsonProperty("rootFolderId")
    public void setRootFolderId(String rootFolderId) {
        this.rootFolderId = rootFolderId;
    }

    @JsonProperty("domainSharingPolicy")
    public String getDomainSharingPolicy() {
        return domainSharingPolicy;
    }

    @JsonProperty("domainSharingPolicy")
    public void setDomainSharingPolicy(String domainSharingPolicy) {
        this.domainSharingPolicy = domainSharingPolicy;
    }

    @JsonProperty("permissionId")
    public String getPermissionId() {
        return permissionId;
    }

    @JsonProperty("permissionId")
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @JsonProperty("importFormats")
    public List<ImportFormat> getImportFormats() {
        return importFormats;
    }

    @JsonProperty("importFormats")
    public void setImportFormats(List<ImportFormat> importFormats) {
        this.importFormats = importFormats;
    }

    @JsonProperty("exportFormats")
    public List<ExportFormat> getExportFormats() {
        return exportFormats;
    }

    @JsonProperty("exportFormats")
    public void setExportFormats(List<ExportFormat> exportFormats) {
        this.exportFormats = exportFormats;
    }

    @JsonProperty("additionalRoleInfo")
    public List<AdditionalRoleInfo> getAdditionalRoleInfo() {
        return additionalRoleInfo;
    }

    @JsonProperty("additionalRoleInfo")
    public void setAdditionalRoleInfo(List<AdditionalRoleInfo> additionalRoleInfo) {
        this.additionalRoleInfo = additionalRoleInfo;
    }

    @JsonProperty("features")
    public List<Feature> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    @JsonProperty("maxUploadSizes")
    public List<MaxUploadSize> getMaxUploadSizes() {
        return maxUploadSizes;
    }

    @JsonProperty("maxUploadSizes")
    public void setMaxUploadSizes(List<MaxUploadSize> maxUploadSizes) {
        this.maxUploadSizes = maxUploadSizes;
    }

    @JsonProperty("isCurrentAppInstalled")
    public String getIsCurrentAppInstalled() {
        return isCurrentAppInstalled;
    }

    @JsonProperty("isCurrentAppInstalled")
    public void setIsCurrentAppInstalled(String isCurrentAppInstalled) {
        this.isCurrentAppInstalled = isCurrentAppInstalled;
    }

    @JsonProperty("languageCode")
    public String getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("languageCode")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @JsonProperty("folderColorPalette")
    public List<String> getFolderColorPalette() {
        return folderColorPalette;
    }

    @JsonProperty("folderColorPalette")
    public void setFolderColorPalette(List<String> folderColorPalette) {
        this.folderColorPalette = folderColorPalette;
    }

}
