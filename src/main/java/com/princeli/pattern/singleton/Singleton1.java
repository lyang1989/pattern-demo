package com.princeli.pattern.singleton;

/**
 * @program: pattern-demo
 * @description: 饿汉式（静态常量）
 * @author: ly
 * @create: 2018-07-12 09:17
 **/
public class Singleton1 {
    private final static Singleton1 INSTANCE = new Singleton1();

    public Singleton1() {
    }

    public static Singleton1 getInstance(){
        return  INSTANCE;
    }
}
