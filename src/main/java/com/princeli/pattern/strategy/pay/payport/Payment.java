package com.princeli.pattern.strategy.pay.payport;

import com.princeli.pattern.strategy.pay.PayState;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 11:30
 **/
public interface Payment {

    public final static Payment ALI_PAY = new AliPay();
    public final static Payment JD_PAY = new JDPay();
    public final static Payment UNION_PAY = new UnionPay();
    public final static Payment WECHAT_PAY = new WechatPay();



    public PayState pay(String uid, double amount);
}
