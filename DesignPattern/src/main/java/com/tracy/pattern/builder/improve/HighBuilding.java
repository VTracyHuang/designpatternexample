package com.tracy.pattern.builder.improve;

/**
 * created by huangyating
 *
 * @Date 2020/11/17
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 高楼的打地基100m");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高楼的砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼的透明屋顶");
    }
}
