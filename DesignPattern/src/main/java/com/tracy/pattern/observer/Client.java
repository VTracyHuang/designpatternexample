package com.tracy.pattern.observer;

/**
 * created by huangyating
 *
 * @Date 2021/3/9
 */
public class Client {

    public static void main(String[] args) {
        //创建接入方currentCoditions
        CurrentConditions currentConditions = new CurrentConditions();

        //创建WeatherData并将接入方currentConditions传递到WeatherData
        WeatherData weatherData = new WeatherData(currentConditions);

        //更新天气情况
        weatherData.setData(30,150,40);

        //天气情况变化
        weatherData.setData(40,160,20);
    }
}
