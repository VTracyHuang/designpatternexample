package com.tracy.pattern.factory.absfactory.pizzastore.order;

import com.tracy.pattern.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/9 15:25
 */
public class OrderPizza {
    AbsFactory fatory;
    //构造器
    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }
    private void setFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = "";  //用户输入
        this.fatory = factory;
        do{
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if(pizza != null){   //订购ok
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);
    }
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
