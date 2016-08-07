package com.walker.designpatterns.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by walker on 2016/8/7.
 */
public interface MyRemote extends Remote {
    String sayHello()throws RemoteException;
}
