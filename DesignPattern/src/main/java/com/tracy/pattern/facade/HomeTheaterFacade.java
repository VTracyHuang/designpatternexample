package com.tracy.pattern.facade;

/**
 * created by huangyating
 *
 * @Date 2021/2/1
 */
public class HomeTheaterFacade {

    //定义各个子系统的对象
    private TheaterLight theaterLight;

    private Stereo stereo;

    private Screen screen;

    private Projector projector;

    private PopcornPoper popcornPoper;

    private DVDPlayer dvdPlayer;

    //构造器

    public HomeTheaterFacade() {
        super();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcornPoper =PopcornPoper.getInstance();
        this.screen = Screen.getInstance();
        this.projector = Projector.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }


    //操作分四步
    public void ready(){
        popcornPoper.on();
        popcornPoper.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcornPoper.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
