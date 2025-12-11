package Exercicios.Tabuada;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {

	var scanner = new Scanner(System.in);

		System.out.println("Informe um número para gerar a tabuada de 1 até 10 desse número:");
		var numero = scanner.nextInt();

		System.out.printf("Essa é a tabuada do %d.\n", numero);
		for(var i = 1; i <= 10; i++ ){
			System.out.printf("%d X %d = %d\n", numero, i, numero * i);
		}

	}
}
