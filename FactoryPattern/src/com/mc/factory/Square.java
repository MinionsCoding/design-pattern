package com.mc.factory;

/**
 * Created by huangying on 2018/9/4.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
