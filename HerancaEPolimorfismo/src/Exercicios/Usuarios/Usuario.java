package Exercicios.Usuarios;

public abstract class Usuario {

  protected String nome;
  protected String email;
  protected String senha;
  protected boolean isAdministrador;

  public Usuario(String nome, String email, String senha) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
  }

  public void realizarLogin(String email, String senha) {
    if (this.email.equals(email) && this.senha.equals(senha)) {
      System.out.println("Login realizado com sucesso: " + nome);
    } else {
      System.out.println("Email ou senha inválidos.");
    }
  }

  public void realizarLogoff() {
    System.out.println("Logoff realizado.");
  }

  public void alterarDados(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public String getEmail() {
    return email;
  }

  public boolean isAdministrador() {
    return isAdministrador;
  }
}
