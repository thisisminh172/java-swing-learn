/*
 * tao jfram bang cach ke thua
 */
package com.trungtamjava.javaswing;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class HelloWorld2 extends JFrame {

    public HelloWorld2() throws HeadlessException {
        setSize(400,400);
    }
    
    public static void main(String[] args) {
        new HelloWorld2().setVisible(true);
        
    }
    
}
