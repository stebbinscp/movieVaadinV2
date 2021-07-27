
package com.example.application.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Meta {

    @SerializedName("operation")
    @Expose
    private String operation;
    @SerializedName("requestId")
    @Expose
    private String requestId;
    @SerializedName("serviceTimeMs")
    @Expose
    private Double serviceTimeMs;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Double getServiceTimeMs() {
        return serviceTimeMs;
    }

    public void setServiceTimeMs(Double serviceTimeMs) {
        this.serviceTimeMs = serviceTimeMs;
    }

}
