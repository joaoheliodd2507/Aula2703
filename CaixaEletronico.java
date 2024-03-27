package atividades2703;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		long senha, cpf, cpfc, senhac;
		double saldo, saque;
		
		
	
		cpfc = 123456789;
		senhac = 123456;
		saldo = 6500;
		
		System.out.println("Digite os 9 primeiros digitos do seu CPF: ");
		cpf = ler.nextLong();
		System.out.println("Digite sua senha: ");
		senha = ler.nextLong();
	    
		
		 if(senha == senhac && cpf  == cpfc) { 
	         System.out.println("Acesso permitido");
	         System.out.println("Seu saldo é: R$"+saldo);
	         System.out.println(" ");
	         System.out.println("Quanto você de seja sacar: R$");
	         saque = ler.nextDouble();
	         if (saque > saldo) {
	        	 System.out.println("Saldo indisponivel");
	         }
	         
	         else if (saque <= saldo) {
	        	 System.out.println("Saque efetuado com sucesso");
	        	 saldo = saldo-saque;
	        	 System.out.println("Seu saldo é de: R$"+saldo);
	         }
		 }
		 
		 
		 
		 
	         
	     else if (senha != senhac || cpf != cpfc) {
	    	System.out.println("Acesso negado"); 
	     }
	}
}
	    
