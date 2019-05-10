package com.princeli.pattern.decorator;

import com.princeli.pattern.decorator.passport.old.SigninService;
import com.princeli.pattern.decorator.passport.upgrede.SigninForThirdService;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-24 16:09
 **/
public class SigninTest {
    public static void main(String[] args) {
        SigninForThirdService signinForThirdService = new SigninForThirdService(new SigninService());

        signinForThirdService.loginForQQ("sdasdasdasd");
    }
}
