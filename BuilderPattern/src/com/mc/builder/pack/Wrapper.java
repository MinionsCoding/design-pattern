package com.mc.builder.pack;

import com.mc.builder.pack.Packing;

/**
 * 纸包装
 */
public class Wrapper implements Packing {
 
   @Override
   public String pack() {
      return "Wrapper";
   }
}