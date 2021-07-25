
package com.example.application.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class D {

    @SerializedName("i") // image THIS
    @Expose
    private I i; // Image // .imageUrl()
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("l") // title THIS
    @Expose
    private String l;
    @SerializedName("q") // media type
    @Expose
    private String q;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("s")
    @Expose
    private String s;
    @SerializedName("v")
    @Expose
    private List<V> v = null;  // list of versions? each in it has an i, l , q, rank,s,v
    @SerializedName("vt")
    @Expose
    private Integer vt;
    @SerializedName("y")
    @Expose
    private Integer y;  // start year THIS
    @SerializedName("yr")
    @Expose
    private String yr; // total span

    public I getI() {
        return i;
    }

    public void setI(I i) {
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

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public List<V> getV() {
        return v;
    }

    public void setV(List<V> v) {
        this.v = v;
    }

    public Integer getVt() {
        return vt;
    }

    public void setVt(Integer vt) {
        this.vt = vt;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getYr() {
        return yr;
    }

    public void setYr(String yr) {
        this.yr = yr;
    }

}
