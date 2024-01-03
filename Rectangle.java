class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getAreaWithBorder(double borderThickness) {
        return (length + 2 * borderThickness) * (width + 2 * borderThickness);
    }
}
