package br.com.calculadora.service;

import br.com.calculadora.model.Operacao;
import br.com.calculadora.model.RegistroOperacao;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraService {
	private final List<RegistroOperacao> historico = new ArrayList<>();

	public double calcular(Operacao operacao, List<Double> numeros) {
		if(numeros == null || numeros.isEmpty()) return 0;
		double resultado = numeros.get(0);

		for(int i = 1; i < numeros.size(); i++) {
			resultado = operacao.executar(resultado, numeros.get(i));
		}

		RegistroOperacao registro = new RegistroOperacao(operacao, numeros, resultado);

		historico.add(registro);
		return resultado;
	}
	public List<RegistroOperacao> getHistorico() {
		return historico;
	}
}
