package com.princeli.pattern.singleton;

/**
 * @program: pattern-demo
 * @description: 懒汉式(线程不安全)
 * @author: ly
 * @create: 2018-07-12 13:15
 **/
public class Singleton3 {

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
