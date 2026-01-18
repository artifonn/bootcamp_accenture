package br.com.telefone.service;

import br.com.telefone.model.ResultadoFormatacao;
import br.com.telefone.model.TipoTelefone;

public class FormatadorService {

	public ResultadoFormatacao processar(String entrada) {
		String apenasNumeros = entrada.replaceAll("[^0-9]", "");

		int tamanho = apenasNumeros.length();

		TipoTelefone tipoDetected = switch (tamanho) {
			case 8 -> TipoTelefone.FIXO_SEM_DDD;
			case 9 -> TipoTelefone.CELULAR_SEM_DDD;
			case 10 -> TipoTelefone.FIXO_COM_DDD;
			case 11 -> TipoTelefone.CELULAR_COM_DDD;
			default -> TipoTelefone.DESCONHECIDO;
		};

		boolean ehValido = (tipoDetected != TipoTelefone.DESCONHECIDO);

		String textoFinal = ehValido ? tipoDetected.formatar(apenasNumeros) : entrada;

		return new ResultadoFormatacao(textoFinal, tipoDetected.getDescricao(), ehValido);
	}
}