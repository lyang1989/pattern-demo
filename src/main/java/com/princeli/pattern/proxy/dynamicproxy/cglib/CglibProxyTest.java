package com.princeli.pattern.proxy.dynamicproxy.cglib;

import com.princeli.pattern.proxy.model.UserDao;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 10:41
 **/
public class CglibProxyTest {
    public static void main(String[] args) {
        UserDao target = new UserDao();
        ProxyFactory factory = new ProxyFactory(target);
        UserDao userDao = (UserDao)factory.getProxyInstance();
        userDao.save();
    }
}
