package com.princeli.pattern.factory.method;

import com.princeli.pattern.factory.model.INoodles;
import com.princeli.pattern.factory.model.LzNoodles;
import com.princeli.pattern.factory.normal.NoodlesFactory;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-12 08:36
 **/
public class LzFactory implements INoodlesFactory{
    @Override
    public INoodles create() {
        return new LzNoodles();
    }
}
