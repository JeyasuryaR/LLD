package Creational.AbstractFactoryDesignPattern;

public class AbstartFactoryPattern {
    public static void main(String[] args)
    {
        ShapeFactory factory = AbstractShapeFactory.getFactory("TwoD");
        Shape shape = factory.getShape("circle");
        shape.computeRegion();
    }
}
