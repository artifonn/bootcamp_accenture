package Exercicios.NumerosParesImpares;

import java.util.Scanner;

public class NumerosParesImpares {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = scanner.nextInt();

		System.out.println("Digite o segundo número (maior que o primeiro): ");
		int segundoNumero = scanner.nextInt();

		while (segundoNumero <= primeiroNumero) {
			System.out.println("Erro: o segundo número deve ser maior que o primeiro.");
			System.out.println("Digite novamente o segundo número: ");
			segundoNumero = scanner.nextInt();
		}

		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Números Pares");
		System.out.println("2 - Números Ímpares");
		int opcao = scanner.nextInt();

		System.out.println("\nResultado:");

		for (int i = segundoNumero; i >= primeiroNumero; i--) {
			if (opcao == 1 && i % 2 == 0) {
				System.out.println(i);
			} else if (opcao == 2 && i % 2 != 0) {
				System.out.println(i);
			}
		}

		scanner.close();
	}
}
