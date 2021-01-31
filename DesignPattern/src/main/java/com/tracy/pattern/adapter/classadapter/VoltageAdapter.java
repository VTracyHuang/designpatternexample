package com.tracy.pattern.adapter.classadapter;

/**
 * created by huangyating
 *
 * @Date 2020/11/18
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {

        //获取到220V电压
        int srcV =output220V();
        int dstV = srcV/44; //转成5V
        return dstV;
    }

}
