package Creational.AbstractFactoryDesignPattern;

public class ThreeDShape implements Shape{

    @Override
    public void computeRegion() {
        System.out.println("Compute volume");
    }
}
