
package com.example.application.models;

import javax.annotation.Generated;

import com.example.application.models.I__1;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class V {

    @SerializedName("i")
    @Expose
    private I__1 i;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("l")
    @Expose
    private String l;
    @SerializedName("s")
    @Expose
    private String s;

    public I__1 getI() {
        return i;
    }

    public void setI(I__1 i) {
        this.i = i;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

}
