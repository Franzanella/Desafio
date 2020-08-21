package exercicio3e4;


public class CalculadorDeImposto {

	private double totalImposto;
	
	public void registra(Imposto t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
		
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
