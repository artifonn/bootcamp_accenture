package Exercicios.Tributos;

public record Vestuario(String nome, double valor) implements Tributavel {
	@Override
	public double calcularTributo() {
		return valor * 0.025;
	}
}
