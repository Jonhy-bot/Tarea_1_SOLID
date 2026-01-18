package OCP.fixed;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(1.5);
        Rectangle rectangle = new Rectangle(4.5, 2.1);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);

        ShapeCalculatorFixed calculator = new ShapeCalculatorFixed();
        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.println("Área del círculo: " + circle.calculateArea());
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());
        System.out.println("Área total: " + totalArea);
    }
}
