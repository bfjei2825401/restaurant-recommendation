package com.fivetalk.userservice.model;

import java.sql.Timestamp;

public class UserEntity {
    private String id;
    private String name;
    private int reviewCount;
    private Timestamp yelpingSince;
    private int useful;
    private int funny;
    private int cool;
    private int fans;
    private float averageStars;
    private int complimentHot;
    private int complimentMore;
    private int complimentProfile;
    private int complimentCute;
    private int complimentList;
    private int complimentNote;
    private int complimentPlain;
    private int complimentCool;
    private int complimentFunny;
    private int complimentWriter;
    private int complimentPhotos;
    private String username;
    private String password;
    private String headUrl;

    public UserEntity() {
    }

    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserEntity(String id, String name, int reviewCount, Timestamp yelpingSince, int useful, int funny, int cool, int fans, float averageStars, int complimentHot, int complimentMore, int complimentProfile, int complimentCute, int complimentList, int complimentNote, int complimentPlain, int complimentCool, int complimentFunny, int complimentWriter, int complimentPhotos, String username, String password, String headUrl) {
        this.id = id;
        this.name = name;
        this.reviewCount = reviewCount;
        this.yelpingSince = yelpingSince;
        this.useful = useful;
        this.funny = funny;
        this.cool = cool;
        this.fans = fans;
        this.averageStars = averageStars;
        this.complimentHot = complimentHot;
        this.complimentMore = complimentMore;
        this.complimentProfile = complimentProfile;
        this.complimentCute = complimentCute;
        this.complimentList = complimentList;
        this.complimentNote = complimentNote;
        this.complimentPlain = complimentPlain;
        this.complimentCool = complimentCool;
        this.complimentFunny = complimentFunny;
        this.complimentWriter = complimentWriter;
        this.complimentPhotos = complimentPhotos;
        this.username = username;
        this.password = password;
        this.headUrl = headUrl;
    }

    public UserEntity(String id, String name, int reviewCount, Timestamp yelpingSince, int useful, int funny, int cool, int fans, float averageStars, int complimentHot, int complimentMore, int complimentProfile, int complimentCute, int complimentList, int complimentNote, int complimentPlain, int complimentCool, int complimentFunny, int complimentWriter, int complimentPhotos, String username, String headUrl) {
        this.id = id;
        this.name = name;
        this.reviewCount = reviewCount;
        this.yelpingSince = yelpingSince;
        this.useful = useful;
        this.funny = funny;
        this.cool = cool;
        this.fans = fans;
        this.averageStars = averageStars;
        this.complimentHot = complimentHot;
        this.complimentMore = complimentMore;
        this.complimentProfile = complimentProfile;
        this.complimentCute = complimentCute;
        this.complimentList = complimentList;
        this.complimentNote = complimentNote;
        this.complimentPlain = complimentPlain;
        this.complimentCool = complimentCool;
        this.complimentFunny = complimentFunny;
        this.complimentWriter = complimentWriter;
        this.complimentPhotos = complimentPhotos;
        this.username = username;
        this.headUrl = headUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Timestamp getYelpingSince() {
        return yelpingSince;
    }

    public void setYelpingSince(Timestamp yelpingSince) {
        this.yelpingSince = yelpingSince;
    }

    public int getUseful() {
        return useful;
    }

    public void setUseful(int useful) {
        this.useful = useful;
    }

    public int getFunny() {
        return funny;
    }

    public void setFunny(int funny) {
        this.funny = funny;
    }

    public int getCool() {
        return cool;
    }

    public void setCool(int cool) {
        this.cool = cool;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public float getAverageStars() {
        return averageStars;
    }

    public void setAverageStars(float averageStars) {
        this.averageStars = averageStars;
    }

    public int getComplimentHot() {
        return complimentHot;
    }

    public void setComplimentHot(int complimentHot) {
        this.complimentHot = complimentHot;
    }

    public int getComplimentMore() {
        return complimentMore;
    }

    public void setComplimentMore(int complimentMore) {
        this.complimentMore = complimentMore;
    }

    public int getComplimentProfile() {
        return complimentProfile;
    }

    public void setComplimentProfile(int complimentProfile) {
        this.complimentProfile = complimentProfile;
    }

    public int getComplimentCute() {
        return complimentCute;
    }

    public void setComplimentCute(int complimentCute) {
        this.complimentCute = complimentCute;
    }

    public int getComplimentList() {
        return complimentList;
    }

    public void setComplimentList(int complimentList) {
        this.complimentList = complimentList;
    }

    public int getComplimentNote() {
        return complimentNote;
    }

    public void setComplimentNote(int complimentNote) {
        this.complimentNote = complimentNote;
    }

    public int getComplimentPlain() {
        return complimentPlain;
    }

    public void setComplimentPlain(int complimentPlain) {
        this.complimentPlain = complimentPlain;
    }

    public int getComplimentCool() {
        return complimentCool;
    }

    public void setComplimentCool(int complimentCool) {
        this.complimentCool = complimentCool;
    }

    public int getComplimentFunny() {
        return complimentFunny;
    }

    public void setComplimentFunny(int complimentFunny) {
        this.complimentFunny = complimentFunny;
    }

    public int getComplimentWriter() {
        return complimentWriter;
    }

    public void setComplimentWriter(int complimentWriter) {
        this.complimentWriter = complimentWriter;
    }

    public int getComplimentPhotos() {
        return complimentPhotos;
    }

    public void setComplimentPhotos(int complimentPhotos) {
        this.complimentPhotos = complimentPhotos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }
}
