package com.tracy.pattern.com.tracy.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 14:04
 */
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦的奶酪披萨");
        System.out.println("给伦敦的奶酪披萨准备原材料");
    }
}
