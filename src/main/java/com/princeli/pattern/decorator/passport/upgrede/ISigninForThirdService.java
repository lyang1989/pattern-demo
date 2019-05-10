package com.princeli.pattern.decorator.passport.upgrede;

import com.princeli.pattern.decorator.passport.old.ISigninService;
import com.princeli.pattern.decorator.passport.old.ResultMsg;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-24 15:58
 **/
public interface ISigninForThirdService extends ISigninService {

    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForTelphone(String telphone, String code);

    public ResultMsg loginForRegister(String username, String password);
}