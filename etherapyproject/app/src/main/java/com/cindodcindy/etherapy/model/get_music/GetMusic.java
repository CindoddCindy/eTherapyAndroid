
package com.cindodcindy.etherapy.model.get_music;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetMusic {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("size")
    @Expose
    private long size;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetMusic() {
    }

    /**
     * 
     * @param size
     * @param name
     * @param type
     * @param url
     */
    public GetMusic(String name, String url, String type, long size) {
        super();
        this.name = name;
        this.url = url;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

}
