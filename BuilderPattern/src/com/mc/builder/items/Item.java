package com.mc.builder.items;

import com.mc.builder.pack.Packing;

/**
 * 可以点餐的项目
 * 名字
 * 价格
 * 如何打包
 */
public interface Item {
   public String name();
   public Packing packing();
   public float price();    
}