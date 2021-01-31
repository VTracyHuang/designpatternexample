package com.tracy.pattern.singleton.type5;


/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/2 15:28
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("懒汉式2，线程安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton{

    private static Singleton instance;

    private Singleton(){

    }

    //提供一个静态的公有方法，计入同步处理的代码，解决线程安全,当使用到该方法时，才去创建instance
    //即懒汉式
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
