package entities;

public class BancoEmpresarial extends BancoComum {
	
	private double limiteEmprestimo;
	
	public BancoEmpresarial(int numConta,String usuario,double saldo,double limiteEmprestimo) {
		
		super(numConta,usuario,saldo);// esse super ta fazendo referencia aos elementos do codigo "mãe" que ta herdando suas caracterisctas
		this.limiteEmprestimo=limiteEmprestimo;
	}
	
	//getters and setters	
	public double getEmprestimo() {
		return limiteEmprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.limiteEmprestimo = emprestimo;
	}

	
	//metodos

	@Override
	public void deposito(double valor) {
		saldo+=valor;
	}
	
	@Override
	public void saque(double valor) {
		
		if(saldo<0) {
			System.out.println("VOCÊ NÃO POSSUI SALDO SUFICIENTE PARA REALIZAR ESSA OPERAÇÃO.");
		}
		else {
			saldo-=valor+15;
		}
	}
	
	public void Emprestimo(double emprestimo) {
		
		if(emprestimo>limiteEmprestimo) {
			System.out.println("VOCÊ NÃO POSSUI LIMITE SUFICIENTE.");
		}
		else {
			saldo+=emprestimo;
		}
	}

}
