package Exercicios.PetShop;

public class MaquinaBanho {

  private int agua = 0;
  private int shampoo = 0;
  private boolean temPet = false;
  private boolean petLimpo = false;

  private static final int MAX_AGUA = 30;
  private static final int MAX_SHAMPOO = 10;

  public void colocarPet() {
    if (temPet) {
      System.out.println("Já existe um pet na máquina.");
      return;
    }

    if (!petLimpo && (agua < 3 || shampoo < 1)) {
      System.out.println("A máquina precisa ser limpa antes.");
      return;
    }

    temPet = true;
    petLimpo = false;
    System.out.println("Pet colocado na máquina.");
  }

  public void retirarPet() {
    if (!temPet) {
      System.out.println("Não há pet na máquina.");
      return;
    }

    if (!petLimpo) {
      System.out.println("Pet retirado sujo. Será necessário limpar a máquina.");
    } else {
      System.out.println("Pet retirado limpo.");
    }

    temPet = false;
  }

  public void darBanho() {
    if (!temPet) {
      System.out.println("Não há pet na máquina.");
      return;
    }

    if (agua < 10 || shampoo < 2) {
      System.out.println("Água ou shampoo insuficiente.");
      return;
    }

    agua -= 10;
    shampoo -= 2;
    petLimpo = true;

    System.out.println("Banho realizado com sucesso.");
  }

  public void limparMaquina() {
    if (agua < 3 || shampoo < 1) {
      System.out.println("Recursos insuficientes para limpeza.");
      return;
    }

    agua -= 3;
    shampoo -= 1;
    petLimpo = true;

    System.out.println("Máquina limpa com sucesso.");
  }

  public void abastecerAgua() {
    if (agua + 2 > MAX_AGUA) {
      System.out.println("Capacidade máxima de água atingida.");
      return;
    }

    agua += 2;
    System.out.println("Água abastecida (+2L).");
  }

  public void abastecerShampoo() {
    if (shampoo + 2 > MAX_SHAMPOO) {
      System.out.println("Capacidade máxima de shampoo atingida.");
      return;
    }

    shampoo += 2;
    System.out.println("Shampoo abastecido (+2L).");
  }

  public void verificarNivelAgua() {
    System.out.println("Nível de água: " + agua + " litros.");
  }

  public void verificarNivelShampoo() {
    System.out.println("Nível de shampoo: " + shampoo + " litros.");
  }

  public void verificarPetNaMaquina() {
    if (temPet) {
      System.out.println("Há um pet na máquina.");
    } else {
      System.out.println("Não há pet na máquina.");
    }
  }
}
