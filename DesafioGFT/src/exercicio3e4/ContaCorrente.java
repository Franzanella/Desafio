package exercicio3e4;

public  class ContaCorrente extends Conta implements Imposto {

	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorASacar = valor + 0.03;
		return super.sacar(valorASacar);
	}
	
	  @Override
      public void depositar(double valor) {
         super.saldo += valor;
      }

	  
	  
	// EXERCICIO 4
	@Override
	public double calcularImposto() {
		return super.saldo * 0.25;
	}

	@Override
	public double getValorImposto() {
		return 0;
	}
	
}
