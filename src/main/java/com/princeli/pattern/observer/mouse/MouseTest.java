package com.princeli.pattern.observer.mouse;

import com.princeli.pattern.observer.core.Event;

import java.lang.reflect.Method;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-25 10:30
 **/
public class MouseTest {

    public static void main(String[] args) {
        try {
            MouseEventCallback callback = new MouseEventCallback();
            Method onClick = MouseEventCallback.class.getMethod("onClick",Event.class);


            Mouse mouse = new Mouse();
            mouse.addLisenter(MouseEventType.ON_CLICK,callback,onClick);
            mouse.click();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
