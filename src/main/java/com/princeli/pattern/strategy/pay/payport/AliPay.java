package com.princeli.pattern.strategy.pay.payport;

import com.princeli.pattern.strategy.pay.PayState;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 12:16
 **/
public class AliPay implements Payment{
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝支付");
        System.out.println("查询账户余额，开始扣款");

        return new PayState(200,"支付成功",amount);
    }
}
