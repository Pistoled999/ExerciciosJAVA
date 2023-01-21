package exerciciosNotas.test;

import java.util.Locale;
import java.util.Scanner;

import exerciciosNotas.dominio.Estudante;

public class EstudanteTeste01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Estudante estudante = new Estudante();
		
		System.out.println("Digite a primeira nota: ");
		estudante.nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		estudante.nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		estudante.nota3 = sc.nextDouble();
		
		System.out.printf("%.2f%n" ,estudante.imprime());
		
		
		
		if (estudante.imprime() < 60) {
			System.out.println("Reprovado");
			System.out.printf("Faltam %.2f Pontos%n", estudante.diferenca());
		} else {
			System.out.println("Aprovado");
		}
		
		sc.close();
	}

}
