package Exercicios.ContaBancaria;

public class Conta {

  private double saldo;
  private final double limiteChequeEspecial;
  private double chequeEspecialUsado;

  public Conta(double depositoInicial) {
    this.saldo = depositoInicial;
    this.chequeEspecialUsado = 0;

    if (depositoInicial <= 500) {
      this.limiteChequeEspecial = 50;
    } else {
      this.limiteChequeEspecial = depositoInicial * 0.5;
    }
  }

  private double saldoTotalDisponivel() {
    return saldo + (limiteChequeEspecial - chequeEspecialUsado);
  }

  public void consultarSaldo() {
    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
  }

  public void consultarChequeEspecial() {
    double disponivel = limiteChequeEspecial - chequeEspecialUsado;
    System.out.printf("Cheque especial disponível: R$ %.2f%n", disponivel);
  }

  public void verificarUsoChequeEspecial() {
    if (chequeEspecialUsado > 0) {
      System.out.printf("A conta está utilizando %s do cheque especial.", chequeEspecialUsado);
    } else {
      System.out.println("A conta NÃO está utilizando cheque especial.");
    }
  }

  public void depositar(double valor) {
    if (valor <= 0) {
      System.out.println("Valor inválido.");
      return;
    }

    if (chequeEspecialUsado > 0) {
      double taxa = chequeEspecialUsado * 0.2;
      double totalDivida = chequeEspecialUsado + taxa;

      if (valor >= totalDivida) {
        valor -= totalDivida;
        chequeEspecialUsado = 0;
        System.out.printf("Taxa de R$ %.2f cobrada pelo uso do cheque especial.%n", taxa);
      } else {
        chequeEspecialUsado -= valor;
        System.out.println("Depósito usado para abater o cheque especial.");
        return;
      }
    }

    saldo += valor;
    System.out.println("Depósito realizado com sucesso.");
  }

  public void sacar(double valor) {
    if (valor <= 0) {
      System.out.println("Valor inválido.");
      return;
    }

    if (valor > saldoTotalDisponivel()) {
      System.out.println("Saldo insuficiente.");
      return;
    }

    if (valor <= saldo) {
      saldo -= valor;
    } else {
      double restante = valor - saldo;
      saldo = 0;
      chequeEspecialUsado += restante;
    }

    System.out.println("Saque realizado com sucesso.");
  }

  public void pagarBoleto(double valor) {
    System.out.println("Pagamento de boleto:");
    sacar(valor);
  }
}
