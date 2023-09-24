package Creational.AbstractFactoryDesignPattern;

public class AbstractShapeFactory {
    static ShapeFactory getFactory(String factoryType)
    {
        if(factoryType.equals("ThreeD"))
        {
            return new ThreeDShapeFactory();
        }
        else if(factoryType.equals("TwoD"))
        {
            return new TwoDShapeFactory();
        }
        return null;
    }
}
