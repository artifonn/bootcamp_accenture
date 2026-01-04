package Exercicios.Marketing;

public record SMS(String mensagemEnviada) implements Mensagem{
	@Override
	public String getMensagem() {
		return "SMS enviado: \n" + mensagemEnviada;
	}

}
