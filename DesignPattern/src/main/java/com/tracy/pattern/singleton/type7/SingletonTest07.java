package com.tracy.pattern.singleton.type7;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/2 15:23
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类实现单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

//静态内部类完成
class Singleton{

    private static Singleton instance;

    private Singleton(){

    }
    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    //提供一个静态的公有方法，当使用到该方法时，才去创建instance

    //即懒汉式
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}


