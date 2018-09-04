package com.mc.builder.items;

import com.mc.builder.items.Item;
import com.mc.builder.pack.Bottle;
import com.mc.builder.pack.Packing;

/**
 * 冷饮
 */
public abstract class ColdDrink implements Item {
 
    @Override
    public Packing packing() {
       return new Bottle();
    }
 
    @Override
    public abstract float price();
}