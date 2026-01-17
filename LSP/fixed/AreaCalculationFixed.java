package LSP.fixed;

public class AreaCalculationFixed {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        rectangle.setHeight(6);
        rectangle.setWidth(2);

        square.setSide(4);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());
    }
}
