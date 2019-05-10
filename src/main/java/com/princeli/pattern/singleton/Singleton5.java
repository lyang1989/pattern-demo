package com.princeli.pattern.singleton;

/**
 * @program: pattern-demo
 * @description: 懒汉式(线程安全，同步代码块)
 * @author: ly
 * @create: 2018-07-12 19:35
 **/
public class Singleton5 {

    private static Singleton5 instance;

    public Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (instance == null){
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
