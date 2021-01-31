package com.tracy.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 14:00
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("给北京的奶酪pizza准备原材料");
    }
}
