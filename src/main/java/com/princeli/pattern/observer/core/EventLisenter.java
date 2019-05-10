package com.princeli.pattern.observer.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-25 09:09
 **/
public class EventLisenter {

    protected Map<Enum,Event> events = new HashMap<Enum,Event>();

    public void addLisenter(Enum eventType, Object target, Method callback){
            events.put(eventType,new Event(target,callback));
    }


    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try {
            event.getCallback().invoke(event.getTarget(),event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    protected  void trigger(Enum call){
        if (!this.events.containsKey(call)){
            return;
        }
        trigger(this.events.get(call).setTrigger(call.toString()));
    }
}
