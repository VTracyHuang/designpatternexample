package com.tracy.pattern.adapter.objectadapter;

/**
 * created by huangyating
 *
 * @Date 2020/11/18
 */
public class Phone {

    //充电
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压为5V,可以充电");
        }else if(iVoltage5V.output5V() > 5){
            System.out.println("电压高于5V,不能充电");
        }
    }
}
