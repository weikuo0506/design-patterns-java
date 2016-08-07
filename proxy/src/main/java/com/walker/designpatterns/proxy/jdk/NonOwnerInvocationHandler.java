package com.walker.designpatterns.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by walker on 2016/8/7.
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    private Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try{
            if (method.getName().equals("setHotRating")) {
                return method.invoke(person, args);
            } else {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
