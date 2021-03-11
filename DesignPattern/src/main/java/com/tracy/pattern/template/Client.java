package com.tracy.pattern.template;

/**
 * created by huangyating
 *
 * @Date 2021/2/5
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=========制作红豆豆浆========");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("========制作花生豆浆========");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
