package com.princeli.pattern.decorator.passport.old;


/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-24 15:54
 **/
public interface ISigninService {


    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username, String password);

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password);
}
