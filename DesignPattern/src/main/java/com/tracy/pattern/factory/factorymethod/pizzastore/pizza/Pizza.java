package com.tracy.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/6 11:43
 */
public abstract class Pizza {

    protected String name; //名字
    public abstract void prepare();

    public void bake(){
        System.out.println(name +"baking...");
    }
    public void cut(){
        System.out.println(name + "cutting...");
    }
    public void box(){
        System.out.println(name + "boxing...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
