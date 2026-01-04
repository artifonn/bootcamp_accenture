package Exercicios.CalculosGeometricos;

public record Circle(double radius) implements GeometricForm {
	private  static  final double PI = Math.PI;

	@Override
	public double getArea() {
		return PI * (radius * radius);
	}
}
