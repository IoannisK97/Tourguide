package com.example.jandroid.tourguide;

import android.graphics.drawable.Drawable;

public class Place {
    private String name;
    private int image;
    private String telNumber=NOT_PROVIDED;
    private String openHours=NOT_PROVIDED;

    private static final String NOT_PROVIDED="not provided";

    public Place (String pName,int pImage){
        name=pName;
        image=pImage;
    }
    public Place (String pName,int pImage,String pTelNumber,String pOpenHours){
        name=pName;
        image=pImage;
        telNumber=pTelNumber;
        openHours=pOpenHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }
    public Boolean hasTelAndHours(){
        return telNumber!=NOT_PROVIDED;
    }
}
