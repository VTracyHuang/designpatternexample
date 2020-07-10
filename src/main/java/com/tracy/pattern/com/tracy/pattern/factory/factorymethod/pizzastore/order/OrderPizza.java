package com.tracy.pattern.com.tracy.pattern.factory.factorymethod.pizzastore.order;

import com.tracy.pattern.com.tracy.pattern.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 14:06
 */
public abstract class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String orderType; //订购披萨的类型
        do{
            orderType = getType();
            pizza = createPizza(orderType);
            //输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }
    //定义一个抽象方法，createPizza,让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);
    //写一个方法，可以动态获取客户希望订购的披萨种类
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
