class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getAreaWithBorder(double borderThickness) {
        return 3.14 * (radius + borderThickness) * (radius + borderThickness);
    }
}