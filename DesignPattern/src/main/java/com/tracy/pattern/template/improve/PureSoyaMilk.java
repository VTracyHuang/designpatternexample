package com.tracy.pattern.template.improve;

/**
 * created by huangyating
 *
 * @Date 2021/2/5
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCodiments() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
