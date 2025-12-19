package Exercicios.Usuarios;

public class Atendente extends Usuario {

  private double valorEmCaixa;

  public Atendente(String nome, String email, String senha) {
    super(nome, email, senha);
    this.isAdministrador = false;
    this.valorEmCaixa = 0.0;
  }

  public void receberPagamento(double valor) {
    if (valor > 0) {
      valorEmCaixa += valor;
      System.out.println("Pagamento recebido. Caixa: R$ " + valorEmCaixa);
    } else {
      System.out.println("Valor inválido.");
    }
  }

  public void fecharCaixa() {
    System.out.println("Caixa fechado. Total: R$ " + valorEmCaixa);
    valorEmCaixa = 0.0;
  }
}
