package Exercicios.Validador;

import java.util.Scanner;

public class Validador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o número inicial:");
		int numeroInicial = scanner.nextInt();

		int numero;
		while (true) {
			System.out.println("Informe outro número:");
			numero = scanner.nextInt();

			if (numero < numeroInicial) {
				System.out.println("Número ignorado (menor que o número inicial).");
				continue;
			}

			if (numero % numeroInicial == 0) {
				System.out.println("Número válido! (" + numero + " é divisível por " + numeroInicial + ")");
			} else {
				System.out.println("\nExecução encerrada!");
				System.out.println("O número " + numero + " NÃO é divisível por " + numeroInicial);
				break;
			}
		}

		scanner.close();
	}
}
