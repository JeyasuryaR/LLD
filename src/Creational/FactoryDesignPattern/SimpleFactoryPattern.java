package Creational.FactoryDesignPattern;

//Shape factory
public class SimpleFactoryPattern
{
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("square");
        shape.computeArea();
    }
}


