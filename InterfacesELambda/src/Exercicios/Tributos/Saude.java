package Exercicios.Tributos;

public record Saude(String nome, double valor) implements Tributavel {
	@Override
	public double calcularTributo() {
		return valor * 0.15;
	}
}
