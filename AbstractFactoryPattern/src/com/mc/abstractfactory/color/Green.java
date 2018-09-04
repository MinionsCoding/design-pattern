package com.mc.abstractfactory.color;

import com.mc.abstractfactory.color.Color;

/**
 * Created by huangying on 2018/9/4.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
