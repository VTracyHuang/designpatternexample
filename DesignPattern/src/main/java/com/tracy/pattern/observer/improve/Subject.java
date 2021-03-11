package com.tracy.pattern.observer.improve;


/**
 * created by huangyating
 *
 * @Date 2021/3/9
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
