package entities;

public class BancoComum {
	
	
	private int numConta;
	private String usuario;
	protected double saldo;
	
	
	public BancoComum(int numConta,String usuario,double saldo) {
		
		this.numConta=numConta;
		this.usuario=usuario;
		this.saldo=saldo;
	}


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public double getSaldo() {
		return saldo;
	}


	// não usei o set saldo, porque toda operação de mudança no valor da minha conta vai ser por meio do deposito ou saque 
	
	
	public void deposito(double valor) {
		saldo+=valor;
	}
	
	public void saque(double valor) {
		
		if(saldo<0) {
			System.out.println("VOCÊ NÃO POSSUI SALDO SUFICIENTE PARA REALIZAR ESSA OPERAÇÃO.");
		}
		else {
			saldo-=valor;
		}
	}
	

}