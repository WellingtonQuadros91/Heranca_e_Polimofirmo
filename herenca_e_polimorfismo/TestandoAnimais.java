package herenca;

public class TestandoAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro("Tevez", 10, "Au Au Au");
		Cavalo cavalo1 = new Cavalo("Pé de Pano", 20, "Relincho");
		Preguica preguica1 = new Preguica("Pedrinho", 26, "Aahhhhhhhhhhhhhh");
		
		System.out.println("Nome: " + cachorro1.getNome() + ", Idade: " + cachorro1.getIdade() + ", Som: " + cachorro1.emitirSom() + ", Deve correr: " + cachorro1.deveCorrer());
		System.out.println("Nome: " + cavalo1.getNome() + ", Idade: " + cavalo1.getIdade() + ", Som: " + cavalo1.emitirSom() + ", Deve correr: " + cavalo1.deveCorrer());
		System.out.println("Nome: " + preguica1.getNome() + ", Idade: " + preguica1.getIdade() + ", Som: " + preguica1.emitirSom() + ", Deve escalar: " + preguica1.deveEscalar());
		

	}

}
