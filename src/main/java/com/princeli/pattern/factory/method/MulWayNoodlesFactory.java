package com.princeli.pattern.factory.method;

import com.princeli.pattern.factory.model.INoodles;
import com.princeli.pattern.factory.model.LzNoodles;
import com.princeli.pattern.factory.model.PaoNoodles;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-12 08:40
 **/
public class MulWayNoodlesFactory {

    /**
     * 模仿Executors 类
     * 生产泡面
     *
     * @return
     */
    public static INoodles createPm() {
        return new PaoNoodles();
    }

    /**
     * 模仿Executors 类
     * 生产兰州拉面
     *
     * @return
     */
    public static INoodles createLz() {
        return new LzNoodles();
    }
}
