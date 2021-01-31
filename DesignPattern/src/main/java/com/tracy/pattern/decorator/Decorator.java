package com.tracy.pattern.decorator;

/**
 * created by huangyating
 *
 * @Date 2021/1/16
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj){
        this.obj = obj;
    }

    @Override
    public float cost() {

        //getPrice 获取自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " " + super.getPrice() + " && " + obj.getDes();
    }
}
