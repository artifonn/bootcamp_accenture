package Exercicios.FuncoesDeUmCarro;

import java.util.Scanner;

public class Carro {

  private boolean ligado;
  private int velocidade;
  private int marcha; // 0 = ponto morto

  public Carro() {
    this.ligado = false;
    this.velocidade = 0;
    this.marcha = 0;
  }

  public boolean isLigado() {
    return ligado;
  }

  public int getVelocidade() {
    return velocidade;
  }

  public int getMarcha() {
    return marcha;
  }

  public void ligar() {
    if (!ligado) {
      ligado = true;
      System.out.println("Carro ligado.");
    } else {
      System.out.println("O carro já está ligado.");
    }
  }

  public void desligar() {
    if (isLigado() && getMarcha() == 0 && velocidade == 0) {
      ligado = false;
      System.out.println("Carro desligado.");
    } else {
      System.out.println("Para desligar, o carro deve estar em ponto morto e parado.");
    }
  }

  public void acelerar() {
    if (!ligado) {
      System.out.println("O carro está desligado.");
      return;
    }

    if (marcha == 0) {
      System.out.println("Não é possível acelerar em ponto morto.");
      return;
    }

    if (velocidade < 120 && velocidadePermitida()) {
      velocidade++;
      System.out.println("Acelerando: " + velocidade + " km/h");
    } else {
      System.out.println("Velocidade não permitida para a marcha atual.");
    }
  }

  public void diminuirVelocidade() {
    if (!ligado) {
      System.out.println("O carro está desligado.");
      return;
    }

    if (velocidade > 0) {
      velocidade--;
      System.out.println("Diminuindo velocidade: " + velocidade + " km/h");
    }
  }

  public void trocarMarcha(int novaMarcha) {
    if (!ligado) {
      System.out.println("O carro está desligado.");
      return;
    }

    if (Math.abs(novaMarcha - marcha) != 1) {
      System.out.println("Não é permitido pular marchas.");
      return;
    }

    if (novaMarcha < 0 || novaMarcha > 6) {
      System.out.println("Marcha inválida.");
      return;
    }

    if (!velocidadePermitidaParaMarcha(novaMarcha)) {
      System.out.println("Velocidade incompatível para a troca de marcha.");
      return;
    }

    marcha = novaMarcha;
    System.out.println("Marcha trocada para: " + marcha);
  }

  public void virar(String direcao) {
    if (!ligado) {
      System.out.println("O carro está desligado.");
      return;
    }

    if (velocidade >= 1 && velocidade <= 40) {
      System.out.println("Virando para a " + direcao);
    } else {
      System.out.println("Velocidade incompatível para virar.");
    }
  }

  private boolean velocidadePermitida() {
    return switch (marcha) {
      case 1 -> velocidade <= 20;
      case 2 -> velocidade > 20 && velocidade <= 40;
      case 3 -> velocidade > 40 && velocidade <= 60;
      case 4 -> velocidade > 60 && velocidade <= 80;
      case 5 -> velocidade > 80 && velocidade <= 100;
      case 6 -> velocidade > 100 && velocidade <= 120;
      default -> false;
    };
  }

  private boolean velocidadePermitidaParaMarcha(int novaMarcha) {
    switch (novaMarcha) {
      case 1: return velocidade <= 20;
      case 2: return velocidade > 20 && velocidade <= 40;
      case 3: return velocidade > 40 && velocidade <= 60;
      case 4: return velocidade > 60 && velocidade <= 80;
      case 5: return velocidade > 80 && velocidade <= 100;
      case 6: return velocidade > 100 && velocidade <= 120;
      default: return false;
    }
  }

  public static void main(String[] args) {
    Carro carro = new Carro();
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
      System.out.println("\nMenu:");
      System.out.println("1 - Ligar o carro");
      System.out.println("2 - Desligar o carro");
      System.out.println("3 - Acelerar");
      System.out.println("4 - Diminuir velocidade");
      System.out.println("5 - Trocar marcha");
      System.out.println("6 - Virar");
      System.out.println("7 - Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          carro.ligar();
          break;
        case 2:
          carro.desligar();
          break;
        case 3:
          carro.acelerar();
          break;
        case 4:
          carro.diminuirVelocidade();
          break;
        case 5:
          System.out.print("Digite a nova marcha (1-6): ");
          int novaMarcha = scanner.nextInt();
          carro.trocarMarcha(novaMarcha);
          break;
        case 6:
          System.out.print("Digite a direção (esquerda/direita): ");
          String direcao = scanner.next();
          carro.virar(direcao);
          break;
        case 7:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida.");
      }
    } while (opcao != 7);

    scanner.close();
  }
}
