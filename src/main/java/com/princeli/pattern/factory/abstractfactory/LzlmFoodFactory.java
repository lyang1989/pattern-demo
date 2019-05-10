package com.princeli.pattern.factory.abstractfactory;

import com.princeli.pattern.factory.model.IDrinks;
import com.princeli.pattern.factory.model.INoodles;
import com.princeli.pattern.factory.model.LzNoodles;
import com.princeli.pattern.factory.model.WaterDrinks;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-12 08:54
 **/
public class LzlmFoodFactory extends AbstractFoodFactory {
    @Override
    public INoodles createNoodles() {
        return new LzNoodles();
    }

    @Override
    public IDrinks createDrinks() {
        return new WaterDrinks();
    }
}
