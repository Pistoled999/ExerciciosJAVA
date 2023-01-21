package exercicioConversaoDolarReal.test;

import java.util.Locale;
import java.util.Scanner;

import exercicioConversaoDolarReal.dominio.ConversorDolar;

public class ConversorDolarTest01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preço do dólar? ");
		ConversorDolar.PRECO_DOLAR = sc.nextDouble();
		System.out.println("Quantos dólares você quer comprar? ");
		ConversorDolar.dolar = sc.nextDouble();
		
		System.out.println(String.format("%.2f%n", ConversorDolar.converteDolar()));
		
		sc.close();
	}

}
