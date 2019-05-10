package com.princeli.pattern.proxy.dynamicproxy.custom;

import java.lang.reflect.Method;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 20:46
 **/
public class ProxyFactory implements GPInvocationHandler{

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        return GPProxy.newProxyInstance(new GPClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("custom开始执行方法日志");
        //执行目标对象方法
        Object returnValue = method.invoke(target, args);
        System.out.println("custom结束执行方法日志");
        return returnValue;
    }
}
