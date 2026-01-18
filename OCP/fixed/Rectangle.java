package OCP.fixed;
/*
 * Responsabilidad: Calcular el área de un rectángulo usando ancho * alto.
 */

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override // Asegura que este método implementa correctamente el método de la interfaz
              // Shape.
    public double calculateArea() {
        return width * height;
    }
}
