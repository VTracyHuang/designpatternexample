package com.tracy.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 14:03
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("给伦敦的胡椒披萨准备原材料");
    }
}
