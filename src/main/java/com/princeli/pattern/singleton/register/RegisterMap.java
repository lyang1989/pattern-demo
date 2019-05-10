package com.princeli.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: pattern-demo
 * @description: 注册式单例
 * @author: ly
 * @create: 2018-07-13 16:46
 **/
public class RegisterMap {
    public RegisterMap() {
    }

    private static Map<String,Object> register = new ConcurrentHashMap<>();

    public static RegisterMap getInstance(String name) {
        if(name == null){
            name = RegisterMap.class.getName();
        }
        if(register.get(name) == null){
            register.put(name,new RegisterMap());
        }

        return  (RegisterMap) register.get(name);
    }
}
