/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    }
    
    public static void main(String[] args) {
        new HelloSwing();
    }
    
}
