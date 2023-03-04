package SOLID;

import SOLID.helper.Shape;
import SOLID.helper.Square;

public class DependencyInversion {
    private Shape shape;
    public DependencyInversion(Shape shape){
        this.shape = shape;
    }

}
class InjectDependency{
    public static void main(String[] args) {
        DependencyInversion inversion = new DependencyInversion(new Square(12,12));

    }
}
