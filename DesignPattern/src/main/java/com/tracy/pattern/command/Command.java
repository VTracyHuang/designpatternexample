package com.tracy.pattern.command;

/**
 * created by huangyating
 *
 * @Date 2021/2/23
 */
//创建命令接口
public interface Command {

    //执行动作（操作）
    void execute();

    //撤销动作（操作）
    void undo();
}
