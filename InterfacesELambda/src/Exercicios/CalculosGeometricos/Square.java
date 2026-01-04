package Exercicios.CalculosGeometricos;

public record Square(double side) implements GeometricForm {

	public double getArea() {
		return side * side;
	}
}
