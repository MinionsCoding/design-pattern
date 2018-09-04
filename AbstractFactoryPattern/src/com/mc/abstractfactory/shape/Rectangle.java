package com.mc.abstractfactory.shape;

import com.mc.abstractfactory.shape.Shape;

/**
 * Created by huangying on 2018/9/4.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
