package exercicios.test;

import java.util.Locale;
import java.util.Scanner;

import exercicios.dominio.Retangulo;

public class TestRetangulo01 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner (System.in);
			Retangulo retangulo = new Retangulo();
			
			retangulo.altura = sc.nextDouble();
			retangulo.largura = sc.nextDouble();
			
		System.out.printf("A área do retângulo é: %.2f%n " , retangulo.area());
		System.out.printf("O perímetro do retângulo é: %.2f%n " , retangulo.perimetro());
		System.out.printf("A diagonal do retângulo é: %.2f%n " , retangulo.diagonal());
		
		sc.close();
	}

}
