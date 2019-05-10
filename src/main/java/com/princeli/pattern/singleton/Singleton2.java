package com.princeli.pattern.singleton;

/**
 * @program: pattern-demo
 * @description: 饿汉式（静态代码块）
 * @author: ly
 * @create: 2018-07-12 09:20
 **/
public class Singleton2 {
    private static Singleton2 instance;

    static{
        instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
