package com.princeli.pattern.template;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-24 08:31
 **/
public abstract class Cooking {

    final void cookProcess() {
        //第一步：倒油
        this.pourOil();
        //第二步：热油
        this.HeatOil();
        //第三步：倒蔬菜
        this.pourVegetable();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }


    /**
     * 第一步：倒油是一样的，所以直接实现
     */
    void pourOil(){
        System.out.println("倒油");
    }

    /**
     * 第二步：热油是一样的，所以直接实现
     */
    void  HeatOil(){
        System.out.println("热油");
    }


    /**
     *  第三步：炒蔬菜是不一样的
     *  所以声明为抽象方法，具体由子类实现
     */
    abstract void  pourVegetable();



    /**
     *  第四步：倒调味料是不一样的
     *  所以声明为抽象方法，具体由子类实现
     */
    abstract void  pourSauce();

    /**
     * 第五步：翻炒是一样的，所以直接实现
     */
    void fry(){
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
