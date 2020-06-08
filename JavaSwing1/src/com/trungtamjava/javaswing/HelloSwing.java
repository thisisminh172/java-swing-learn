/*
 * tao jframe bang cach tao class
 */
package com.trungtamjava.javaswing;

import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class HelloSwing {

    public HelloSwing() {
        JFrame frame = new JFrame("HEllo");
        frame.setSize(400,400);
        frame.setVisible(true);
        //dong cua so se dong chuong trinh
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new HelloSwing();
    }
    
}
