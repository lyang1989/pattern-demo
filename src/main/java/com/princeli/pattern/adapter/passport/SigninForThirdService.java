package com.princeli.pattern.adapter.passport;

import com.princeli.pattern.adapter.ResultMsg;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-24 14:20
 **/
public class SigninForThirdService extends SigninService{

    public ResultMsg loginForQQ(String openId){
        return loginForRegister(openId,null);
    }

    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String telphone,String code) {
        return null;
    }

    public ResultMsg loginForRegister(String username,String password) {
        ResultMsg msg = super.register(password,null);
        return super.login(username,null);
    }
}
