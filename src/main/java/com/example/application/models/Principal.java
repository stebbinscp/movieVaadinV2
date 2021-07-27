
package com.example.application.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Principal {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("legacyNameText")
    @Expose
    private String legacyNameText;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("characters")
    @Expose
    private List<String> characters = null;
    @SerializedName("endYear")
    @Expose
    private Integer endYear;
    @SerializedName("episodeCount")
    @Expose
    private Integer episodeCount;
    @SerializedName("roles")
    @Expose
    private List<Role> roles = null;
    @SerializedName("startYear")
    @Expose
    private Integer startYear;
    @SerializedName("attr")
    @Expose
    private List<String> attr = null;
    @SerializedName("disambiguation")
    @Expose
    private String disambiguation;
    @SerializedName("billing")
    @Expose
    private Integer billing;
    @SerializedName("as")
    @Expose
    private String as;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLegacyNameText() {
        return legacyNameText;
    }

    public void setLegacyNameText(String legacyNameText) {
        this.legacyNameText = legacyNameText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public Integer getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(Integer episodeCount) {
        this.episodeCount = episodeCount;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public List<String> getAttr() {
        return attr;
    }

    public void setAttr(List<String> attr) {
        this.attr = attr;
    }

    public String getDisambiguation() {
        return disambiguation;
    }

    public void setDisambiguation(String disambiguation) {
        this.disambiguation = disambiguation;
    }

    public Integer getBilling() {
        return billing;
    }

    public void setBilling(Integer billing) {
        this.billing = billing;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

}
