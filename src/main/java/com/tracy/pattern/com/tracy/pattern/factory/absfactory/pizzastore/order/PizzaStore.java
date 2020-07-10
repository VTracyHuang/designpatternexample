package com.tracy.pattern.com.tracy.pattern.factory.absfactory.pizzastore.order;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/9 15:31
 */
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
