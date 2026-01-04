package Exercicios.Tributos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean executando = true;
		System.out.println("---- Calculadora de Tributos ----");

		while (executando) {
			System.out.println("\nSelecione uma categoria:");
			System.out.println("1 - Alimentação");
			System.out.println("2 - Saúde e Bem Estar");
			System.out.println("3 - Vestuário");
			System.out.println("4 - Cultura");
			System.out.println("0 - Sair");
			System.out.println("Opção: ");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			if (opcao == 0) {
				executando = false;
				System.out.println("Saindo...");
				continue;
			}

			if (opcao < 1 || opcao > 4) {
				System.out.println("Opção invalida, tente novamente.");
				continue;
			}

			System.out.println("Informe o nome do prduto: ");
			String nome = scanner.nextLine();

			System.out.println("Informe o valor do produto: ");
			double valor = scanner.nextDouble();

			Tributavel produto = null;

			switch (opcao) {
				case 1 -> produto = new Alimentacao(nome, valor);
				case 2 -> produto = new Saude(nome, valor);
				case 3 -> produto = new Vestuario(nome, valor);
				case 4 -> produto = new Cultura(nome, valor);
			}

			if (produto != null) {
				System.out.println("\n --- Informações Fiscais ---");
				System.out.println("Item " + produto.nome());
				System.out.printf("Imposto a pagar: R$%.2f%n", produto.calcularTributo());
				System.out.printf("Total com imposto: R$%.2f%n", (produto.valor() + produto.calcularTributo()));
			}
		}
		scanner.close();
	}
}
