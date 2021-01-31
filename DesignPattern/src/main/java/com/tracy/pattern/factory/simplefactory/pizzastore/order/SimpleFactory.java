package com.tracy.pattern.factory.simplefactory.pizzastore.order;

import com.tracy.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.tracy.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.tracy.pattern.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.tracy.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 13:18
 */
//简单工厂类
public class SimpleFactory {

    //根据orderType 返回对应的Pizza对象
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("芝士披萨");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

    //简单工厂模式 也叫 静态工厂模式
    public static Pizza createPizza2(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式2");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("芝士披萨");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
