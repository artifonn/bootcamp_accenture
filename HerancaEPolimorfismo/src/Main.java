import Estudos.*;


public class Main {
  public static void main(String[] args) {
//    Animal cachorro = new Cachorro();
//    Animal gato = new Gato();
//    Animal vaca = new Vaca();

    Empregado empregado = new Gerente();

    empregado.setIdade(34);
    empregado.setNome("João");
    empregado.setCidade("Brasília - DF");
    System.out.println("O Gerente: "
        + empregado.getNome()
        + " tem " + empregado.getIdade()
        + " anos e mora em "
        + empregado.getCidade());
  }

}
