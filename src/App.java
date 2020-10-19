import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numeros =  {1, 2, 3, 4, 5};
//		ArrayList<int[]> vizinhos = new ArrayList<int[]>();
//		int aux;
//		for (int i = 0; i < numeros.length; i++) {
//			aux = numeros[i];
//			for (int j = i + 1; j < numeros.length; j++) {
//				int[] numerosAux = new int[5];
//				System.arraycopy(numeros, 0, numerosAux, 0, 5);
//				numerosAux[i] = numeros[j];
//				numerosAux[j] = aux;
//				vizinhos.add(numerosAux);
//			}
//		}
//		
//		for(int[] vizinho : vizinhos) {
//			System.out.println(Arrays.toString(vizinho));
//		}
		
		Acao acao = new Acao(0.42292, 20);
		Acao acao1 = new Acao(0.25685, 0);
		Acao acao2 = new Acao(0.04128, 0);
		Acao acao3 = new Acao(0.05812, 0);
		Acao acao4 = new Acao(-0.01731, 15);
		Acao acao5 = new Acao(0.09615, 10);
		Acao acao6 = new Acao(0.12039, 0);
		Acao acao7 = new Acao(0.05166, 30);
		Acao acao8 = new Acao(-0.00424, 0);
		Acao acao9 = new Acao(0.21782, 25);
		Acao[] acoes = {acao, acao1, acao2, acao3, acao4, acao5, acao6, acao7, acao8, acao9};
		Carteira carteira = new Carteira(acoes);
		System.out.println(Arrays.toString(carteira.getMelhor()));
		System.out.println(Arrays.toString(carteira.getMelhor()));
		System.out.println(Arrays.toString(carteira.getMelhor()));
		System.out.println(Arrays.toString(carteira.getMelhor()));
//		for(Acao[] acoesAux : carteira.getAcoesVizinhas()) {
//			System.out.println(Arrays.toString(acoesAux));
//		}
	}

}
