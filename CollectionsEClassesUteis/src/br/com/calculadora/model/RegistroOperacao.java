package br.com.calculadora.model;

import java.util.List;

public record RegistroOperacao(Operacao operacao, List<Double> numeros, double resultado) {
	@Override
	public String toString() {
		return String.format("Operação: %s | Números: %s | Resultado: %.2f",
				operacao, numeros, resultado);
	}
}