
package com.cindodcindy.etherapy.model.get_pen_mot_mus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("rateM")
    @Expose
    private long rateM;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Content() {
    }

    /**
     * 
     * @param createdAt
     * @param rateM
     * @param id
     * @param updatedAt
     */
    public Content(String createdAt, String updatedAt, long id, long rateM) {
        super();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
        this.rateM = rateM;
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

    public long getRateM() {
        return rateM;
    }

    public void setRateM(long rateM) {
        this.rateM = rateM;
    }

}
