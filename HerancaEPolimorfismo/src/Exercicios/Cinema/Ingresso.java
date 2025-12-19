package Exercicios.Cinema;

public class Ingresso {
  protected double valor;
  protected String nomeFilme;
  protected String tipoAudio;

  public Ingresso(String nomeFilme, double valor, String tipoAudio) {
    this.nomeFilme = nomeFilme;
    this.valor = valor;
    this.tipoAudio = tipoAudio;
  }

  public double getValorReal() {
    return this.valor;
  }

  public String getDescricao() {
    return "Filme: " + nomeFilme + " | Áudio: " + tipoAudio;
  }
}
