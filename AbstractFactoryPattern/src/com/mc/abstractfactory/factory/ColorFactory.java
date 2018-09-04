package com.mc.abstractfactory.factory;

import com.mc.abstractfactory.color.Blue;
import com.mc.abstractfactory.color.Color;
import com.mc.abstractfactory.color.Green;
import com.mc.abstractfactory.color.Red;
import com.mc.abstractfactory.shape.Shape;

/**
 * Created by huangying on 2018/9/4.
 *
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
