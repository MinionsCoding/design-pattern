package com.mc.builder;

import com.mc.builder.items.ChickenBurger;
import com.mc.builder.items.Coke;
import com.mc.builder.items.Pepsi;
import com.mc.builder.items.VegBurger;

/**
 * 点餐
 */
public class MealBuilder {

   /**
    * 点一个蔬菜套餐
    * @return
    */
   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }

   /**
    * 点一个肉套餐
    * @return
    */
   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}