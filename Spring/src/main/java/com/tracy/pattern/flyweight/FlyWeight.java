package com.tracy.pattern.flyweight;

/**
 * created by huangyating
 *
 * @Date 2021/2/1
 */
public class FlyWeight {

    //如果Integer.valueOf(x) x 在 -128 -- 127 直接，就是使用享元模式返回，如果不在范围内，则仍然new

    //小结：
    //1.在valueOf方法中，先判断值是否在IntegerCache中，如果不在，就创建新的Integer(new),否则，就直接从缓存池返回
    //2.valueOf方法，就使用到享元模式
    //3.如果使用valueOf方法得到一个Integer ，范围在-128 --127速度比直接new更快
    public static void main(String[] args) {
        Integer x = Integer.valueOf(127);   //得到x实例，类型Integer
        Integer y = new Integer(127);   //得到y实例，类型Integer
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);   //得到y实例，类型Integer
        System.out.println(x.equals(y));      //true
        System.out.println(x == y);           //false
        System.out.println(x == z);           //true
        System.out.println(w == x);           //false
        System.out.println(w == y);           //false

        Integer x1 = Integer.valueOf(200);   //得到x1实例，类型Integer
        Integer x2 = new Integer(200);   //得到x2实例，类型Integer
        System.out.println(x1 == x2);           //false

    }
}
