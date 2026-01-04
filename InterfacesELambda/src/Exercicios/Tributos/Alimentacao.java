package Exercicios.Tributos;

public record Alimentacao(String nome, double valor) implements Tributavel {
	@Override
	public double calcularTributo() {
		return valor * 0.01;
	}
}
