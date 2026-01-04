package Estudos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DispositivoEletronico minhaTv = new MinhaTv();

		DispositivoEletronico meuArCondicionado = new ArCondicionado();

		Scanner scanner = new Scanner(System.in);
		int option = 0;

		do {
			System.out.println("\n[ Central ]\n");
			System.out.println("1 - Ligar a TV");
			System.out.println("2 - Desligar a TV");
			System.out.println("3 - Ligar o ar-condicionado");
			System.out.println("4 - Desligar o ar-condicionado");
			System.out.println("0 - Desligar todos os eletrodomésticos");
			System.out.println("Escolha uma opcao: ");

			try {
				option = scanner.nextInt();
			} catch (NumberFormatException error) {
				option = -1;
			}

		switch (option) {
			case 1:
				minhaTv.ligar();
				break;
			case 2:
				minhaTv.desligar();
				break;
			case 3:
				meuArCondicionado.ligar();
				break;
			case 4:
				meuArCondicionado.desligar();
				break;
			case 0:
				System.out.println("Desligando todos os eletrodomésticos...");
				break;
			default:
				System.out.println("Opção inválida");
		}
	} while (option != 0);
	}
}
