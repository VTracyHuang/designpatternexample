package com.tracy.pattern.adapter.objectadapter;

/**
 * created by huangyating
 *
 * @Date 2020/11/18
 */
public class Voltage220V {

    //输出220v的电压
    public int output220V(){
        int src = 220;
        System.out.println("电压 = " + src +"伏");
        return src;
    }
}
