package com.walker.designpatterns.proxy.jdk;

/**
 * Created by walker on 2016/8/7.
 */
public interface Person {
    String getName();
    String getGender();
    String getInterests();
    int getHotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotRating(int rating);

}
