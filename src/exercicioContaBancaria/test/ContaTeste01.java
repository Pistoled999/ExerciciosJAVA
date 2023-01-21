package exercicioContaBancaria.test;

import java.util.Locale;
import java.util.Scanner;

import exercicioContaBancaria.dominio.Conta;

public class ContaTeste01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = null;
		
	    System.out.println("Informe o número da conta: ");
	    int numeroConta = sc.nextInt();
	    
	    System.out.println("Informe o nome do titular da conta: ");
		String nomeTit= sc.next();
				
		System.out.println("Vai adicionar um valor inicial? (Y/N)");
		
		char resposta = sc.next().charAt(0);
		System.out.println("Quer adicionar qual valor? ");
		
		if (resposta == 'y') {
			double valor = sc.nextInt();
			 conta = new Conta(numeroConta, nomeTit, valor);
		} else if (resposta == 'n'){
			 conta = new Conta(numeroConta, nomeTit);
		} else {
			System.out.println("Opção inválida.");
		}
		
		System.out.println();
		
		System.out.println(conta);
		
		System.out.println();
		
		
		System.out.println("Quer adicionar algum valor?");
		double depositos = sc.nextDouble();
		conta.depositos(depositos);
		
		System.out.println(conta);
		
		System.out.println();
		
		System.out.println("Valor de saque: ");
		double saque = sc.nextDouble();
		conta.saques(saque);
		
		System.out.println();
		
		System.out.println(conta);
		
		sc.close();
	}

}
