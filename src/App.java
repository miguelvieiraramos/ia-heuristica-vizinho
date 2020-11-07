import java.util.Arrays;

public class App {

	public static void main(String[] args) {	
		
		Acao acao = new Acao(0.42292, 0);
		Acao acao1 = new Acao(0.25685, 0);
		Acao acao2 = new Acao(0.04128, 15);
		Acao acao3 = new Acao(0.05812, 0);
		Acao acao4 = new Acao(-0.01731, 30);
		Acao acao5 = new Acao(0.09615, 25);
		Acao acao6 = new Acao(0.12039, 10);
		Acao acao7 = new Acao(0.05166, 20);
		Acao acao8 = new Acao(-0.00424, 0);
		Acao acao9 = new Acao(0.21782, 0);
		
		Acao[] acoes = {acao, acao1, acao2, acao3, acao4, acao5, acao6, acao7, acao8, acao9};
		Carteira carteira = new Carteira(acoes);
		Acao[] melhor = null;
		while((melhor = carteira.getMelhor()) != null) {
			System.out.println("Melhor:" + Arrays.toString(melhor));
		}

	}

}
