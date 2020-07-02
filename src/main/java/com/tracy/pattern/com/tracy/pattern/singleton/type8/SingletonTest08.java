package com.tracy.pattern.com.tracy.pattern.singleton.type8;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/2 17:38
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//使用枚举，可以实现单例
enum Singleton{
    INSTANCE; //属性
    public void sayOK(){
        System.out.println("ok");
    }
}