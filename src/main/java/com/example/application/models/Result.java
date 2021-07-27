
package com.example.application.models;

import java.util.List;
import javax.annotation.Generated;

import com.example.application.models.Image;
import com.example.application.models.ParentTitle;
import com.example.application.models.Principal;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("runningTimeInMinutes")
    @Expose
    private Integer runningTimeInMinutes;
    @SerializedName("nextEpisode")
    @Expose
    private String nextEpisode;
    @SerializedName("numberOfEpisodes")
    @Expose
    private Integer numberOfEpisodes;
    @SerializedName("seriesEndYear")
    @Expose
    private Integer seriesEndYear;
    @SerializedName("seriesStartYear")
    @Expose
    private Integer seriesStartYear;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("titleType")
    @Expose
    private String titleType;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("principals")
    @Expose
    private List<Principal> principals = null;
    @SerializedName("episode")
    @Expose
    private Integer episode;
    @SerializedName("season")
    @Expose
    private Integer season;
    @SerializedName("parentTitle")
    @Expose
    private ParentTitle parentTitle;
    @SerializedName("previousEpisode")
    @Expose
    private String previousEpisode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Integer getRunningTimeInMinutes() {
        return runningTimeInMinutes;
    }

    public void setRunningTimeInMinutes(Integer runningTimeInMinutes) {
        this.runningTimeInMinutes = runningTimeInMinutes;
    }

    public String getNextEpisode() {
        return nextEpisode;
    }

    public void setNextEpisode(String nextEpisode) {
        this.nextEpisode = nextEpisode;
    }

    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(Integer numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public Integer getSeriesEndYear() {
        return seriesEndYear;
    }

    public void setSeriesEndYear(Integer seriesEndYear) {
        this.seriesEndYear = seriesEndYear;
    }

    public Integer getSeriesStartYear() {
        return seriesStartYear;
    }

    public void setSeriesStartYear(Integer seriesStartYear) {
        this.seriesStartYear = seriesStartYear;
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

    public List<Principal> getPrincipals() {
        return principals;
    }

    public void setPrincipals(List<Principal> principals) {
        this.principals = principals;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public ParentTitle getParentTitle() {
        return parentTitle;
    }

    public void setParentTitle(ParentTitle parentTitle) {
        this.parentTitle = parentTitle;
    }

    public String getPreviousEpisode() {
        return previousEpisode;
    }

    public void setPreviousEpisode(String previousEpisode) {
        this.previousEpisode = previousEpisode;
    }

    @Override
    public String toString() {
        return "Result{" +
                ", image=" + image +
                ", title='" + title + '\'' +
                ", titleType='" + titleType + '\''+
                '}';
    }
}
