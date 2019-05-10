package com.princeli.pattern.proxy.dynamicproxy.jdk;

import com.princeli.pattern.proxy.model.IUserDao;
import com.princeli.pattern.proxy.model.UserDao;

import java.lang.reflect.Proxy;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 10:25
 **/
public class JdkProxyTest {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        System.out.println(target.getClass());

        ProxyFactory factory = new ProxyFactory(target);
        IUserDao proxy = (IUserDao)factory.getProxyInstance();
        System.out.println(proxy.getClass());

        proxy.save();
    }
}
