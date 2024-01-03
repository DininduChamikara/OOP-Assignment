public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        // Adding elements to the canvas
        canvas.addElement(new Square(5));
        canvas.addElement(new Rectangle(4, 6));
        canvas.addElement(new Circle(3));

        // Calculating total area
        System.out.println("Total Area: " + canvas.totalArea()); 
        
        // Calculating total area with border
        double borderThickness = 1;
        System.out.println("Total area with border: " + canvas.totalAreaWithBorder(borderThickness));

        // Calcualte the total border area
        System.out.println("Total border area: " + canvas.totalBorderArea(borderThickness));
       
    }
}