package exercicios;
import java.util.Scanner;

//Escreva um código que receba a base e a alturade um retângulo, calcule
//sua área e exiba na tela fórmula: área=base X altura

public class Exercicio3 {
	public static void main (String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Informe a base do retângulo: ");
		var base = scanner.nextInt();
		System.out.println("Informe a altura do retângulo: ");
		var altura = scanner.nextInt();
		var area = base * altura;
		System.out.printf("A área total do retângulo é %sm²: \n", area);
	}
}
