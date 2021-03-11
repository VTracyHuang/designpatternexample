package com.tracy.pattern.observer.improve;

/**
 * created by huangyating
 *
 * @Date 2021/3/9
 */
//观察者接口，由观察者来实现
public interface Observer {

    void update(float temperature, float pressure, float humidity);
}
