package Exercicios.PetShop;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MaquinaBanho maquina = new MaquinaBanho();

    int opcao;

    do {
      System.out.println("\n==== MENU PETSHOP ====");
      System.out.println("1 - Dar banho no pet");
      System.out.println("2 - Abastecer água");
      System.out.println("3 - Abastecer shampoo");
      System.out.println("4 - Verificar nível de água");
      System.out.println("5 - Verificar nível de shampoo");
      System.out.println("6 - Verificar se tem pet na máquina");
      System.out.println("7 - Colocar pet na máquina");
      System.out.println("8 - Retirar pet da máquina");
      System.out.println("9 - Limpar máquina");
      System.out.println("0 - Sair");
      System.out.print("Escolha uma opção: ");

      opcao = scanner.nextInt();

      switch (opcao) {
        case 1 -> maquina.darBanho();
        case 2 -> maquina.abastecerAgua();
        case 3 -> maquina.abastecerShampoo();
        case 4 -> maquina.verificarNivelAgua();
        case 5 -> maquina.verificarNivelShampoo();
        case 6 -> maquina.verificarPetNaMaquina();
        case 7 -> maquina.colocarPet();
        case 8 -> maquina.retirarPet();
        case 9 -> maquina.limparMaquina();
        case 0 -> System.out.println("Encerrando o sistema...");
        default -> System.out.println("Opção inválida.");
      }

    } while (opcao != 0);

    scanner.close();
  }
}
