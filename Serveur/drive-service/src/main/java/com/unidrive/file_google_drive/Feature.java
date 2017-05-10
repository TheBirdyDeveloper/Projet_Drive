
package com.unidrive.file_google_drive;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "featureName",
    "featureRate"
})
public class Feature {

    @JsonProperty("featureName")
    private String featureName;
    @JsonProperty("featureRate")
    private String featureRate;

    @JsonProperty("featureName")
    public String getFeatureName() {
        return featureName;
    }

    @JsonProperty("featureName")
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    @JsonProperty("featureRate")
    public String getFeatureRate() {
        return featureRate;
    }

    @JsonProperty("featureRate")
    public void setFeatureRate(String featureRate) {
        this.featureRate = featureRate;
    }

}
