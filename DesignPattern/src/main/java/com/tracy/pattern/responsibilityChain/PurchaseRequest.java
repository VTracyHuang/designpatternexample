package com.tracy.pattern.responsibilityChain;

/**
 * created by huangyating
 *
 * @Date 2021/3/1
 */
//请求类
public class PurchaseRequest {

    private int type; // 请求类型
    private int number;
    private float price = 0.0f;
    private int id = 0;

    //构造器
    public PurchaseRequest(int i, float price, int i2) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
