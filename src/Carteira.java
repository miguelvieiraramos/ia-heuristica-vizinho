import java.util.ArrayList;
import java.util.Arrays;

public class Carteira {
	public Acao[] acoes;
	private ArrayList<Acao[]> acoesVizinhas = new ArrayList<Acao[]>();
	
	public Carteira(Acao[] acoes) {
		this.acoes = acoes;
		setAcoesVizinhas(acoes);
	}
	
	public ArrayList<Acao[]> getAcoesVizinhas() {
		return acoesVizinhas;
	}

	private void setAcoesVizinhas(Acao[] acoes) {
		if(acoes != null) {
			Acao acaoAux;
			for (int i = 0; i < acoes.length; i++) {
				acaoAux = acoes[i];
				for (int j = i + 1; j < acoes.length; j++) {
					Acao[] acoesAux = deepCopyAcoes();
					acoesAux[i].setAplicacao(acoes[j].getAplicacao());
					acoesAux[j].setAplicacao(acaoAux.getAplicacao());
					acoesVizinhas.add(acoesAux);
				}
			}
		}
	}
	
	public Acao[] getMelhor() {
		double melhorRetorno = this.getRetornoCarteira();
		Acao[] melhoresAcoes = null;
		for(Acao[] acoes : this.acoesVizinhas) {
			double retorno = 0;
			for (Acao acao : acoes) {
				retorno += acao.getRetornoAplicacao();
			} 
			if(retorno > melhorRetorno) {
				melhorRetorno = retorno;
				melhoresAcoes = acoes;
			}
		}
		this.acoes = melhoresAcoes;
		this.acoesVizinhas.removeAll(this.acoesVizinhas);
		setAcoesVizinhas(acoes);
		return melhoresAcoes;
	}
	
	public double getRetornoCarteira() {
		double retornoCarteira = 0;
		for (Acao acao : this.acoes) {
			retornoCarteira += acao.getRetornoAplicacao();
		}
		return retornoCarteira;
	}
	
	private Acao[] deepCopyAcoes() {
		Acao[] acoesAux = new Acao[10];
		
		for (int i = 0; i < this.acoes.length; i++) {
			acoesAux[i] = new Acao(this.acoes[i].getRetornoAnual(), this.acoes[i].getAplicacao());
		}
		return acoesAux;
	}
}
