package com.tracy.pattern.strategy.improve;

/**
 * created by huangyating
 *
 * @Date 2021/3/5
 */
public class WildDuck extends Duck {

    //构造器，传入FlyBehavior的对象
    public WildDuck(){
        flyBehavior = new GoodFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
