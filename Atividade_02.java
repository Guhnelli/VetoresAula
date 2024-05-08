package Atividade_08_05;

import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {

		int a[] = new int [5];
		Scanner ler = new Scanner (System.in);
		int soma=0;

		for (int i = 0; i<5; i++) {
			System.out.println ("Informe um valor " + i+ "..:");
			a [i] = ler.nextInt();
			soma = soma + a[i];
			System.out.println("soma  : " + soma);
		}
		System.out.println((soma>=15)?  soma + " maior, igual a 15" : soma + " menor que 15");
		ler.close();
	}

}
