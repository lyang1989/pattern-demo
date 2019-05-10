package com.princeli.pattern.decorator.passport.old;



/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-24 15:55
 **/
public class SigninService implements ISigninService {
    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResultMsg register(String username, String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResultMsg login(String username, String password){
        return new ResultMsg(200,"登录成功",new Member());
    }
}
