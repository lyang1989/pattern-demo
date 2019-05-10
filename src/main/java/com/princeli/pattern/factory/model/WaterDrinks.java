package com.princeli.pattern.factory.model;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-12 08:50
 **/
public class WaterDrinks extends IDrinks {
    @Override
    public void prices() {
        System.out.println("免费");
    }
}
