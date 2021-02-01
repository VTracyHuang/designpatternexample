package com.tracy.pattern.facade;

/**
 * created by huangyating
 *
 * @Date 2021/2/1
 */
public class Stereo {
    public static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }
    public void on(){
        System.out.println("Stereo on");
    }
    public void off(){
        System.out.println("Stereo off");
    }
    public void up(){
        System.out.println("Stereo up");
    }
    public void down(){
        System.out.println("Stereo down");
    }
}
