package com.tracy.pattern.command;

/**
 * created by huangyating
 *
 * @Date 2021/2/23
 */
public class Client {

    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对电灯的操作

        //创建电灯的对象（接受者）
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        //给遥控器设置相关命令,num = 0 是电灯的开和关操作
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        System.out.println("==========按下电灯的开按钮=====");
        remoteController.onButtonWasPushed(0);
        System.out.println("==========按下电灯的关按钮=======");
        remoteController.offButtonWasPushed(0);
        System.out.println("==========按下电灯的撤销按钮=======");
        remoteController.undoButtonWasPushed();

    }
}
