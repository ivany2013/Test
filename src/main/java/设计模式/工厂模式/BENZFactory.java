package 设计模式.工厂模式;

public class BENZFactory implements CarFactory {
    @Override
    public ICar getCar() {
        return new BENZCar();
    }
}
