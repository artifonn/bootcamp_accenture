package Exercicios.Marketing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;

		do {
			System.out.println("\n--- Sistema de Marketing ---");
			System.out.println("Escolha o serviço de envio:");
			System.out.println("1 - E-mail");
			System.out.println("2 - SMS");
			System.out.println("3 - WhatsApp");
			System.out.println("4 - Redes Sociais");
			System.out.println("5 - Sair");
			System.out.print("Opção: ");

			try {
				opcao = scanner.nextInt();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Erro: Digite apenas números.");
				scanner.nextLine();
				opcao = -1;
				continue;
			}

			if (opcao == 5) {
				System.out.println("Encerrando sistema...");
				break;
			}

			if (opcao >= 1 && opcao <= 4) {
				System.out.println("Digite a mensagem para envio: ");
				String texto = scanner.nextLine();

				Mensagem servico = null;

				switch (opcao) {
					case 1:
						servico = new Email(texto);
						break;
					case 2:
						servico = new SMS(texto);
						break;
					case 3:
						servico = new WhatsApp(texto);
						break;
					case 4:
						servico = new RedesSociais(texto);
						break;
				}

				System.out.println("------------------------------");
				System.out.println("Status: " + servico.getMensagem());
				System.out.println("------------------------------");

			} else if (opcao != -1) {
				System.out.println("Opção inválida, tente novamente.");
			}

		} while (opcao != 5);

		scanner.close();
	}
}