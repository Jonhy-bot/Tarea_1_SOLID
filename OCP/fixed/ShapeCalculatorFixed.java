package OCP.fixed;

import java.util.List;

//Responsabilidad: Calcular el área total de una lista de figuras.
public class ShapeCalculatorFixed {
    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea(); // Polimorfismo en uso
        }

        return totalArea;
    }

}
