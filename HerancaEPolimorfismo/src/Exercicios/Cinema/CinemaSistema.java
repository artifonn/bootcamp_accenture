package Exercicios.Cinema;

import java.util.Scanner;

public class CinemaSistema {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;

    while(opcao != 4) {
      System.out.println("\n---- BILHETERIA CINEMA (Pacote) ---");
      System.out.println("1 - Novo Ingresso Normal");
      System.out.println("2 - Novo Ingresso Meia Entrada");
      System.out.println("3 - Novo Ingresso Família");
      System.out.println("4 - Sair");
      System.out.print("Escolha uma opção: ");

      opcao = scanner.nextInt();
      scanner.nextLine();

      if(opcao >= 1 && opcao <= 3){
        System.out.print("Nome Filme: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o valor base do ingresso: ");
        double valorDoIngresso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Tipo de áudio (Dublado/Legendado?: ");
        String tipoDeAudio = scanner.next();

        Ingresso ingresso = null;

        switch (opcao) {
          case 1:
            ingresso = new Ingresso(nome, valorDoIngresso, tipoDeAudio);
            break;
          case 2:
            ingresso = new MeiaEntrada(nome, valorDoIngresso, tipoDeAudio);
            break;
          case 3:
            System.out.println("Informe o número de pessoas: ");
            int numeroDePessoas = scanner.nextInt();
            ingresso = new IngressoFamilia(nome, valorDoIngresso,tipoDeAudio, numeroDePessoas);
            break;
        }
        System.out.println("---- Resumo da Compra ----");
        System.out.println(ingresso.getDescricao());
        System.out.printf("Valor total: R$%.2f\n", + ingresso.getValorReal());
      }
    }
    scanner.close();
    System.out.println("Compra realizada com sucesso.");
    System.out.println("Sistema Finalizado.");
  }

}
