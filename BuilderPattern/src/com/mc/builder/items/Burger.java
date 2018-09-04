package com.mc.builder.items;

import com.mc.builder.pack.Packing;
import com.mc.builder.pack.Wrapper;

/**
 * 汉堡
 */
public abstract class Burger implements Item {
 
   @Override
   public Packing packing() {
      return new Wrapper();
   }
 
   @Override
   public abstract float price();
}