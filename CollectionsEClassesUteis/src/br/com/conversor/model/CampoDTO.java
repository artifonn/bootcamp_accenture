package br.com.conversor.model;

public class CampoDTO {
	private final String chave;
	private final Object valorProcessado;
	private final TipoDeDado tipo;

	public CampoDTO(String chave, Object valorProcessado, TipoDeDado tipo) {
		this.chave = chave;
		this.valorProcessado = valorProcessado;
		this.tipo = tipo;
	}

	public String getChave() {
		return chave;
	}

	public Object getValorProcessado() {
		return valorProcessado;
	}

	public TipoDeDado getTipo() {
		return tipo;
	}
}