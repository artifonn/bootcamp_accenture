package Exercicios.Relogio;

import java.util.Scanner;

public class AppRelogio {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Relogio relogioBrasileiro = new RelogioBrasileiro();
    Relogio relogioAmericano = new RelogioAmericano();

    int opcao;

    do {
      System.out.println("\n=== MENU RELÓGIOS ===");
      System.out.println("1 - Definir horário do Relógio Brasileiro");
      System.out.println("2 - Sincronizar Relógio Americano com Brasileiro");
      System.out.println("3 - Mostrar horários");
      System.out.println("0 - Sair");
      System.out.print("Escolha uma opção: ");

      opcao = scanner.nextInt();

      try {
        switch (opcao) {
          case 1 -> definirHorario(scanner, relogioBrasileiro);
          case 2 -> {
            relogioAmericano.sincronizar(relogioBrasileiro);
            System.out.println("Relógio Americano sincronizado com sucesso.");
          }
          case 3 -> mostrarHorarios(relogioBrasileiro, relogioAmericano);
          case 0 -> System.out.println("Sistema encerrado.");
          default -> System.out.println("Opção inválida.");
        }
      } catch (IllegalArgumentException e) {
        System.out.println("Erro: " + e.getMessage());
      }

    } while (opcao != 0);

    scanner.close();
  }

  private static void definirHorario(Scanner scanner, Relogio relogio) {
    System.out.print("Hora: ");
    int hora = scanner.nextInt();

    System.out.print("Minuto: ");
    int minuto = scanner.nextInt();

    System.out.print("Segundo: ");
    int segundo = scanner.nextInt();

    relogio.setHora(hora);
    relogio.setMinuto(minuto);
    relogio.setSegundo(segundo);

    System.out.println("Horário definido com sucesso.");
  }

  private static void mostrarHorarios(Relogio relogioBR, Relogio relogioUSA) {
    System.out.println("\nHorário Brasileiro: " + relogioBR.getHorarioFormatado());
    System.out.println("Horário Americano: " + relogioUSA.getHorarioFormatado());
  }
}
