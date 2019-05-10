package com.princeli.pattern.singleton;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-12 19:22
 **/
public class Singleton4 {

    private static Singleton4 instence;

    public Singleton4() {
    }

    public synchronized static Singleton4 getInstence() {
        if (instence == null) {
            instence = new Singleton4();
        }
        return instence;
    }
}
