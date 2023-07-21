package com.example.clonetonic.livenow;

import java.io.Serializable;

public class LiveDTO implements Serializable {

    private int imgId, instrument;
    private String name;

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public int getInstrument() {
        return instrument;
    }

    public void setInstrument(int instrument) {
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LiveDTO(int imgId, int instrument, String name) {
        this.imgId = imgId;
        this.instrument = instrument;
        this.name = name;
    }
}
