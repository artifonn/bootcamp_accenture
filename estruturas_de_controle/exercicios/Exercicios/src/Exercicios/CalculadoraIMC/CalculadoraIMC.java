package Exercicios.CalculadoraIMC;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		scanner.useLocale(Locale.forLanguageTag("pt-BR"));

		char respostaDoUsuario;

		System.out.println("----- Calculadora IMC Express -----\n");
		System.out.println("Bem-vindo! Calcule seu IMC e descubra como está sua saúde em segundos.");

		do {
			System.out.println("Informe a sua altura (em metros, ex: 1,75): ");
			double altura = scanner.nextDouble();
			System.out.println("Informe o seu peso: ");
			double peso = scanner.nextDouble();

			double imc = (peso / (altura * altura));

			System.out.printf(String.format("O seu IMC é : %.2f\n",imc));

			if (imc <= 18.5) {
				System.out.println("Abaixo do peso");
			} else if (imc <= 24.9) {
				System.out.println("Peso ideal");
			} else if (imc <= 29.9) {
				System.out.println("Levemente acima do peso");
			} else if (imc <= 34.9) {
				System.out.println("Obesidade Grau I");
			} else if (imc <= 39.9) {
				System.out.println("Obesidade Grau II (Severa)");
			} else {
				System.out.println("Obesidade III (Mórbida)");
			}

			System.out.println("Deseja calcular novamente? s/n");
			respostaDoUsuario = scanner.next().charAt(0);

		} while (respostaDoUsuario == 's' || respostaDoUsuario == 'S');
		scanner.close();
	}
}