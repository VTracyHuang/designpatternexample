package com.tracy.pattern.facade;

/**
 * created by huangyating
 *
 * @Date 2021/2/1
 */
public class Screen {
    public static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("Screen up");
    }
    public void down(){
        System.out.println("Screen down");
    }

}
