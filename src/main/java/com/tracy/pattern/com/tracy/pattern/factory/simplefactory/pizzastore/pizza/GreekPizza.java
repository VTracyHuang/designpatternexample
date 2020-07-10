package com.tracy.pattern.com.tracy.pattern.factory.simplefactory.pizzastore.pizza;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 11:46
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
