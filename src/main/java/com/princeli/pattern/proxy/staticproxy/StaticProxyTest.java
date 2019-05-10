package com.princeli.pattern.proxy.staticproxy;

import com.princeli.pattern.proxy.model.IUserDao;
import com.princeli.pattern.proxy.model.UserDao;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 08:41
 **/
public class StaticProxyTest {


    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save();
    }

}
