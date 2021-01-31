package com.tracy.pattern.builder;

/**
 * created by huangyating
 *
 * @Date 2020/11/18
 */
public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //砌墙
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
