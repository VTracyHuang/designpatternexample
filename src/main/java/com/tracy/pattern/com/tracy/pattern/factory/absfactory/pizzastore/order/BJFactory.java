package com.tracy.pattern.com.tracy.pattern.factory.absfactory.pizzastore.order;

import com.tracy.pattern.com.tracy.pattern.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.tracy.pattern.com.tracy.pattern.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.tracy.pattern.com.tracy.pattern.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/9 15:18
 */
//这是一个工厂子类
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
