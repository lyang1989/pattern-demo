package com.princeli.pattern.proxy.dynamicproxy.custom;


import com.princeli.pattern.proxy.model.IUserDao;
import com.princeli.pattern.proxy.model.UserDao;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 19:35
 **/
public class CustomProxyTest {
    public static void main(String[] args) {

        try {
            IUserDao target = new UserDao();
            ProxyFactory factory = new ProxyFactory(target);
            IUserDao userDao = (IUserDao)factory.getProxyInstance();
            userDao.save();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
