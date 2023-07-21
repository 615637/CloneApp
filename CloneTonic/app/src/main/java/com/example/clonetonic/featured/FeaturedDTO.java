package com.example.clonetonic.featured;

import java.io.Serializable;

public class FeaturedDTO implements Serializable {
    private int imgId;
    private String title;

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FeaturedDTO(int imgId, String title) {
        this.imgId = imgId;
        this.title = title;
    }
}
