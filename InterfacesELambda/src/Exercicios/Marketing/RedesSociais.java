package Exercicios.Marketing;

public record RedesSociais(String mensagemEnviada) implements Mensagem {
	@Override
	public String getMensagem() {
		return "Post na Rede social \n" + mensagemEnviada;
	}
}
