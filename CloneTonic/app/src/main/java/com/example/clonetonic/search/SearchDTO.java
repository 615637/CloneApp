package com.example.clonetonic.search;

public class SearchDTO {
    private int imgId, profile;
    private String title, writer;

    public SearchDTO(int imgId, int profile, String title, String writer) {
        this.imgId = imgId;
        this.profile = profile;
        this.title = title;
        this.writer = writer;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
