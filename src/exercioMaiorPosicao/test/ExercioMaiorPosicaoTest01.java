package exercioMaiorPosicao.test;

import java.util.Locale;
import java.util.Scanner;

public class ExercioMaiorPosicaoTest01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] maiorPosicao = new int[n];

		for (int i = 0; i < maiorPosicao.length; i++) {
			System.out.println("Digite um número: ");
			maiorPosicao[i] = sc.nextInt();
		}
			
			int maxPos= maiorPosicao[0];
			int pos = 0;
			for (int i = 0 ; i <maiorPosicao.length ; i++) {
				
				if ( maiorPosicao[i] > maxPos) {
					maxPos = maiorPosicao[i];
					pos = i;
				}
				
			}
			System.out.println("O maior número é:" + maxPos);
			System.out.println("A posição do maior valor é: " + pos);

			sc.close();
		}
	}

