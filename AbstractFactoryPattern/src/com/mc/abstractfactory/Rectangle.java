package com.mc.abstractfactory;

/**
 * Created by huangying on 2018/9/4.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
