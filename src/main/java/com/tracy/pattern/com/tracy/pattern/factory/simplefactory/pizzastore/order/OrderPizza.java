package com.tracy.pattern.com.tracy.pattern.factory.simplefactory.pizzastore.order;

import com.tracy.pattern.com.tracy.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.tracy.pattern.com.tracy.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.tracy.pattern.com.tracy.pattern.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.tracy.pattern.com.tracy.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 11:47
 */
public class OrderPizza {

    //构造器
    /*public OrderPizza(){
        Pizza pizza = null;
        String orderType; //订购披萨的类型
        do{
            orderType = getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if(orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("芝士披萨");
            }else if(orderType.equals("pepper")){
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }*/
    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    //构造器
    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }
    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = " "; //用户输入的
        this.simpleFactory = simpleFactory; // 设置简单工厂对象
        do{
            orderType = getType();
            pizza = simpleFactory.createPizza(orderType);

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
