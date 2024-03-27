package atividades2703;

import java.util.Scanner;

public class Mês {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler =  new Scanner(System.in);
		int mes;

		System.out.println("Digite o número do mês desejado (1-12): " );
		mes = ler.nextInt();

		if(mes == 1) {
			System.out.println("O mês selecionado é JANEIRO ");
		}
		else if(mes == 2) {
			System.out.println("O mês selecionado é FEVEREIRO ");
		}
		else if(mes == 3) {
			System.out.println("O mês selecionado é MARÇO ");
		}
		else if(mes == 4) {
			System.out.println("O mês selecionado é ABRIL ");
		}
		else if(mes == 5) {
			System.out.println("O mês selecionado é MAIO ");
		}
		else if(mes == 6) {
			System.out.println("O mês selecionado é JUNHO ");
		}
		else if(mes == 7) {
			System.out.println("O mês selecionado é JULHO ");
		}
		else if(mes == 8) {
			System.out.println("O mês selecionado é AGOSTO ");
		}
		else if(mes == 9) {
			System.out.println("O mês selecionado é SETEMBRO ");
		}
		else if(mes == 10) {
			System.out.println("O mês selecionado é OUTUBRO ");
		}
		else if(mes == 11) {
			System.out.println("O mês selecionado é NOVEMBRO ");
		}
		else if(mes == 12) {
			System.out.println("O mês selecionado é DEZEMBRO ");
		}

		else {
			System.out.println("Mês Inválido");
		} 
		ler.close();

	}

}
