package exercicioMaisVelho.test;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaisVelhoTest01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		int [] vect = new int [n];
		
		String [] nome = new String [n];
		int [] idade = new int [n];
		for (int i = 0 ; i <vect.length ; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.println("Nome: ");
			nome [i] = sc.next();
			
			System.out.println("Idade: ");
			idade [i] = sc.nextInt();
			
		}
		@SuppressWarnings("unused")
		int maiorIdade = idade [0];
		int maiorPosicao = 0;
		for (int i = 1 ; i <vect.length ; i++) {
			if (idade [i] > vect.length) {
				maiorIdade = idade [i];
				maiorPosicao++;
			}
			
		} System.out.println("A pessoa mais velha é: " + nome[maiorPosicao]);
		
		sc.close();

	}

}
