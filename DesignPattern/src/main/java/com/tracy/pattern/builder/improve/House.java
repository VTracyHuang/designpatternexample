package com.tracy.pattern.builder.improve;

/**
 * created by huangyating
 *
 * @Date 2020/11/17
 */


public class House {
    private String basic;
    private String wall;
    private String roofed;

    public House() {
    }

    public House(String basic, String wall, String roofed) {
        this.basic = basic;
        this.wall = wall;
        this.roofed = roofed;
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
