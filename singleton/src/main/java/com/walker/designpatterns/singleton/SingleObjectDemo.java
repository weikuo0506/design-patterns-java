package com.walker.designpatterns.singleton;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public class SingleObjectDemo {
    public static void main(String[] args) {
//        SingleObject object = new SingleObject();

        SingleObject object1 = SingleObject.getInstance();
        object1.showMsg();

    }
}

