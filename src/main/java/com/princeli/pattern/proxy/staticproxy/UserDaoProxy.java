package com.princeli.pattern.proxy.staticproxy;

import com.princeli.pattern.proxy.model.IUserDao;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 08:40
 **/
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始执行方法日志");
        target.save();//执行目标对象的方法
        System.out.println("结束执行方法日志");
    }
}
