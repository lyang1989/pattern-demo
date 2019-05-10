package com.princeli.pattern.template;

/**
 * @program: pattern-demo
 * @description: 抄西红柿鸡蛋
 * @author: ly
 * @create: 2018-07-24 08:37
 **/
public class CookingTomatoEggs extends Cooking{

    @Override
    public void  pourVegetable(){
        System.out.println("下锅的蔬菜是西红柿和鸡蛋");
    }

    @Override
    public void  pourSauce(){
        System.out.println("下锅的调味料是盐");
    }
}
