import java.util.Random;
import java.util.Scanner;

import entities.BancoComum;
import entities.BancoEmpresarial;
import entities.BancoPoupanca;

public class Banco {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//atributos
		String usuario;
		int opcao,opcao2,numConta,conta;
		double saldo,limiteEmprestimo,saque,deposito;
		Random aleatorio = new Random();
		BancoComum[] contaPadrao= new BancoComum[1];
		BancoEmpresarial[] contaEmpresarial= new BancoEmpresarial[1];
		BancoPoupanca[] contaPoupanca= new BancoPoupanca[1];
		
		
		do {
			System.out.println("----MENU----");
			System.out.println("1-Criar Conta Padrao");
			System.out.println("2-Criar Conta Empresarial");
			System.out.println("3-Criar Conta Poupança");
			System.out.println("4-Consultar Saldo");
			System.out.println("5-Saque");
			System.out.println("6-deposito");
			System.out.println("0- FINALIZAR OPERAÇÃO");
			opcao=sc.nextInt();
			
			
			switch(opcao) {
			
			
			case 1 : 
				System.out.println();
				System.out.println("VAMOS CRIAR SUA CONTA PADRAO:");
				for(int i=0;i<contaPadrao.length;i++) {
					
					
					numConta=aleatorio.nextInt(100);
					System.out.println("O NUMERO DA SUA CONTA PADRAO :"+numConta);
					System.out.print("NOME :");
					usuario=sc.nextLine();sc.nextLine();
					System.out.print("INSIRA O VALOR QUE DESEJA DEPOSITAR NA CONTA :");
					saldo=sc.nextDouble();
					
					contaPadrao[i]= new BancoComum(numConta,usuario,saldo);
					System.out.println("CONTA CRIADA COM SUCESSO !!!");
					System.out.println();
				}
				break;
				
			case 2: 
				
				System.out.println();
				System.out.println("VAMOS CRIAR SUA CONTA EMPRESARIAL :");
				for(int i=0;i<contaEmpresarial.length;i++) {
					
					numConta= aleatorio.nextInt(100);
					System.out.println("O NUMERO DA SUA CONTA EMPRESARIAL : "+numConta);
					System.out.print("NOME :");
					usuario=sc.nextLine();sc.nextLine();
					System.out.print("INSIRA O VALOR QUE DESEJA DEPOSITAR NA CONTA :");
					saldo = sc.nextDouble();
					System.out.print("INSIRA UM LIMETE DE CREDITO PARA O SEU CARTÃO :");
					limiteEmprestimo=sc.nextDouble();
					
					contaEmpresarial[i]= new BancoEmpresarial(numConta,usuario,saldo,limiteEmprestimo);
					System.out.println("CONTA CRIADA COM SUCESSO !!!");
					System.out.println();
					
				}
				break;
				
			case 3:
				
				System.out.println();
				System.out.println("VAMOS CRIAR SUA CONTA POUPANÇA :");
				for(int i=0;i<contaPoupanca.length;i++) {
					
					numConta=aleatorio.nextInt(100);
					System.out.println("O NUMERO DA SUA CONTA POUPANÇA :"+numConta);
					System.out.println("NOME :");
					usuario=sc.nextLine();sc.nextLine();
					System.out.println("INSIRA O VALOR QUE DESEJA DEPOSITAR NA CONTA :");
					saldo=sc.nextDouble();
					
					contaPoupanca[i]=new BancoPoupanca(numConta,usuario,saldo);
					System.out.println("CONTA CRIADA COM SUCESSO !!!");
					System.out.println();
					
				}
				break;
				
			case 4:
				
				System.out.println("INSIRA O NUMERO DA SUA CONTA :");
				 conta = sc.nextInt();
				
				System.out.println("ESCOLHA O TIPO DE CONTA :");
				System.out.println("1- Conta Comum");
				System.out.println("2- Conta Empresarial");
				System.out.println("3- Conta Poupança");
				opcao2=sc.nextInt();
				
				switch(opcao2) {
				
				
				case 1 :
					
					for(BancoComum analiseConta : contaPadrao) {
						
						if(conta==analiseConta.getNumConta()) {
							System.out.println("SALDO :"+analiseConta.getSaldo());
							
						}
						else {
							System.out.println("A CONTA NÃO EXISTE. VOLTE PARA O MENU PRINCIPAL E TENTE NOVAMENTE");
						}
					}
					System.out.println();
					break;
					
					
				case 2 :
					
					for(BancoEmpresarial analiseConta : contaEmpresarial) {
						
						if(conta==analiseConta.getNumConta()) {
							System.out.println("SALDO :"+analiseConta.getSaldo());
							System.out.println();
						}
						else {
							System.out.println("A CONTA NÃO EXISTE. VOLTE PARA O MENU PRINCIPAL E TENTE NOVAMENTE");
						}
						
					}
					System.out.println();
					break;
					
					
				case 3 : 
					
					for(BancoPoupanca analiseConta : contaPoupanca) {
						
						if(conta==analiseConta.getNumConta()) {
							System.out.println("SALDO :"+analiseConta.getSaldo());
						}
						else {
							System.out.println("A CONTA NÃO EXISTE. VOLTE PARA O MENU PRINCIPAL E TENTE NOVAMENTE");
						}
					}
					
					
					
					}
				System.out.println();
				break;
				
			case 5 :
				
				System.out.println("INSIRA O NUMERO DA CONTA :");
				conta = sc.nextInt();
				
				System.out.println("ESCOLHA O TIPO DE CONTA :");
			
				System.out.println("1- Conta Comum");
				System.out.println("2- Conta Empresarial");
				System.out.println("3- Conta Poupança");
				opcao2 =sc.nextInt();
				
				
				switch(opcao2) {
				
				
				case 1 :
					System.out.println("INSIRA O VALOR QUE VOCE DESEJA SACAR :");
					saque=sc.nextDouble();
					
					for(BancoComum analiseSaque : contaPadrao) {
						
						if(conta==analiseSaque.getNumConta()) {
							
							analiseSaque.saque(saque);
							System.out.println("SAQUE EFETUADO COM SUCESSO.");
						}
						else {
							System.out.println("A CONTA NÃO EXISTE. VOLTE PARA O MENU PRINCIPAL E TENTE NOVAMENTE");
						}
						
					}
					System.out.println();
					break;
					
					
				case 2 :
					System.out.println("!LEMBRETE: TODO SAQUE EFETUADO NA CONTA EMPRESARIAL É COBRADO 15 REAIS!");
					System.out.println("INSIRA O VALOR QUE VOCE DESEJA SACAR :");
					saque = sc.nextDouble();
					
					for(BancoEmpresarial analiseSaque: contaEmpresarial) {
						
						if(conta==analiseSaque.getNumConta()) {
							
							analiseSaque.saque(saque);
							System.out.println("SAQUE EFETUADO COM SUCESSO.");
						}
						else {
							System.out.println("A CONTA NÃO EXISTE. VOLTE PARA O MENU PRINCIPAL E TENTE NOVAMENTE");
						}
					}
					System.out.println();
					break;
					
				case 3:
					System.out.println("!LEMBRETE: TODO SAQUE EFETUADO NA POUPANÇA É COBRADO 5 REAIS!");
					System.out.println("INSIRA O VALOR QUE VOCE DESEJA SACAR :");
					saque = sc.nextDouble();
					
					for(BancoPoupanca analiseSaque : contaPoupanca) {
						
						if(conta==analiseSaque.getNumConta()) {
							analiseSaque.saque(saque);
							System.out.println("SAQUE EFETUADO COM SUCESSO.");
						}
						else {
							System.out.println("A CONTA NÃO EXISTE. VOLTE PARA O MENU PRINCIPAL E TENTE NOVAMENTE");
						}
					}

					
				}
                System.out.println();
				break;
				
			case 6 :
				
				System.out.println("INSIRA O NUMERO DA CONTA :");
				conta = sc.nextInt();
				
				System.out.println("ESCOLHA O TIPO DE CONTA :");
				System.out.println("1- Conta Comum");
				System.out.println("2- Conta Empresarial");
				System.out.println("3- Conta Poupança");
				opcao2 =sc.nextInt();
				
				switch(opcao2) {
				
				case 1:
					System.out.println("INSIRA O VALOR QUE VOCE DESEJA DEPOSITAR :");
					deposito=sc.nextDouble();
			
					for(BancoComum analiseDeposito : contaPadrao) {
						if(conta==analiseDeposito.getNumConta()) {
							analiseDeposito.deposito(deposito);
							System.out.println("DEPOSITO EFETUADO COM SUCESSO!");
						}
						else {
							System.out.println("A CONTA NÃO EXISTE. VOLTE PARA O MENU PRINCIPAL E TENTE NOVAMENTE");
						}
					}
					System.out.println();
					break;
					
				case 2 :
					System.out.println("INSIRA O VALOR QUE VOCE DESEJA DEPOSITAR :");
					deposito=sc.nextDouble();
					
					for(BancoEmpresarial analiseDeposito : contaEmpresarial) {
						
						if(conta==analiseDeposito.getNumConta()) {
							analiseDeposito.deposito(deposito);
							System.out.println("DEPOSITO EFETUADO COM SUCESSO");
						}
						else {
							System.out.println("A CONTA NÃO EXISTE. VOLTE PARA O MENU PRINCIPAL E TENTE NOVAMENTE");
						}
					}
					System.out.println();
					break;
					
				case 3:
				
					
					for(BancoPoupanca analiseDeposito: contaPoupanca) {
						
						if(conta==analiseDeposito.getNumConta()) {
							analiseDeposito.atualizarSaldo();
							System.out.println("SALDO ATUALIZADO COM SUCESSO");
						}
						else {
							System.out.println("A CONTA NÃO EXISTE. VOLTE PARA O MENU PRINCIPAL E TENTE NOVAMENTE");
						}
					}
					System.out.println();
					break;
				}
				}
				
			
		}while(opcao!=0);
		
		System.out.println("OBRIGADO POR UTILIZAR OS NOSSO SERVIÇOS");
	

	}

}