
package com.cindodcindy.etherapy.model.get_pen_music;

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
    @SerializedName("musicName")
    @Expose
    private String musicName;
    @SerializedName("rateMusic")
    @Expose
    private long rateMusic;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Content() {
    }

    /**
     * 
     * @param createdAt
     * @param id
     * @param musicName
     * @param rateMusic
     * @param updatedAt
     */
    public Content(String createdAt, String updatedAt, long id, String musicName, long rateMusic) {
        super();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
        this.musicName = musicName;
        this.rateMusic = rateMusic;
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

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public long getRateMusic() {
        return rateMusic;
    }

    public void setRateMusic(long rateMusic) {
        this.rateMusic = rateMusic;
    }

}
