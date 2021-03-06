package com.tracy.pattern.com.tracy.pattern.singleton.type2;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/7/2 15:11
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

//饿汉式
class Singleton{



    //1.构造器私有化，外部能new
    private Singleton(){

    }
    //2.本类内部创建对象实例
    private static Singleton instance;

    static {  //静态代码块中，创建单例对象
        instance = new Singleton();
    }

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
