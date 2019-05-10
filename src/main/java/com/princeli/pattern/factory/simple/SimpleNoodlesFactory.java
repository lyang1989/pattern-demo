package com.princeli.pattern.factory.simple;

import com.princeli.pattern.factory.model.INoodles;
import com.princeli.pattern.factory.model.LzNoodles;
import com.princeli.pattern.factory.model.PaoNoodles;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-10 16:01
 **/
public class SimpleNoodlesFactory {
    public static final int TYPE_LZ = 1;
    public static final int TYPE_PM = 2;

    public static INoodles createNoodles(int type) {
        switch (type) {
            case TYPE_LZ:
                return new LzNoodles();
            case TYPE_PM:
                return new PaoNoodles();
            default:
                return new PaoNoodles();
        }
    }
}
