public abstract class Shape {

    private double borderThickness = 0;
    private String name;

    public double getBorderThickness() {
        return this.borderThickness;
    }

    public void setBorderThickness(double borderThickness) {
        this.borderThickness = borderThickness;
    }

    public String getName() {
        return this.name;
    };

    public abstract double calculateArea();

    protected abstract double calculateInnerArea();

    public double calculateBorderArea() {
        return calculateArea() - calculateInnerArea();
    }
}
