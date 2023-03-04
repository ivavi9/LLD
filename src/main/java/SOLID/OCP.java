package SOLID;

import SOLID.helper.Circle;
import SOLID.helper.Shape;
import SOLID.helper.Square;

import java.util.ArrayList;
import java.util.List;

public class OCP {


    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(21));
        shapeList.add(new Square(21,11));
        for(Shape shape: shapeList){
            System.out.println(shape.calculateArea());
        }

    }
}
