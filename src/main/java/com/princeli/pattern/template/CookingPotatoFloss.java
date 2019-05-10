package com.princeli.pattern.template;

/**
 * @program: pattern-demo
 * @description: 炒酸辣土豆丝
 * @author: ly
 * @create: 2018-07-24 08:38
 **/
public class CookingPotatoFloss extends Cooking{
    @Override
    public void  pourVegetable(){
        System.out.println("下锅的蔬菜是土豆丝");
    }
    @Override
    public void  pourSauce(){
        System.out.println("下锅的调味料是盐，辣椒，醋");
    }
}
