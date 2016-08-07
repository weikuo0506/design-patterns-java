package com.walker.designpatterns.proxy.rmi;

import java.rmi.Naming;

/**
 * Created by walker on 2016/8/7.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi:127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
