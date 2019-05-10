package com.princeli.pattern.strategy.pay.payport;

import com.princeli.pattern.strategy.pay.Order;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-16 11:38
 **/
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1","2018040511111",20.32);
        System.out.println(order.pay(PayType.ALI_PAY));
    }
}
