package 设计模式.单例;

//饿汉式
//单例模式
//有这样的特点的一些类：
//        A．这些类只能有一个实例；
//        B．这些能够自动实例化；
//        C．这个类对整个系统可见，即必须向整个系统提供这个实例。
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton(){};

    public static Singleton getInstance(){
        return singleton;
    }

}
