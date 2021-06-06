
package com.cindodcindy.etherapy.model.post_pen_kris;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostRateKristen {

    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("rateK")
    @Expose
    private long rateK;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PostRateKristen() {
    }

    /**
     * 
     * @param createdAt
     * @param id
     * @param updatedAt
     * @param rateK
     */
    public PostRateKristen(String createdAt, String updatedAt, long id, long rateK) {
        super();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
        this.rateK = rateK;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRateK() {
        return rateK;
    }

    public void setRateK(long rateK) {
        this.rateK = rateK;
    }

}
