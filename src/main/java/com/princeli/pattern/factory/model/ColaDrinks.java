package com.princeli.pattern.factory.model;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-12 08:48
 **/
public class ColaDrinks extends IDrinks {
    @Override
    public void prices() {
        System.out.println("可乐三块五");
    }
}
