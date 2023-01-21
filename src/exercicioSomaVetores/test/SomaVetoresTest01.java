package exercicioSomaVetores.test;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetoresTest01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		System.out.println("Digite os valores do vetor A: ");
		int[] vect = new int [n];
		int [] res = new int [n];
		for (int i = 0 ; i < n ; i++) {
			
			vect [i] = sc.nextInt();
			res [i] = vect [i];
		}
		
		System.out.println("Digite os valores do vetor B: ");
		int [] vect1 = new int [n];
		int [] res1 = new int [n];
		for (int i = 0 ; i < n ; i++) {
			
			vect1 [i] = sc.nextInt();
			res1 [i] = vect1 [i];
		}
		int [] soma = new int [n];
		for (int i = 0 ; i < n ; i++) {
			
			soma [i] = res[i] + res1[i];
			System.out.println("A soma é: " + soma [i]);
		} 
			
		
		
		
		
		
		
		
		sc.close();
	}

}
