package com.tracy.pattern.decorator;

/**
 * created by huangyating
 *
 * @Date 2021/1/16
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
