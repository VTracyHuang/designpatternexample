package com.tracy.pattern.decorator;

/**
 * created by huangyating
 *
 * @Date 2021/1/16
 */
public class CoffeBar {
    public static void main(String[] args) {
        //装饰着模式下的订单： 2份巧克力+1份牛奶的LongBlack

        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1= " + order.cost());
        System.out.println("描述=" + order.getDes());

        //2.加一份牛奶
        order = new Milk(order);
        System.out.println("费用2= " + order.cost());
        System.out.println("描述=" + order.getDes());

        //3.加入一份巧克力
        order = new Chocolate(order);
        System.out.println("费用3= " + order.cost());
        System.out.println("描述=" + order.getDes());

        //4.再加入一份巧克力
        order = new Chocolate(order);
        System.out.println("费用3= " + order.cost());
        System.out.println("描述=" + order.getDes());
    }
}
