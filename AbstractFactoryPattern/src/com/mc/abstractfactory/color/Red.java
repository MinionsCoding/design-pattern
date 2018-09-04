package com.mc.abstractfactory.color;

/**
 * Created by huangying on 2018/9/4.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
