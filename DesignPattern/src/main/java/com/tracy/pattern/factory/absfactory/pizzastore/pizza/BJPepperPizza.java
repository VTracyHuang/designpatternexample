package com.tracy.pattern.factory.absfactory.pizzastore.pizza;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 14:01
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println("北京的胡椒pizza准备原材料");
    }
}
