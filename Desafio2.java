package atividades2703;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a;
		System.out.println("informe o número");
		a = ler.nextInt();
		if (a % 2 == 0 ) {
			System.out.println("O seu número é Par");
		}else {
			System.out.println("O seu número é Impar");
		}
		ler.close();
	}
}