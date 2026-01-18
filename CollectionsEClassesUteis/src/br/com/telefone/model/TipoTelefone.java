package br.com.telefone.model;

public enum TipoTelefone {

	FIXO_SEM_DDD("Telefone Fixo sem DDD") {
		@Override
		public String formatar(String n) {
			return n.substring(0, 4) + "-" + n.substring(4);
		}
	},
	CELULAR_SEM_DDD("Celular sem DDD") {
		@Override
		public String formatar(String n) {
			return n.substring(0, 5) + "-" + n.substring(5);
		}
	},
	FIXO_COM_DDD("Telefone Fixo (com DDD)") {
		@Override
		public String formatar(String n) {
			return "(" + n.substring(0, 2) + ")" + n.substring(2, 6) + "-" + n.substring(6);
		}
	},
	CELULAR_COM_DDD("Celular (com DDD)") {
		@Override
		public String formatar(String n) {
			return "(" + n.substring(0, 2) + ")" + n.substring(2, 7) + "-" + n.substring(7);
		}
	},
	DESCONHECIDO("Número Inválido") {
		@Override
		public String formatar(String n) {
			return "Entrada inválida (Qtd dígitos incorreta)";
		}
	};

	private final String descricao;

	TipoTelefone(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public abstract String formatar(String numerosLimpos);
}