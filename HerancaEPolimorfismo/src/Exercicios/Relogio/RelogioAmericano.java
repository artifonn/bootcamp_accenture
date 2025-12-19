package Exercicios.Relogio;

public class RelogioAmericano extends Relogio {
  @Override
  public void setHora(int hora) {
    if (hora < 1 || hora > 12) {
      throw new IllegalArgumentException(
          "Relógio americano aceita apenas horas entre 1 e 12"
      );
    }
    this.hora = hora;
  }

  @Override
  public void sincronizar(Relogio relogio){
    int horaConvertida = relogio.getHora();

    if(horaConvertida > 12 ) {
      horaConvertida -= 12;
    }
    if(horaConvertida == 0){
      horaConvertida = 12;
    }
    this.setHora(horaConvertida);
    this.setMinuto(relogio.getMinuto());
    this.setSegundo(relogio.getSegundo());
  }
}
