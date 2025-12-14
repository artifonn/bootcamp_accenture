import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();

		System.out.println("Informe um nome: ");
		String nome = scanner.next();
		System.out.println("Informe a sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("Informe a sua altura (ex: 1.80: ");
		double altura = scanner.nextDouble();

		pessoa.setNome(nome);
		pessoa.setIdade(idade);
		pessoa.setAltura(altura);

		System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade() + " altura: " + pessoa.getAultrua() + "m");

	}
}
