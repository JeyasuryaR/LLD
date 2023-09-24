package Creational.FactoryDesignPattern;

public class ShapeFactory {
    static Shape getShape(String shapeType)
    {
        switch(shapeType)
        {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
        }
        return null;
    }
}
