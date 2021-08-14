package com.ozgurerdogan.instagramclonejava.Model;

public class StoryModel {

    int storyImg,profileImg,storyType;
    String name;

    public StoryModel(int storyImg, int profileImg, int storyType, String name) {
        this.storyImg = storyImg;
        this.profileImg = profileImg;
        this.storyType = storyType;
        this.name = name;
    }

    public int getStoryImg() {
        return storyImg;
    }

    public void setStoryImg(int storyImg) {
        this.storyImg = storyImg;
    }

    public int getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(int profileImg) {
        this.profileImg = profileImg;
    }

    public int getStoryType() {
        return storyType;
    }

    public void setStoryType(int storyType) {
        this.storyType = storyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
