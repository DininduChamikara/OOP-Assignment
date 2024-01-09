public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        // Create shapes
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(3);

        // Set border thickness for each shape
        square.setBorderThickness(1.5);
        rectangle.setBorderThickness(2);
        circle.setBorderThickness(1);

        // Add shapes to the canvas
        canvas.addElement(square);
        canvas.addElement(rectangle);
        canvas.addElement(circle);

        // Calculating total area
        System.out.println("Total Area: " + canvas.totalArea()); 
        
        // Calculating total area without border
        System.out.println("Total area without border: " + canvas.totalAreaWithoutBorder());

        // Calcualte the total border area
        System.out.println("Total border area: " + canvas.totalBorderArea());
    }
}