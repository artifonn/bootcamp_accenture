package Estudos;

public class ArCondicionado implements DispositivoEletronico {

	@Override
	public void ligar() {

		System.out.println("O ar-condicionado está ligado e gelando...");
	}

	public void desligar() {
		System.out.println("O ar-condicionado foi desligado.");
	}
}
