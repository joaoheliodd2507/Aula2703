package atividades2703;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int l1, l2, l3;
		
		 System.out.print("Digite um dos valores a ser calculado do triangulo: ");
	      l1= ler.nextInt();
	      System.out.print("Digite um dos valores a ser calculado do triangulo: ");
	      l2= ler.nextInt();
	      System.out.print("Digite um dos valores a ser calculado do triangulo: ");
	      l3= ler.nextInt();
	         
	      if(l1 == l2 && l1 == l3) {
	         System.out.println("É um triamgulo equiátero");
	         
	      }
	      else if (l1 != l2 && l1 != l3 && l2 != l3) {
	      System.out.println("É um triangulo escaleno ");
	}
	      else  {
	    	  System.out.println("É um triangulo isóceles");
	      }
         ler.close();
	}

}
