package atividades2703;

import java.util.Scanner;

public class Exercício {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler =  new Scanner(System.in);
        int dia;
        
        
        
        System.out.println("Digite o número d dia da semana (1-7): " );
        dia = ler.nextInt();
        
        if(dia == 1) {
        	System.out.println("DOMINGO ");
        }
        else if(dia == 2) {
        	System.out.println("SEGUNDA ");
        }
        else if(dia == 3) {
        	System.out.println("TERÇA ");
        }
        else if(dia == 4) {
        	System.out.println("QUARTA ");
        }
        else if(dia == 5) {
        	System.out.println("QUINTA ");
        }
        else if(dia == 6) {
        	System.out.println("SEXTA ");
        }
        else if(dia == 7) {
        	System.out.println("SABADO ");
        }
        else {
        	System.out.println("Dia Inválido");
        } 
        ler.close();
        
	}

}
