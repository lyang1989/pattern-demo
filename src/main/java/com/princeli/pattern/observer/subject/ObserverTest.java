package com.princeli.pattern.observer.subject;

import com.princeli.pattern.observer.core.Event;

import java.lang.reflect.Method;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-25 09:34
 **/
public class ObserverTest {
    public static void main(String[] args) {
        try {

            //观察者
            Observer observer = new Observer();
            Method advice = Observer.class.getMethod("advice", new Class<?>[]{Event.class} );

            Subject subject = new Subject();
            subject.addLisenter(SubjectEventType.ON_ADD,observer,advice);
            subject.addLisenter(SubjectEventType.ON_REMOVE,observer,advice);

            subject.add();
            subject.remove();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
