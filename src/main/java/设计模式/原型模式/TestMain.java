package 设计模式.原型模式;

public class TestMain {
    public static void main(String[] args) {
        TargetClass targetClass = new TargetClass();
        targetClass.setInteger(1);
        targetClass.setString("2");
        try {
            TargetClass clone = targetClass.clone();
            System.out.println(targetClass.toString()+"---"+clone.toString());
            clone.setInteger(4);
            clone.setString("3");
            System.out.println(targetClass.toString()+"---"+clone.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
