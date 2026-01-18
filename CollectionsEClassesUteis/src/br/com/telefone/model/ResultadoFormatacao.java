package br.com.telefone.model;

public class ResultadoFormatacao {
	private final String resultado;
	private final String tipoDescricao;
	private final boolean valido;

	public ResultadoFormatacao(String resultado, String tipoDescricao, boolean valido) {
		this.resultado = resultado;
		this.tipoDescricao = tipoDescricao;
		this.valido = valido;
	}

	@Override
	public String toString() {
		if (!valido) {
			return "Status: " + tipoDescricao;
		}
		return "Dispositivo: " + tipoDescricao + " | Número: " + resultado;
	}
}