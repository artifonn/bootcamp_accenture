package br.com.conversor.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum TipoDeDado {

	TEXTO {
		@Override
		public Object converter(String valor) {
			return valor;
		}
		@Override
		public String formatarParaJson(Object valor) {
			return "\"" + valor + "\"";
		}
	},
	INTEIRO {
		@Override
		public Object converter(String valor) {
			return Integer.parseInt(valor.trim());
		}
		@Override
		public String formatarParaJson(Object valor) {
			return valor.toString();
		}
	},
	DECIMAL {
		@Override
		public Object converter(String valor) {
			return Double.parseDouble(valor.trim());
		}
		@Override
		public String formatarParaJson(Object valor) {
			return valor.toString();
		}
	},
	BOOLEANO {
		@Override
		public Object converter(String valor) {
			return Boolean.parseBoolean(valor.trim());
		}
		@Override
		public String formatarParaJson(Object valor) {
			return valor.toString();
		}
	},
	DATA {
		@Override
		public Object converter(String valor) {
			return LocalDate.parse(valor.trim());
		}
		@Override
		public String formatarParaJson(Object valor) {
			return "\"" + valor.toString() + "\"";
		}
	},
	DATA_HORA {
		@Override
		public Object converter(String valor) {
			return LocalDateTime.parse(valor.trim());
		}
		@Override
		public String formatarParaJson(Object valor) {
			return "\"" + valor.toString() + "\"";
		}
	},
	ARRAY {
		@Override
		public Object converter(String valor) {
			String[] itens = valor.split(",");
			return Arrays.stream(itens).map(String::trim).collect(Collectors.toList());
		}
		@Override
		public String formatarParaJson(Object valor) {
			List<?> lista = (List<?>) valor;
			return lista.stream()
					.map(item -> "\"" + item + "\"") // Coloca aspas em cada item por segurança
					.collect(Collectors.joining(", ", "[", "]"));
		}
	};

	public abstract Object converter(String valor);

	public abstract String formatarParaJson(Object valor);

	public static TipoDeDado buscarPorNome(String nome) {
		try {
			return TipoDeDado.valueOf(nome.toUpperCase().trim());
		} catch (IllegalArgumentException e) {
			return TEXTO; // Se não achar, assume que é texto
		}
	}
}