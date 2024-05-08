package Atividade_08_05;

import java.util.Scanner;

public class exemplo_vetor01 {

	public static void main(String[] args) {
		int a[] = new int [5];
		Scanner ler = new Scanner (System.in);

		for (int i = 0; i<5; i++) {
			System.out.println ("Informe um valor " + i+ "..:");
			a [1] = ler.nextInt();
		}
		for (int i = 0; i<5; i++) {
			System.out.println(a[i]);
		}
		ler.close();
	}



}


