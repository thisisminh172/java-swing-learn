/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trungtamjava.javaswing;

/**
 *
 * @author user
 */
public class Country {
    private String code;
    private String name;

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return name; 
    }
    
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
