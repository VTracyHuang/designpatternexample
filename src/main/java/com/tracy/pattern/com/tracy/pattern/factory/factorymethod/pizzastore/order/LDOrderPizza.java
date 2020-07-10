package com.tracy.pattern.com.tracy.pattern.factory.factorymethod.pizzastore.order;

import com.tracy.pattern.com.tracy.pattern.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.tracy.pattern.com.tracy.pattern.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 14:12
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
            pizza.setName("芝士披萨");
        }else if(orderType.equals("pepper")){
            pizza = new LDCheesePizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
