package com.princeli.pattern.observer.subject;

import com.princeli.pattern.observer.core.Event;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-25 09:01
 **/
public class Observer {

    public void advice(Event event){
        System.out.println("-----------触发事件,打印日志---------\n"+event);
    }
}
