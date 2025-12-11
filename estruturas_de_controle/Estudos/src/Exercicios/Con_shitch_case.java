package Exercicios;
import java.util.Scanner;

public class Con_shitch_case {
	public static void main (String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Informe um número entre 1 e 7: ");
		var numero = scanner.nextInt();
		switch (numero) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Opção inválida");
		}
	}
}
