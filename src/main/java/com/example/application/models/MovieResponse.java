
package com.example.application.models;

import java.util.List;
import javax.annotation.Generated;

import com.example.application.models.Meta;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class MovieResponse {

    @SerializedName("@meta")
    @Expose
    private Meta meta;
    @SerializedName("@type")
    @Expose
    private String type;
    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("types")
    @Expose
    private List<String> types = null;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

}
