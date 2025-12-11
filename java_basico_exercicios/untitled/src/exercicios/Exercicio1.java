package exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String... args) {
		int anoBase = OffsetDateTime.now().getYear();
		var scanner = new Scanner(System.in);
		System.out.println("Informe o seu nome: ");
		var nome = scanner.next();
		System.out.println("Informe o ano do seu nascimento: ");
		var dataDeNascimento = scanner.nextInt();
		System.out.printf("Olá, %s, você tem %s anos! \n", nome, anoBase - dataDeNascimento);
	}
}