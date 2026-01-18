package br.com.conversor.app;

import br.com.conversor.service.GeradorArquivosService;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GeradorArquivosService service = new GeradorArquivosService();

		System.out.println("--- Conversor Multi-Formato ---");
		System.out.println("Padrão: CHAVE;VALOR;TIPO");
		System.out.println("Tipos aceitos: texto, inteiro, decimal, boleano, data (aaaa-mm-dd), data_hora, array");
		System.out.println("Exemplo: usuario;Lucas;texto");
		System.out.println("Exemplo: tags;java,code,spring;array");
		System.out.println("Digite 'GERAR' para finalizar e ver os arquivos.\n");

		while (true) {
			System.out.print("Entrada: ");
			String entrada = scanner.nextLine();

			if (entrada.equalsIgnoreCase("GERAR")) {
				break;
			}

			service.adicionarCampo(entrada);
		}

		if (service.temDados()) {
			System.out.println("\n=== SAÍDA JSON ===");
			System.out.println(service.gerarJson());

			System.out.println("\n=== SAÍDA XML ===");
			System.out.println(service.gerarXml());

			System.out.println("\n=== SAÍDA YAML ===");
			System.out.println(service.gerarYaml());
		} else {
			System.out.println("Nenhum dado informado.");
		}

		scanner.close();
	}
}