package exercicios;

import java.util.Scanner;

//Escreva um código que receba o tamanho do lado de um quadrado,
//calcule sua área e exiba na tela fórmula: área=lado X lado
public class Exercicio2 {
	public static void main (String... args) {
		var scanner = new Scanner(System.in);
		System.out.println("Informe o tamanho de um lado do quadrado: ");
		var lado = scanner.nextInt();
		System.out.printf("A área total do quadrado é %sm²", lado * lado);
	}
}
