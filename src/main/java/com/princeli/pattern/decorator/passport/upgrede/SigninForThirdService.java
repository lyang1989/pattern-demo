package com.princeli.pattern.decorator.passport.upgrede;

import com.princeli.pattern.decorator.passport.old.ISigninService;
import com.princeli.pattern.decorator.passport.old.ResultMsg;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-24 15:58
 **/
public class SigninForThirdService implements ISigninForThirdService{

    public ISigninService service;

    public SigninForThirdService(ISigninService service){
        this.service = service;
    }

    @Override
    public ResultMsg register(String username, String password) {
        return service.register(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return service.login(username,password);
    }

    @Override
    public ResultMsg loginForQQ(String openId){
        return loginForRegister(openId,null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone,String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegister(String username,String password) {
        ResultMsg msg = this.register(password,null);
        return this.login(username,null);
    }
}
