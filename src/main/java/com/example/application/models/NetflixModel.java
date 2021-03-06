
package com.example.application.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class NetflixModel {

    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("elapse")
    @Expose
    private Double elapse;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Double getElapse() {
        return elapse;
    }

    public void setElapse(Double elapse) {
        this.elapse = elapse;
    }

}
