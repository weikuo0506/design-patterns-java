package com.walker.designpatterns.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by walker on 2016/8/7.
 */
public class PersonProxy{
    public static Person newPersonProxy(Person person, InvocationHandler handler) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(), handler);
    }
}
