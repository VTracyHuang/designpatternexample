package com.tracy.pattern.factory.simplefactory.pizzastore.order;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 11:53
 */
public class PizzaStore {
    public static void main(String[] args) {
    //    new OrderPizza();
        //使用简单工厂模式
       /* new OrderPizza(new SimpleFactory());
        System.out.println("退出程序~");*/
       new OrderPizza2();
    }
}
