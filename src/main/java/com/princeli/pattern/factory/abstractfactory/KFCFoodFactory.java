package com.princeli.pattern.factory.abstractfactory;

import com.princeli.pattern.factory.model.ColaDrinks;
import com.princeli.pattern.factory.model.IDrinks;
import com.princeli.pattern.factory.model.INoodles;
import com.princeli.pattern.factory.model.PaoNoodles;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-12 08:55
 **/
public class KFCFoodFactory extends AbstractFoodFactory {
    @Override
    public INoodles createNoodles() {
        return new PaoNoodles();
    }

    @Override
    public IDrinks createDrinks() {
        return new ColaDrinks();
    }
}
