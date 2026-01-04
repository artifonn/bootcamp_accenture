package Estudos;

public class MinhaTv implements DispositivoEletronico {
	private  boolean ligar = false;

	@Override
	public void ligar() {
		ligar = true;
		System.out.println("TV ligada!");
	}

	public void desligar() {
		ligar = false;
		System.out.println("TV desligada!");
	}
}