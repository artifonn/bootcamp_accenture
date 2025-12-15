package Exercicios.FuncoesDeUmCarro;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Carro carro = new Carro();
    int opcao;

    do {
      System.out.println("\n=== MENU DO CARRO ===");
      System.out.println("1 - Ligar carro");
      System.out.println("2 - Desligar carro");
      System.out.println("3 - Acelerar");
      System.out.println("4 - Diminuir velocidade");
      System.out.println("5 - Virar à esquerda");
      System.out.println("6 - Virar à direita");
      System.out.println("7 - Verificar velocidade");
      System.out.println("8 - Trocar marcha");
      System.out.println("0 - Sair");
      System.out.print("Escolha: ");

      opcao = scanner.nextInt();

      switch (opcao) {
        case 1 -> carro.ligar();
        case 2 -> carro.desligar();
        case 3 -> carro.acelerar();
        case 4 -> carro.diminuirVelocidade();
        case 5 -> carro.virar("esquerda");
        case 6 -> carro.virar("direita");
        case 7 -> System.out.println("Velocidade atual: " + carro.getVelocidade() + " km/h");
        case 8 -> {
          System.out.print("Informe a nova marcha: ");
          carro.trocarMarcha(scanner.nextInt());
        }
        case 0 -> System.out.println("Encerrando o sistema...");
        default -> System.out.println("Opção inválida.");
      }

    } while (opcao != 0);

    scanner.close();
  }
}
