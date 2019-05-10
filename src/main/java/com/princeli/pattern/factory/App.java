package com.princeli.pattern.factory;

import com.princeli.pattern.factory.abstractfactory.AbstractFoodFactory;
import com.princeli.pattern.factory.abstractfactory.KFCFoodFactory;
import com.princeli.pattern.factory.method.MulWayNoodlesFactory;
import com.princeli.pattern.factory.model.INoodles;
import com.princeli.pattern.factory.normal.LzFactory;
import com.princeli.pattern.factory.normal.NoodlesFactory;
import com.princeli.pattern.factory.simple.SimpleNoodlesFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //简单工厂
        INoodles noodles = SimpleNoodlesFactory.createNoodles(SimpleNoodlesFactory.TYPE_LZ);
        noodles.desc();

        //普通工厂
        NoodlesFactory factory = new LzFactory();
        noodles = factory.create();
        noodles.desc();

        //多方法工厂
        INoodles lz2 = MulWayNoodlesFactory.createLz();
        lz2.desc();

        //抽象工厂
        AbstractFoodFactory abstractFoodFactory1 = new KFCFoodFactory();
        abstractFoodFactory1.createDrinks().prices();
        abstractFoodFactory1.createNoodles().desc();

    }
}
