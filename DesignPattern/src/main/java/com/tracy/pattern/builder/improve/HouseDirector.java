package com.tracy.pattern.builder.improve;

/**
 * created by huangyating
 *
 * @Date 2020/11/17
 */
//指挥者，动态的指挥制作流程
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }


    //通过setter传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
   public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
   }
}
