
package com.cindodcindy.etherapy.model.get_game;

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
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("answA")
    @Expose
    private String answA;
    @SerializedName("answB")
    @Expose
    private String answB;
    @SerializedName("answC")
    @Expose
    private String answC;
    @SerializedName("answD")
    @Expose
    private String answD;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Content() {
    }

    /**
     * 
     * @param createdAt
     * @param answC
     * @param answD
     * @param answA
     * @param id
     * @param answB
     * @param content
     * @param updatedAt
     */
    public Content(String createdAt, String updatedAt, long id, String content, String answA, String answB, String answC, String answD) {
        super();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
        this.content = content;
        this.answA = answA;
        this.answB = answB;
        this.answC = answC;
        this.answD = answD;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswA() {
        return answA;
    }

    public void setAnswA(String answA) {
        this.answA = answA;
    }

    public String getAnswB() {
        return answB;
    }

    public void setAnswB(String answB) {
        this.answB = answB;
    }

    public String getAnswC() {
        return answC;
    }

    public void setAnswC(String answC) {
        this.answC = answC;
    }

    public String getAnswD() {
        return answD;
    }

    public void setAnswD(String answD) {
        this.answD = answD;
    }

}
