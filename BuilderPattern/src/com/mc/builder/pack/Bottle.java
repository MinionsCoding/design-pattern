package com.mc.builder.pack;

import com.mc.builder.pack.Packing;

/**
 * 瓶装
 */
public class Bottle implements Packing {
 
   @Override
   public String pack() {
      return "Bottle";
   }
}