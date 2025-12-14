public class Pessoa {

	private String nome;
	private int idade;
	private double altura;

	public String getNome(){
		return nome;
	};

	public int getIdade() {
		return idade;
	}

	public double getAultrua() {
		return altura;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public void setAltura (double altura) {
		this.altura = altura;
	}

}