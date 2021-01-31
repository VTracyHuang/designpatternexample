package com.tracy.pattern.decorator;

/**
 * created by huangyating
 *
 * @Date 2021/1/16
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
