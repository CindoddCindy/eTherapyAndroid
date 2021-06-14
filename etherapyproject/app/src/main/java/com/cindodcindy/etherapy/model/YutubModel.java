package com.cindodcindy.etherapy.model;

public class YutubModel {
    String videoUrl;
    public YutubModel() {
    }
    public YutubModel(String videoUrl) {
        this.videoUrl = videoUrl;
    }
    public String getVideoUrl() {
        return videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
