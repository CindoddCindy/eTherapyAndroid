
package com.cindodcindy.etherapy.model.get_mot_mus;

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
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("content")
    @Expose
    private String content;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Content() {
    }

    /**
     * 
     * @param createdAt
     * @param description
     * @param id
     * @param title
     * @param content
     * @param updatedAt
     */
    public Content(String createdAt, String updatedAt, long id, String title, String description, String content) {
        super();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
