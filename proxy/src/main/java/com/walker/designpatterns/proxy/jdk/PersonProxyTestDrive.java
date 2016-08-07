package com.walker.designpatterns.proxy.jdk;

/**
 * Created by walker on 2016/8/7.
 */
public class PersonProxyTestDrive {
    public static void main(String[] args) {
        Person person = new PersonImpl();
        OwnerInvocationHandler ownerInvocationHandler = new OwnerInvocationHandler(person);
        NonOwnerInvocationHandler nonOwnerInvocationHandler = new NonOwnerInvocationHandler(person);

        Person ownerProxy = PersonProxy.newPersonProxy(person,ownerInvocationHandler);
        Person nonOwnerProxy = PersonProxy.newPersonProxy(person,nonOwnerInvocationHandler);

        ownerProxy.setName("walker");
        ownerProxy.setGender("male");
        ownerProxy.setInterests("tennis,bike...");

        nonOwnerProxy.setHotRating(3);

        System.out.println(person.getName());
        System.out.println(person.getGender());
        System.out.println(person.getInterests());
        System.out.println(person.getHotRating());
    }
}
