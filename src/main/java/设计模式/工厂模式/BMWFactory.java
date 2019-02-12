package 设计模式.工厂模式;

public class BMWFactory implements CarFactory {

    @Override
    public ICar getCar() {
        return new BMWCar();
    }
}
