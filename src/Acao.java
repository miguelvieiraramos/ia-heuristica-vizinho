
public class Acao {
	private double retornoAnual;
	private int aplicacao;
	
	public Acao(double retornoAnual, int aplicacao) {
		this.retornoAnual = retornoAnual;
		this.aplicacao = aplicacao;
	}

	public double getRetornoAnual() {
		return retornoAnual;
	}
	
	public void setRetornoAnual(double retornoAnual) {
		this.retornoAnual = retornoAnual;
	}
	
	public int getAplicacao() {
		return aplicacao;
	}
	
	public void setAplicacao(int aplicacao) {
		this.aplicacao = aplicacao;
	}
	
	public double getRetornoAplicacao() {
		return this.retornoAnual * aplicacao / 100;
	}

	@Override
	public String toString() {
		return "Acao [retornoAnual=" + retornoAnual + ", aplicacao=" + aplicacao + "]";
	}
	
	
}
