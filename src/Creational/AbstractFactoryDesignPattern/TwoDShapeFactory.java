package Creational.AbstractFactoryDesignPattern;

public class TwoDShapeFactory implements ShapeFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equals("triangle"))
        {
            return new Triangle();
        }
        else if(shapeType.equals("circle"))
        {
            return new Circle();
        }
        return null;
    }
}
