package exerciciosSomaPar.test;

import java.util.Locale;
import java.util.Scanner;

public class SomarParTes01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		int[] somaPar = new int[n];

		for (int i = 0; i < somaPar.length; i++) {

			System.out.print("Digite o número " + i + ": ");
			somaPar[i] = sc.nextInt();

		}
		System.out.println("Números pares: ");
		int qntPares = 0;
		for (int i = 0; i < somaPar.length; i++) {

			 

			if (somaPar[i] % 2 == 0) {

				System.out.print(somaPar[i] + " ");
				qntPares++;
			}
		}
		System.out.println();
		System.out.println("Quantidade de números pares: " + qntPares);

		sc.close();
	}

}
