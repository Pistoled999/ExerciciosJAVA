package exercioSomaMediaNumero.test;

import java.util.Locale;
import java.util.Scanner;

public class SomaMediaNumeroTest01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite os números pra soma e média: ");
		int n = sc.nextInt();
		
		double [] numeros = new double [n];
		
	
		for (int i = 0 ; i < numeros.length ; i++ ) {
			System.out.print("Digite um número: ");
			
			numeros[i] = sc.nextInt();
		
		} 
		double soma = 0;
		for (int i = 0 ; i < numeros.length ; i++) {
			
			soma += numeros[i];
			
		}
		
		double media = 0;
		
		for (int i = 0 ; i <numeros.length ; i++) {
			media = soma / numeros.length;
		}	
		System.out.print("Valores: ");
		for (int i = 0 ; i<numeros.length ; i++) {
			System.out.println(numeros[i]);
		}
			System.out.printf("A soma dos números é: %.2f%n" , soma);
			
			System.out.printf("A média dos números é: %.2f%n " , media);
		
		sc.close();
		
	
	}

}
