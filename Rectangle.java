class Rectangle extends Shape {
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
    public double calculateArea() {
        return length * width + 2 * (length + width) * getBorderThickness();
    }

    @Override
    public double calculateInnerArea() {
        return length * width;
    }
}
