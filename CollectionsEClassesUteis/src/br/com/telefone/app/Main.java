package br.com.telefone.app;

import br.com.telefone.service.FormatadorService;
import br.com.telefone.model.ResultadoFormatacao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		FormatadorService service = new FormatadorService();
		Scanner scanner = new Scanner(System.in);

		System.out.println("--- Validador de Telefones ---");

		System.out.println("Digite 'SAIR' para fechar.\n");

		while (true) {
			System.out.print("Digite a entrada: ");
			String entrada = scanner.nextLine();

			if (entrada.equalsIgnoreCase("SAIR")) break;

			ResultadoFormatacao resultado = service.processar(entrada);

			System.out.println(resultado);
			System.out.println("-----------------------------");
		}
		scanner.close();
	}
}