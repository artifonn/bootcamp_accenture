package Exercicios.Usuarios;

public class Vendedor extends Usuario {

  private int quantidadeDeVendas;

  public Vendedor(String nome, String email, String senha) {
    super(nome, email, senha);
    this.isAdministrador = false;
    this.quantidadeDeVendas = 0;
  }

  public void realizarVenda() {
    quantidadeDeVendas++;
    System.out.println("Venda realizada.");
  }

  public void consultarVendas() {
    System.out.println("Total de vendas: " + quantidadeDeVendas);
  }
}
