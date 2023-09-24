package Creational.AbstractFactoryDesignPattern;

public class ThreeDShapeFactory implements ShapeFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equals("cube"))
        {
            return new Cube();
        }
        else if(shapeType.equals("cone"))
        {
            return new Cone();
        }
        return null;
    }
}
