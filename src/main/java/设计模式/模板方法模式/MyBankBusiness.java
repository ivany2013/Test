package 设计模式.模板方法模式;

public class MyBankBusiness extends BankBusiness {

    @Override
    public void todo() {
        System.out.println("取款~~");
    }


    public static void main(String[] args) {
        MyBankBusiness myBankBusiness = new MyBankBusiness();
        myBankBusiness.process();
    }
}
