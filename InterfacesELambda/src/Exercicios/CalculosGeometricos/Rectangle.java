package Exercicios.CalculosGeometricos;

public record Rectangle(double height, double base) implements GeometricForm {
	public double getArea() {
		return height * base;
	}
}
