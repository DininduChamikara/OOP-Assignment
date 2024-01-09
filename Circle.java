class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius + 2 * Math.PI * radius * getBorderThickness();
    }

    @Override
    public double calculateInnerArea() {
        return Math.PI * radius * radius;
    }
}