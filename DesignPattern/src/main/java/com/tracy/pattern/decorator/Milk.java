package com.tracy.pattern.decorator;

/**
 * created by huangyating
 *
 * @Date 2021/1/16
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }

}
