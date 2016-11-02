package com.walker.designpatterns.decorator.inputdemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by walker on 2016/11/3.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\github\\design-patterns-java\\decorator\\src\\main\\resources\\test.txt")));
            while ((c=in.read())>= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
