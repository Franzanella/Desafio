package exercicio3e4;

public  class ContaPoupanca extends Conta implements Imposto {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	 @Override
     public void depositar(double valor) {
         super.saldo += valor;
     }
	 
	 public boolean sacar(double valor) {
			double valorASacar = valor + 0.05;
			return super.sacar(valorASacar);
		}
		
	 
	 
	 // EXERCICIO 4
	 @Override
		public double calcularImposto() {
			return super.saldo * 0.10;
		}

	@Override
	public double getValorImposto() {
		return 0;
	}

	 
	
}
