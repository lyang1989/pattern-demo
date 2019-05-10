package com.princeli.pattern.template;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-24 08:48
 **/
public class TemplateTest {
    public static void main(String[] args) {
        CookingPotatoFloss potatoFloss = new CookingPotatoFloss();
        potatoFloss.cookProcess();

        CookingTomatoEggs tomatoEggs = new CookingTomatoEggs();
        tomatoEggs.cookProcess();

    }
}
