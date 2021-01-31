package com.tracy.pattern.springmvc;

/**
 * created by huangyating
 *
 * @Date 2020/11/20
 */

//多种Controller的实现
public interface Controller {

}

class HttpController implements Controller{

    public void doHttpHandler(){
        System.out.println("http...");
    }
}

class SimpleController implements Controller{

    public void doSimpleHandler(){
        System.out.println("simple...");
    }
}

class AnnotationController implements Controller{
    public void doAnnotationHandler(){
        System.out.println("annotation...");
    }
}