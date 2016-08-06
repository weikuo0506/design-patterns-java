package com.walker.designpatterns.template.beverage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by walker on 2016/8/6.
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "this is a test ...";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("template method ...");
    }

}
