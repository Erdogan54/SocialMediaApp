package com.ozgurerdogan.instagramclonejava.Model;

public class NotifiyModel {
    int picture;
    String notify,time;

    public NotifiyModel(int picture, String notify, String time) {
        this.picture = picture;
        this.notify = notify;
        this.time = time;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
