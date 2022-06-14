package herenca;

public class Preguica extends Animal {
	
	private String som;

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		som = som;
	}

	public Preguica() {

	}

	public Preguica(String nome, int idade, String som) {
		super(nome, idade);
		this.som = som;
	}

	public String emitirSom() {
		return som;
	}

	public String deveEscalar() {
		return "Sim";
	}

}
