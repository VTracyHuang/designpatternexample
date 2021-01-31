package com.tracy.pattern.factory.absfactory.pizzastore.order;

import com.tracy.pattern.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.tracy.pattern.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.tracy.pattern.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/9 15:22
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
