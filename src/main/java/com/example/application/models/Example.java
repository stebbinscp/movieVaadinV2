
package com.example.application.models;

import java.util.List;
import javax.annotation.Generated;

import com.example.application.models.D;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Example {

    @SerializedName("d")
    @Expose
    private List<D> d = null;
    @SerializedName("q")
    @Expose
    private String q;
    @SerializedName("v")
    @Expose
    private Integer v;

    public List<D> getD() {
        return d;
    }

    public void setD(List<D> d) {
        this.d = d;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}
