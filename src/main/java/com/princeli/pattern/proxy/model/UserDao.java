package com.princeli.pattern.proxy.model;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 08:39
 **/
public class UserDao implements IUserDao{

    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }


}
