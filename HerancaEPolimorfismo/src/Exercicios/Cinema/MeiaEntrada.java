package Exercicios.Cinema;

public class MeiaEntrada  extends Ingresso{
  public MeiaEntrada( String nomeFilme, double valor, String tipoAudio) {
    super(nomeFilme, valor, tipoAudio);
  }

  @Override
  public double getValorReal() {
    return this.valor / 2;
  }

}
