package Exercicios.Usuarios;

import java.util.Scanner;

public class SistemaUsuario {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
      System.out.println("\n=== MENU PRINCIPAL ===");
      System.out.println("1 - Login como Gerente");
      System.out.println("2 - Login como Vendedor");
      System.out.println("3 - Login como Atendente");
      System.out.println("0 - Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();
      scanner.nextLine();

      switch (opcao) {
        case 1 -> menuGerente(scanner);
        case 2 -> menuVendedor(scanner);
        case 3 -> menuAtendente(scanner);
        case 0 -> System.out.println("Sistema finalizado.");
        default -> System.out.println("Opção inválida.");
      }
    } while (opcao != 0);

    scanner.close();
  }

  private static void menuGerente(Scanner scanner) {
    System.out.print("Nome: ");
    String nome = scanner.nextLine();
    System.out.print("Email: ");
    String email = scanner.nextLine();
    System.out.print("Senha: ");
    String senha = scanner.nextLine();

    Gerente gerente = new Gerente(nome, email, senha);
    gerente.realizarLogin(email, senha);

    System.out.println("1 - Relatório Financeiro");
    System.out.println("2 - Relatório Completo");
    int opcao = scanner.nextInt();
    scanner.nextLine();

    if (opcao == 1) {
      gerente.gerarRelatorioFinanceiro();
    } else if (opcao == 2) {
      gerente.gerarRelatorioCompleto();
    }
  }

  private static void menuVendedor(Scanner scanner) {
    System.out.print("Nome: ");
    String nome = scanner.nextLine();
    System.out.print("Email: ");
    String email = scanner.nextLine();
    System.out.print("Senha: ");
    String senha = scanner.nextLine();

    Vendedor vendedor = new Vendedor(nome, email, senha);
    vendedor.realizarLogin(email, senha);

    int opcao;
    do {
      System.out.println("\n1 - Realizar venda");
      System.out.println("2 - Consultar vendas");
      System.out.println("0 - Voltar");
      opcao = scanner.nextInt();
      scanner.nextLine();

      if (opcao == 1) {
        vendedor.realizarVenda();
      } else if (opcao == 2) {
        vendedor.consultarVendas();
      }
    } while (opcao != 0);
  }

  private static void menuAtendente(Scanner scanner) {
    System.out.print("Nome: ");
    String nome = scanner.nextLine();
    System.out.print("Email: ");
    String email = scanner.nextLine();
    System.out.print("Senha: ");
    String senha = scanner.nextLine();

    Atendente atendente = new Atendente(nome, email, senha);
    atendente.realizarLogin(email, senha);

    int opcao;
    do {
      System.out.println("\n1 - Receber pagamento");
      System.out.println("2 - Fechar caixa");
      System.out.println("0 - Voltar");
      opcao = scanner.nextInt();

      if (opcao == 1) {
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        atendente.receberPagamento(valor);
      } else if (opcao == 2) {
        atendente.fecharCaixa();
      }
    } while (opcao != 0);
  }
}
