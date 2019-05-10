package com.princeli.pattern.strategy.pay;

import com.princeli.pattern.strategy.pay.payport.PayType;
import com.princeli.pattern.strategy.pay.payport.Payment;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 11:28
 **/
public class Order {

    private String uid;

    private String orderId;

    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay(PayType payType){
        return payType.get().pay(this.uid,this.amount);
    }
}
