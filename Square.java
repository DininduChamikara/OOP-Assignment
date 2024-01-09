class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength + 4 * sideLength * getBorderThickness();
    }

    @Override
    public double calculateInnerArea() {
        return sideLength * sideLength;
    }
}
