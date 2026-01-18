package OCP.fixed;
/*
 * Responsabilidad: Calcular el área de un círculo usando la fórmula π * r².
 */

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override // Asegura que este método implementa correctamente el método de la interfaz
              // Shape.
    public double calculateArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
