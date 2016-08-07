package com.walker.designpatterns.proxy.jdk;

/**
 * Created by walker on 2016/8/7.
 */
public class PersonImpl implements Person{
    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInterests() {
        return interests;
    }

    public int getHotRating() {
        if (ratingCount == 0) {
            return 0;
        } else {
            return rating/ratingCount;
        }
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public void setHotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    @Override
    public String toString() {
        return "PersonImpl{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", interests='" + interests + '\'' +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                '}';
    }
}
