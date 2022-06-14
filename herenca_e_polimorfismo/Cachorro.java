package herenca;

public class Cachorro extends Animal {
	
	private String som;
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public Cachorro() {
		
	}
	
	public Cachorro(String nome, int idade, String som) {
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
