package com.mc.abstractfactory.factory;

import com.mc.abstractfactory.color.Color;
import com.mc.abstractfactory.factory.AbstractFactory;
import com.mc.abstractfactory.shape.Circle;
import com.mc.abstractfactory.shape.Rectangle;
import com.mc.abstractfactory.shape.Shape;
import com.mc.abstractfactory.shape.Square;

/**
 * Created by huangying on 2018/9/4.
 *
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
