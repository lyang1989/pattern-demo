package com.princeli.pattern.strategy.pay.payport;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 12:23
 **/
public enum PayType {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    UNION_PAY(new UnionPay()),
    JD_PAY(new JDPay());

    private Payment payment;

    PayType(Payment payment){
        this.payment = payment;
    }

    public Payment get(){
        return this.payment;
    }

}
