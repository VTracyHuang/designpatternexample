package com.tracy.pattern.facade;

/**
 * created by huangyating
 *
 * @Date 2021/2/1
 */
public class Client {


    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
