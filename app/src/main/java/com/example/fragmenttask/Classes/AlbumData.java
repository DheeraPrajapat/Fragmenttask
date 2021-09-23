package com.example.fragmenttask.Classes;

public class AlbumData
{
    private String artistName,artistType,likeCounter,memberCounter,repostCounter,shareCounter,videoCounter;

    public AlbumData(String artistName, String artistType, String likeCounter, String memberCounter, String repostCounter, String shareCounter, String videoCounter) {
        this.artistName = artistName;
        this.artistType = artistType;
        this.likeCounter = likeCounter;
        this.memberCounter = memberCounter;
        this.repostCounter = repostCounter;
        this.shareCounter = shareCounter;
        this.videoCounter = videoCounter;
    }

    public AlbumData() {
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistType() {
        return artistType;
    }

    public void setArtistType(String artistType) {
        this.artistType = artistType;
    }

    public String getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(String likeCounter) {
        this.likeCounter = likeCounter;
    }

    public String getMemberCounter() {
        return memberCounter;
    }

    public void setMemberCounter(String memberCounter) {
        this.memberCounter = memberCounter;
    }

    public String getRepostCounter() {
        return repostCounter;
    }

    public void setRepostCounter(String repostCounter) {
        this.repostCounter = repostCounter;
    }

    public String getShareCounter() {
        return shareCounter;
    }

    public void setShareCounter(String shareCounter) {
        this.shareCounter = shareCounter;
    }

    public String getVideoCounter() {
        return videoCounter;
    }

    public void setVideoCounter(String videoCounter) {
        this.videoCounter = videoCounter;
    }
}
