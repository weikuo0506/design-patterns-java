package com.walker.designpatterns.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by walker on 2016/8/7.
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException{
        try{
            if (method.getName().equals("setHotRating")) {
                throw new IllegalAccessException();
            } else {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
