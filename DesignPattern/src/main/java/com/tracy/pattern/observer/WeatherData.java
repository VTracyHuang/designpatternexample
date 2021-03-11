package com.tracy.pattern.observer;

/**
 * created by huangyating
 * 类是核心
 * 1.包含最新的天气情况信息
 * 2.含有CurrrentConditions对象
 * 3.当数据有更新时，就主动的调用CurrentConditions对象update方法（含display）
 * 这样他们（接入方）就看到最新的信息
 * @Date 2021/3/9
 */
public class WeatherData {
    //温度、气压、湿度
    private float temperature;

    private float pressure;

    private float humidity;

    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void dataChange(){
        //调用接入方的update
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }

    //当数据有更新时，就调用setData
    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange,将最新的信息推送给接入方currentConditions
        dataChange();
    }
}
