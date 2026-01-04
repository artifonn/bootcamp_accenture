package Exercicios.Tributos;

public record Cultura(String nome, double valor) implements Tributavel {
	@Override
	public double calcularTributo() {
		return valor * 0.04;
	}
}
