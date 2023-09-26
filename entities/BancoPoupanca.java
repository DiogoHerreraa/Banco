package entities;

public final class BancoPoupanca extends BancoComum {
	
	
	private double taxaDeJuros;
	
	public BancoPoupanca(int numConta,String usuario,double saldo) {
		
		super(numConta,usuario,saldo);
		this.taxaDeJuros=0.75;
	}
	
	
	
	
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}


	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	 
	public void atualizarSaldo() {
		
		saldo+=saldo*taxaDeJuros;
	}
	
	@Override
	public void saque(double valor) {
		
		if(saldo<0) {
			System.out.println("VOCÊ NÃO POSSUI SALDO SUFICIENTE PARA REALIZAR ESSA OPERAÇÃO.");
			
		}
		else {
			saldo-=valor+5;
		}
	
	}

	
}
