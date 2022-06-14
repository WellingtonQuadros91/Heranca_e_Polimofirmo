package herenca;

public class Cavalo extends Animal {
	
	private String som;

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public Cavalo() {
	}

	public Cavalo(String nome, int idade, String som) {
		super(nome, idade);
		this.som = som;
	}

	public String emitirSom() {
		return som;
	}

	public String deveCorrer() {
		return "Sim";
	}

}
