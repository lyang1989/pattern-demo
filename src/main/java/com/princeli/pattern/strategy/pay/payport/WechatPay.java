package com.princeli.pattern.strategy.pay.payport;

import com.princeli.pattern.strategy.pay.PayState;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 12:16
 **/
public class WechatPay implements Payment{
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用微信支付");
        System.out.println("直接微信红包扣款");
        return new PayState(200,"支付成功",amount);
    }
}
