class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getAreaWithBorder(double borderThickness) {
        return (sideLength + 2 * borderThickness) * (sideLength + 2 * borderThickness);
    }
}
