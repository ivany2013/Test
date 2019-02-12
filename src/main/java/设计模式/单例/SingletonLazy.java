package 设计模式.单例;
//懒汉式也是通过一个类的静态变量实现的。
// 但是并没有直接初始化。
// 而是在函数getInstance()中实例化的，也就是每次想用这个实例的时候初始化的，
// 如果已经初始化了，那么就不用初始化了，这样也很好啊，对的，其实懒汉式是比较常用的实现方式。
public class SingletonLazy {
    private static SingletonLazy singletonLazy = null;

    private SingletonLazy(){}

    public static SingletonLazy getSingletonLazy() {
        if(singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;

        //多线程环境下
//        这种方式将在方法上的声明转移到了内部的代码块中，
// 只有当singleton=null时，才需要锁机制，
// 但是如果线程A和B同时执行到了Synchronized(singleton.class)，
// 虽然也是只有一个线程能够执行，假如线程B先执行，线程B获得锁，
// 线程B执行完之后，线程A获得锁，但是此时没有检查singleton是否为空就直接执行了，
// 所以还会出现两个singleton实例的情况。于是双重检查模式（DCL）就出现了。
//        if(singletonLazy == null){
//            synchronized(SingletonLazy.class){
//                if (singletonLazy == null){
//                    singletonLazy = new SingletonLazy();
//                }
//            }
//        }
//        return singletonLazy;

    }
}
