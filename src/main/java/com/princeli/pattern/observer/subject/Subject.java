package com.princeli.pattern.observer.subject;

import com.princeli.pattern.observer.core.EventLisenter;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-25 08:59
 **/
public class Subject extends EventLisenter {

    public void add(){
        System.out.println("调用添加的方法");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remove(){
        System.out.println("调用删除方法");
        trigger(SubjectEventType.ON_REMOVE);
    }
}
