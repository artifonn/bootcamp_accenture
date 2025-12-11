package Exercicios;

import java.util.Scanner;

public class EstruturaFor {
	public static void main (String[] argas) {
		var scanner = new Scanner(System.in);
		System.out.println("Informe um número entre 1 e 10: ");
		var numero = scanner.nextInt();
		for(var i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d%n\n", numero, i, numero * i);
		}
	}
}
