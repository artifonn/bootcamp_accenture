package Exercicios.CalculosGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	// Instancia o Scanner globalmente para ler inputs
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Variável de controle do menu
		int opcao = 0;

		// Loop principal do programa
		do {
			// Exibe as opções
			System.out.println("\n---- Calculadora Geométrica ----");
			System.out.println("1 - Área do Quadrado");
			System.out.println("2 - Área do Retângulo");
			System.out.println("3 - Área do Círculo");
			System.out.println("4 - Sair");
			System.out.print("Escolha: ");

			try {
				// Lê a opção do usuário
				opcao = scanner.nextInt();
				// Limpa o buffer do teclado (consome o 'enter')
				scanner.nextLine();
			} catch (InputMismatchException e) {
				// Se digitar letra, avisa o erro
				System.out.println("Erro: Digite apenas números inteiros.");
				// Limpa o scanner para não travar
				scanner.nextLine();
				// Força o loop a rodar de novo
				opcao = -1;
				continue;
			}

			// Variável genérica para polimorfismo
			GeometricForm forma = null;

			try {
				switch (opcao) {
					case 1:
						System.out.print("Informe o lado do quadrado: ");
						// Lê o valor double
						double lado = scanner.nextDouble();
						// Instancia o Record Square
						forma = new Square(lado);
						break;
					case 2:
						System.out.print("Informe a base: ");
						double base = scanner.nextDouble();
						System.out.print("Informe a altura: ");
						double altura = scanner.nextDouble();
						// Instancia o Record Rectangle
						forma = new Rectangle(altura, base);
						break;
					case 3:
						System.out.print("Informe o raio do círculo: ");
						double raio = scanner.nextDouble();
						// Instancia o Record Circle
						forma = new Circle(raio);
						break;
					case 4:
						System.out.println("Saindo...");
						break;
					default:
						System.out.println("Opção inválida.");
				}
			} catch (InputMismatchException e) {
				// Captura erro se usuário digitar letras nas medidas
				System.out.println("Erro: Use vírgula para decimais e apenas números.");
				scanner.nextLine(); // Limpa buffer
			}

			// Se uma forma foi criada validamente, exibe a área
			if (forma != null) {
				// Formata a saída para 2 casas decimais (printf)
				System.out.printf(">> Área calculada: %.2f%n", forma.getArea());
			}

		} while (opcao != 4);

		scanner.close();
	}
}