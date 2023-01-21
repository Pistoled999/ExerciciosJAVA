package exercioMediaPar.test;

import java.util.Locale;
import java.util.Scanner;

public class MediaParTes01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int [] vect = new int [n];
		
		for (int i : vect) {
			
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		int npares=0;
		double soma = 0;
		for (int i = 0 ; i < vect.length ; i++) {
			
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				npares++;
			}
			
		}
		double media = 0;
		if (npares==0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = soma / npares;
		}System.out.printf("MEDIA DOS PARES = %.1f " , media);
		
		sc.close();

	}

}
