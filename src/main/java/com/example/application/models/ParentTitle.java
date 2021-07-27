
package com.example.application.models;

import javax.annotation.Generated;

import com.example.application.models.Image__1;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ParentTitle {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("image")
    @Expose
    private Image__1 image;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("titleType")
    @Expose
    private String titleType;
    @SerializedName("year")
    @Expose
    private Integer year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Image__1 getImage() {
        return image;
    }

    public void setImage(Image__1 image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
