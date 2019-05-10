package com.princeli.pattern.strategy.pay.payport;

import com.princeli.pattern.strategy.pay.PayState;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 12:16
 **/
public class UnionPay implements Payment{
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用银联卡支付");
        System.out.println("直接银联卡扣款");
        return new PayState(200,"支付成功",amount);
    }
}
