package exercicioAlturas.test;

import java.util.Locale;
import java.util.Scanner;

import exercicioAlturas.dominio.Alturas;

public class AlturasTest01 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner (System.in);
			System.out.print("Digite quantas alturas quer medir: ");
			int n = sc.nextInt();
			
			Alturas [] alturas = new  Alturas[n];
			
			
			String nome;
			int idade;
			double altura;
			for (int i = 0 ; i < alturas.length ; i++) {
				System.out.println("Digite o nome: ");
				nome = sc.next();
				System.out.println("Digite a idade: ");
				idade= sc.nextInt();
				System.out.println("Digite a altura: ");
				altura = sc.nextDouble();
				
				
				alturas[i] = new Alturas(nome, idade, altura);
			}
			double soma = 0;
			double media = 0;
			for (int i = 0;  i < alturas.length ; i++ ) {
				
				soma += alturas[i].altura;
				media = soma / n;
				
			} System.out.printf("A média das alturas é: %.2f ", media);
			int nmenores=0;
			double percentualMenores = 0;
			for (int i = 0 ; i <alturas.length ; i++) {
				if ( alturas[i].idade< 16) {
					nmenores++;
				}	 percentualMenores = (nmenores / (double)n) * 100.0;
				
			}System.out.println("Menores de 16: " + percentualMenores + "%");
			for (int i = 0 ; i <alturas.length ; i++) {
				
				if (alturas[i].idade < 16) {
					
					System.out.println("Pessoas com menos de 16: " + alturas[i].nome);
				
				}
				
			}
			
			sc.close();
	}

}
