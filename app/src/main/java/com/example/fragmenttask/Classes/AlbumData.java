package com.example.fragmenttask.Classes;

public class AlbumData
{
    private String artistName,artistType,artistAddress,likeCounter,memberCounter,repostCounter,shareCounter,videoCounter,viewCounter;
    private String imageUrl;

    public AlbumData(String artistName, String artistType,String artistAddress, String likeCounter, String memberCounter, String repostCounter, String shareCounter, String videoCounter,String viewCounter,String imageUrl) {
        this.artistName = artistName;
        this.artistType = artistType;
        this.artistAddress=artistAddress;
        this.likeCounter = likeCounter;
        this.memberCounter = memberCounter;
        this.repostCounter = repostCounter;
        this.shareCounter = shareCounter;
        this.videoCounter = videoCounter;
        this.viewCounter=viewCounter;
        this.imageUrl=imageUrl;
    }

    public AlbumData() {
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getViewCounter() {
        return viewCounter;
    }

    public void setViewCounter(String viewCounter) {
        this.viewCounter = viewCounter;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistAddress() {
        return artistAddress;
    }

    public void setArtistAddress(String artistAddress) {
        this.artistAddress = artistAddress;
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
