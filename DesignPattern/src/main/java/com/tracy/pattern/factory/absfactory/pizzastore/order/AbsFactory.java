package com.tracy.pattern.factory.absfactory.pizzastore.order;


import com.tracy.pattern.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/9 15:15
 */
//一个抽象工厂模式的抽象层（接口）
public interface AbsFactory {

    //让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);

}
