package com.princeli.pattern.singleton;

/**
 * @program: pattern-demo
 * @description: 静态内部类
 * @author: ly
 * @create: 2018-07-13 08:45
 **/
public class Singleton7 {
    public Singleton7() {
    }

    public static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
