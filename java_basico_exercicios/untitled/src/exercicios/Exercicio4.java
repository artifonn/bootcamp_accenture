package exercicios;

//Escreva um código que receba o nome e a idade de 2 pessoas e imprima a
//diferença de idade entre elas


import java.util.Scanner;

public class Exercicio4 {
	public static void main (String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Informe o nome da primeira pessoa: ");
		var pessoa1 = scanner.next();
		System.out.println("Informe a idade da primeira pessoa: ");
		var idade1 = scanner.nextInt();
		System.out.println("Informe o nome da segunda pessoa: ");
		var pessoa2 = scanner.next();
		System.out.println("Informe a idade da segunda pessoa: ");
		var idade2 = scanner.nextInt();
		var difDeIdade = idade1 - idade2;
		System.out.printf("Pessoa 1, %s, tem %s anos \n", pessoa1, idade1);
		System.out.printf("Pessoa 2, %s, tem %s anos \n", pessoa2, idade2);
		System.out.printf("A diferença de idade é %s anos.", idade1 - idade2);
	}
}
