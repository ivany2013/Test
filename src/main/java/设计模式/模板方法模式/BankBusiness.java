package 设计模式.模板方法模式;

public abstract class BankBusiness {
    public void takeNum(){
        System.out.println("排队取号");
    }
    public abstract void todo();

    public void feedBack(){
        System.out.println("服务反馈");
    }

    public void process(){
        takeNum();
        todo();
        feedBack();
    }
}
