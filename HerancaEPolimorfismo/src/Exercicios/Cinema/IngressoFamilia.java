package Exercicios.Cinema;

public class IngressoFamilia extends Ingresso {
  private int numeroDePessoas;

  public IngressoFamilia (String nomeFilme, double valor, String tipoAudio, int numeroDePessoas){
    super(nomeFilme, valor, tipoAudio);
    this.numeroDePessoas = numeroDePessoas;
  }
  @Override
  public double getValorReal() {
    double total = this.valor * this.numeroDePessoas;
    if (this.numeroDePessoas > 3) {
      double desconto = total * 0.05;
      total = total - desconto;
    }
    return total;
  }
}
