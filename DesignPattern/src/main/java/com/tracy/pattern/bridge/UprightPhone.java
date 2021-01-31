package com.tracy.pattern.bridge;

/**
 * created by huangyating
 *
 * @Date 2021/1/16
 */
public class UprightPhone extends Phone {

    public UprightPhone(Brand brand) {
        super(brand);
    }
    public void open(){
        super.open();
        System.out.println("直立样式手机");
    }

    public void close(){
        super.close();
        System.out.println("直立样式手机");
    }

    public void call(){
        super.call();
        System.out.println("直立样式手机");
    }
}
