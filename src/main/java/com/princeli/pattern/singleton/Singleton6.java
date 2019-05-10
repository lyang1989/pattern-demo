package com.princeli.pattern.singleton;

/**
 * @program: pattern-demo
 * @description: 双重检查
 * @author: ly
 * @create: 2018-07-12 19:38
 **/
public class Singleton6 {
    private static volatile Singleton6 instance;

    public Singleton6() {
    }


    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
