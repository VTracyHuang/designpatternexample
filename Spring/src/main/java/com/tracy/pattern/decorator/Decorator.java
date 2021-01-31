package com.tracy.pattern.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * created by huangyating
 *
 * @Date 2021/1/16
 */
public class Decorator {

    public static void main(String[] args) throws IOException {

        //说明
        //1.InputStream是抽象类，类似我们前面讲的Drink
        //2.FileInputStream是InputStrem子类，类似我们前面的DeCaf，LongBlack
        //3.FilterInputStream是InputStream子类：类似我们前面的Decorator修饰者
        //4.DataInputStream是FilterInputtram子类，具体的装饰者，类似前面的Milk,Soy等
        //5.FilterInputStream类有Protected volaatile InputStream in;即含被装饰者
        //6.分析得出jdk的io体系中，就是使用装饰者模式
        DataInputStream dis = new DataInputStream(new FileInputStream("E:\\设计模式.docx"));
        System.out.println(dis.read());
        dis.close();
    }
}
