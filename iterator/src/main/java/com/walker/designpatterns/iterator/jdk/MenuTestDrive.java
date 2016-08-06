package com.walker.designpatterns.iterator.jdk;

import com.walker.designpatterns.iterator.jdk.menu.CafeMenu;
import com.walker.designpatterns.iterator.jdk.menu.DinerMenu;
import com.walker.designpatterns.iterator.jdk.menu.PancakeMenu;

import java.util.Arrays;

/**
 * Created by walker on 2016/8/6.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(Arrays.asList(new PancakeMenu(), new DinerMenu(),new CafeMenu()));
        waitress.printMenu();
    }
}
