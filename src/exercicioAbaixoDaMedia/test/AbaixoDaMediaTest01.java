package exercicioAbaixoDaMedia.test;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMediaTest01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		double soma = 0;

		for (int i = 0; i < vect.length; i++) {

			soma += vect[i];
		}

		double media = 0;

		for (int i = 0; i < vect.length; i++) {

			media = soma / n;
		}
		System.out.printf("\nMEDIA DO VETOR: %.3f ", media);
		
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
		
		for (int i = 0 ; i <vect.length ; i++) {
			
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}

		sc.close();

	}

}
