import java.util.Scanner;

public class Condicionais_if_else {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Informe o seu nome: ");
		var nome = scanner.next();
		System.out.println("Informe a sua idade: ");
		var idade = scanner.nextInt();
		System.out.println("Você é emancipado? S/N");
		var emancipado = scanner.next().equalsIgnoreCase("s");
		if (idade >= 18 ) {
			System.out.printf("Olá, %s, você está habilitado e pode dirigir!\n", nome, idade);
		} else if (idade >= 16 && emancipado) {
			System.out.printf("Olá, %s, você pode dirigir!", nome);
		}
		else {
			System.out.printf("Olá, %s, você não pode dirigir!", nome);
		}
	}
}
