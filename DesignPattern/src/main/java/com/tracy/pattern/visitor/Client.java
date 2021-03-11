package com.tracy.pattern.visitor;

import java.io.File;

/**
 * created by huangyating
 *
 * @Date 2021/2/23
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        Fail fail = new Fail();
        objectStructure.display(fail);

        Wait wait = new Wait();
        objectStructure.display(wait);

    }
}
