import java.util.ArrayList;
import java.util.List;

class Canvas {
    private List<Shape> elements = new ArrayList<>();

    public void addElement(Shape shape) {
        elements.add(shape);
    }

    public double totalArea() {
        return elements.stream().mapToDouble(shape -> shape.getArea()).sum();
    }

    public double totalAreaWithBorder(double borderThickness) {
        return elements.stream().mapToDouble(shape -> shape.getAreaWithBorder(borderThickness)).sum();
    }

    public double totalBorderArea(double borderThickness) {
        return totalAreaWithBorder(borderThickness) - totalArea();
    }
}