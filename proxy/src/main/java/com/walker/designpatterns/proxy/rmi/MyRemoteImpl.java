package com.walker.designpatterns.proxy.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by walker on 2016/8/7.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        return "server says : hello";
    }

    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.codebase", MyRemoteImpl.class.getProtectionDomain().getCodeSource().getLocation().toString());

            MyRemote remoteService = new MyRemoteImpl();
            Naming.rebind("RemoteHello", remoteService);
            remoteService.sayHello();
            System.out.println("good");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
