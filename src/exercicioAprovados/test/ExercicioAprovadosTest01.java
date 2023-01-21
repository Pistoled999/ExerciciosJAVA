package exercicioAprovados.test;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAprovadosTest01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas alunos serão digitados? ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		String[] nome = new String[n];
		int[] nota = new int[n];
		int[] nota2 = new int[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.printf("\"Digite nome, primeira e segunda nota do %do aluno: ", i + 1);
			sc.nextLine();
			nome[i] = sc.next();
			nota[i] = sc.nextInt();
			nota2[i] = sc.nextInt();
		}

		System.out.println("Aprovados");
		double media = 0;
		for (int i = 0; i < vect.length; i++) {
			media = (nota[i] + nota2[i]) / 2;

			if (media > 6) {
				System.out.println(nome[i]);
			}

		}

	}

}
