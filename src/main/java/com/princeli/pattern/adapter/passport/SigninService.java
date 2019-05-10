package com.princeli.pattern.adapter.passport;

import com.princeli.pattern.adapter.Member;
import com.princeli.pattern.adapter.ResultMsg;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-24 11:19
 **/
public class SigninService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }


}
