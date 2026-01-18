package br.com.calculadora.app;

import br.com.calculadora.model.Operacao;
import br.com.calculadora.model.RegistroOperacao;
import br.com.calculadora.service.CalculadoraService;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    CalculadoraService service = new CalculadoraService();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\n--- Calculadora Java ---");
      System.out.println("1. Calcular");
      System.out.println("2. Ver Histórico");
      System.out.println("3. Sair");
      System.out.print("Escolha: ");

      String opcao = scanner.nextLine();

      if (opcao.equals("3")) break;

      if (opcao.equals("2")) {
        System.out.println("--- Histórico ---");
        for (RegistroOperacao reg : service.getHistorico()) {
          System.out.println(reg);
        }
      }
      else if (opcao.equals("1")) {
        System.out.println("Digite os números separados por vírgula (ex: 10, 2, 3):");
        String entrada = scanner.nextLine();

        System.out.println("Operação (1-SOMA, 2-SUBTRAÇÃO, 3-MULTIPLICAÇÃO, 4-DIVISÃO):");
        int tipoOp = Integer.parseInt(scanner.nextLine());

//        Operacao operacao = (tipoOp == 1) ? Operacao.SOMA : Operacao.SUBTRACAO;

        Operacao operacao = null;

        switch (tipoOp) {
          case 1:
            operacao = Operacao.SOMA;
            break;
          case 2:
            operacao = Operacao.SUBTRACAO;
            break;
          case 3:
            operacao = Operacao.MULTIPLICACAO;
            break;
          case 4:
            operacao = Operacao.DIVISAO;
            break;
          default:
            System.out.println("Opção inválida!");
            continue;
        }

        try {
          List<Double> numeros = Arrays.stream(entrada.split(","))
              .map(String::trim)
              .map(Double::parseDouble)
              .collect(Collectors.toList());

          double resultado = service.calcular(operacao, numeros);

          System.out.printf("Resultado: %.2f%n", resultado);
        } catch (NumberFormatException e) {
          System.out.println("Erro: Digite apenas números válidos.");
        }
      }
    }
  }
}