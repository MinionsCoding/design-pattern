package com.mc.factory;

/**
 * Created by huangying on 2018/9/4.
 *
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
