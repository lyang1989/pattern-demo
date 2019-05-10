package com.princeli.pattern.factory.normal;

import com.princeli.pattern.factory.model.INoodles;
import com.princeli.pattern.factory.model.LzNoodles;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-12 08:36
 **/
public class LzFactory extends  NoodlesFactory{
    @Override
    public INoodles create() {
        return new LzNoodles();
    }
}
