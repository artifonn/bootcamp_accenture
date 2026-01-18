package br.com.conversor.service;

import br.com.conversor.model.CampoDTO;
import br.com.conversor.model.TipoDeDado;

import java.util.ArrayList;
import java.util.List;

public class GeradorArquivosService {

	private final List<CampoDTO> campos = new ArrayList<>();

	public void adicionarCampo(String entrada) {
		String[] partes = entrada.split(";");

		if (partes.length < 3) {
			System.out.println("Erro: Entrada incompleta. Use: CHAVE;VALOR;TIPO");
			return;
		}

		String chave = partes[0].trim();
		String valorString = partes[1].trim();
		String tipoString = partes[2].trim();

		try {
			TipoDeDado tipoEnum = TipoDeDado.buscarPorNome(tipoString);

			Object valorConvertido = tipoEnum.converter(valorString);

			campos.add(new CampoDTO(chave, valorConvertido, tipoEnum));
			System.out.println("Campo '" + chave + "' adicionado com sucesso.");

		} catch (Exception e) {
			System.out.println("Erro ao converter valor: " + e.getMessage());
		}
	}

	public String gerarJson() {
		StringBuilder json = new StringBuilder();
		json.append("{\n");

		for (int i = 0; i < campos.size(); i++) {
			CampoDTO campo = campos.get(i);

			json.append("  \"").append(campo.getChave()).append("\": ");
			json.append(campo.getTipo().formatarParaJson(campo.getValorProcessado()));

			if (i < campos.size() - 1) {
				json.append(",");
			}
			json.append("\n");
		}
		json.append("}");
		return json.toString();
	}

	public String gerarXml() {
		StringBuilder xml = new StringBuilder();
		xml.append("<root>\n"); // Raiz do XML

		for (CampoDTO campo : campos) {
			xml.append("  <").append(campo.getChave()).append(">");
			xml.append(campo.getValorProcessado().toString());
			xml.append("</").append(campo.getChave()).append(">\n");
		}

		xml.append("</root>");
		return xml.toString();
	}

	public String gerarYaml() {
		StringBuilder yaml = new StringBuilder();
		yaml.append("---\n");

		for (CampoDTO campo : campos) {
			yaml.append(campo.getChave()).append(": ");

			yaml.append(campo.getValorProcessado().toString());
			yaml.append("\n");
		}
		return yaml.toString();
	}

	public boolean temDados() {
		return !campos.isEmpty();
	}
}