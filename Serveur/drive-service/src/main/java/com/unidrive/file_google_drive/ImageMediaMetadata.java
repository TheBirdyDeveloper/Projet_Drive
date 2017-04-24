
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
    "width",
    "height",
    "rotation",
    "location",
    "date",
    "cameraMake",
    "cameraModel",
    "exposureTime",
    "aperture",
    "flashUsed",
    "focalLength",
    "isoSpeed",
    "meteringMode",
    "sensor",
    "exposureMode",
    "colorSpace",
    "whiteBalance",
    "exposureBias",
    "maxApertureValue",
    "subjectDistance",
    "lens"
})
public class ImageMediaMetadata {

    @JsonProperty("width")
    private String width;
    @JsonProperty("height")
    private String height;
    @JsonProperty("rotation")
    private String rotation;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("date")
    private String date;
    @JsonProperty("cameraMake")
    private String cameraMake;
    @JsonProperty("cameraModel")
    private String cameraModel;
    @JsonProperty("exposureTime")
    private String exposureTime;
    @JsonProperty("aperture")
    private String aperture;
    @JsonProperty("flashUsed")
    private String flashUsed;
    @JsonProperty("focalLength")
    private String focalLength;
    @JsonProperty("isoSpeed")
    private String isoSpeed;
    @JsonProperty("meteringMode")
    private String meteringMode;
    @JsonProperty("sensor")
    private String sensor;
    @JsonProperty("exposureMode")
    private String exposureMode;
    @JsonProperty("colorSpace")
    private String colorSpace;
    @JsonProperty("whiteBalance")
    private String whiteBalance;
    @JsonProperty("exposureBias")
    private String exposureBias;
    @JsonProperty("maxApertureValue")
    private String maxApertureValue;
    @JsonProperty("subjectDistance")
    private String subjectDistance;
    @JsonProperty("lens")
    private String lens;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("width")
    public String getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(String width) {
        this.width = width;
    }

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty("rotation")
    public String getRotation() {
        return rotation;
    }

    @JsonProperty("rotation")
    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("cameraMake")
    public String getCameraMake() {
        return cameraMake;
    }

    @JsonProperty("cameraMake")
    public void setCameraMake(String cameraMake) {
        this.cameraMake = cameraMake;
    }

    @JsonProperty("cameraModel")
    public String getCameraModel() {
        return cameraModel;
    }

    @JsonProperty("cameraModel")
    public void setCameraModel(String cameraModel) {
        this.cameraModel = cameraModel;
    }

    @JsonProperty("exposureTime")
    public String getExposureTime() {
        return exposureTime;
    }

    @JsonProperty("exposureTime")
    public void setExposureTime(String exposureTime) {
        this.exposureTime = exposureTime;
    }

    @JsonProperty("aperture")
    public String getAperture() {
        return aperture;
    }

    @JsonProperty("aperture")
    public void setAperture(String aperture) {
        this.aperture = aperture;
    }

    @JsonProperty("flashUsed")
    public String getFlashUsed() {
        return flashUsed;
    }

    @JsonProperty("flashUsed")
    public void setFlashUsed(String flashUsed) {
        this.flashUsed = flashUsed;
    }

    @JsonProperty("focalLength")
    public String getFocalLength() {
        return focalLength;
    }

    @JsonProperty("focalLength")
    public void setFocalLength(String focalLength) {
        this.focalLength = focalLength;
    }

    @JsonProperty("isoSpeed")
    public String getIsoSpeed() {
        return isoSpeed;
    }

    @JsonProperty("isoSpeed")
    public void setIsoSpeed(String isoSpeed) {
        this.isoSpeed = isoSpeed;
    }

    @JsonProperty("meteringMode")
    public String getMeteringMode() {
        return meteringMode;
    }

    @JsonProperty("meteringMode")
    public void setMeteringMode(String meteringMode) {
        this.meteringMode = meteringMode;
    }

    @JsonProperty("sensor")
    public String getSensor() {
        return sensor;
    }

    @JsonProperty("sensor")
    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    @JsonProperty("exposureMode")
    public String getExposureMode() {
        return exposureMode;
    }

    @JsonProperty("exposureMode")
    public void setExposureMode(String exposureMode) {
        this.exposureMode = exposureMode;
    }

    @JsonProperty("colorSpace")
    public String getColorSpace() {
        return colorSpace;
    }

    @JsonProperty("colorSpace")
    public void setColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
    }

    @JsonProperty("whiteBalance")
    public String getWhiteBalance() {
        return whiteBalance;
    }

    @JsonProperty("whiteBalance")
    public void setWhiteBalance(String whiteBalance) {
        this.whiteBalance = whiteBalance;
    }

    @JsonProperty("exposureBias")
    public String getExposureBias() {
        return exposureBias;
    }

    @JsonProperty("exposureBias")
    public void setExposureBias(String exposureBias) {
        this.exposureBias = exposureBias;
    }

    @JsonProperty("maxApertureValue")
    public String getMaxApertureValue() {
        return maxApertureValue;
    }

    @JsonProperty("maxApertureValue")
    public void setMaxApertureValue(String maxApertureValue) {
        this.maxApertureValue = maxApertureValue;
    }

    @JsonProperty("subjectDistance")
    public String getSubjectDistance() {
        return subjectDistance;
    }

    @JsonProperty("subjectDistance")
    public void setSubjectDistance(String subjectDistance) {
        this.subjectDistance = subjectDistance;
    }

    @JsonProperty("lens")
    public String getLens() {
        return lens;
    }

    @JsonProperty("lens")
    public void setLens(String lens) {
        this.lens = lens;
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
