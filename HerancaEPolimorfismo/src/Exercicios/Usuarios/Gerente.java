package Exercicios.Usuarios;

public class Gerente extends Usuario {

  public Gerente(String nome, String email, String senha) {
    super(nome, email, senha);
    this.isAdministrador = true;
  }

  public void gerarRelatorioFinanceiro() {
    System.out.println("Relatório financeiro gerado.");
  }

  public void gerarRelatorioCompleto() {
    System.out.println("Relatório completo gerado.");
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
