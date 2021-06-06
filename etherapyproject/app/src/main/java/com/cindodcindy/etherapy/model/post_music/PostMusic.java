
package com.cindodcindy.etherapy.model.post_music;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostMusic {

    @SerializedName("message")
    @Expose
    private String message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PostMusic() {
    }

    /**
     * 
     * @param message
     */
    public PostMusic(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
