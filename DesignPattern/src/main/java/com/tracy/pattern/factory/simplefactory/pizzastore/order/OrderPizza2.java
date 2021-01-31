package com.tracy.pattern.factory.simplefactory.pizzastore.order;

import com.tracy.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 11:47
 */
public class OrderPizza2 {

    //定义一个简单工厂对象
    Pizza pizza = null;
    String orderType;
    //构造器
    public OrderPizza2(){
        do{
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);

            //输出pizza
            if(pizza != null){ //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();

            }else {
                System.out.println("订购披萨失败");
                break;
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
