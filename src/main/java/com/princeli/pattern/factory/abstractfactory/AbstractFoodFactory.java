package com.princeli.pattern.factory.abstractfactory;

import com.princeli.pattern.factory.model.IDrinks;
import com.princeli.pattern.factory.model.INoodles;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-12 08:53
 **/
public abstract class AbstractFoodFactory {

    /**
     * 生产面条
     *
     * @return
     */
    public abstract INoodles createNoodles();

    /**
     * 生产饮料
     */
    public abstract IDrinks createDrinks();
}
