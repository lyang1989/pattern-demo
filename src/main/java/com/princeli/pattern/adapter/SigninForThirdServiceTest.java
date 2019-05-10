package com.princeli.pattern.adapter;

import com.princeli.pattern.adapter.passport.SigninForThirdService;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-24 14:32
 **/
public class SigninForThirdServiceTest {
    public static void main(String[] args) {
        SigninForThirdService service = new SigninForThirdService();

        service.loginForQQ("dsadasdasddddddddddddddddd");
    }
}
