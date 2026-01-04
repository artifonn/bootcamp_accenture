package Exercicios.Marketing;

import java.util.Scanner;

public record Email(String mensagemEnviada) implements Mensagem {
	public String getMensagem(){ return "E-mail enviado \n" + mensagemEnviada;};

}
