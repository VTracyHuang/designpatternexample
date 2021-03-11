package com.tracy.pattern.strategy.improve;

/**
 * created by huangyating
 *
 * @Date 2021/3/5
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术高超");
    }
}
