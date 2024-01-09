import java.util.ArrayList;
import java.util.List;

class Canvas {
    private List<Shape> elements = new ArrayList<>();

    public void addElement(Shape shape) {
        elements.add(shape);
    }

    public double totalArea() {
        double totalArea = 0;
        for (Shape shape : elements) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    public double totalBorderArea() {
        double totalBorderArea = 0;
        for (Shape shape : elements) {
            totalBorderArea += shape.calculateBorderArea();
        }
        return totalBorderArea;
    }

    public double totalAreaWithoutBorder(){
        double totalAreaWithoutBorder = 0;
        for (Shape shape : elements) {
            totalAreaWithoutBorder += shape.calculateInnerArea();
        }
        return totalAreaWithoutBorder;
    }
}