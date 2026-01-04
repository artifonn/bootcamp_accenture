package Exercicios.Marketing;

public record WhatsApp(String mensagemEnviada) implements Mensagem {
	@Override
	public String getMensagem() {
		return "WhatsApp Enviado \n" + mensagemEnviada;
	}
}
