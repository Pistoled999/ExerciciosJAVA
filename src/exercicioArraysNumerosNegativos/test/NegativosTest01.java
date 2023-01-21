package exercicioArraysNumerosNegativos.test;

import java.util.Locale;
import java.util.Scanner;

public class NegativosTest01 {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de números: ");
		int n = sc.nextInt();
		
		int [] numeros = new int [n]; 
		
		for (int i = 0 ; i < numeros.length ; i++) {
			System.out.println("Digite um número: ");
			numeros [i] = sc.nextInt();
			
		}
		
		for (int i = 0 ; i < numeros.length ; i++) {
			
			if (numeros[i] < 0) {
				System.out.println("Numeros negativos: " + numeros[i]);
			}
		}
		
		sc.close();
		
	}
}
