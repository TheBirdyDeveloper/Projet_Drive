
package com.unidrive.file_google_drive;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "serviceName",
    "bytesUsed"
})
public class QuotaBytesByService {

    @JsonProperty("serviceName")
    private String serviceName;
    @JsonProperty("bytesUsed")
    private String bytesUsed;

    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @JsonProperty("bytesUsed")
    public String getBytesUsed() {
        return bytesUsed;
    }

    @JsonProperty("bytesUsed")
    public void setBytesUsed(String bytesUsed) {
        this.bytesUsed = bytesUsed;
    }

}
