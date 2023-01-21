package exerciciosSalarios.teste;

import java.util.Locale;
import java.util.Scanner;

import exerciciosSalarios.dominio.Funcionario;

public class SalarioTest01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		System.out.println("Digite o nome, salário bruto e imposto: ");
		
		funcionario.nome = sc.next();
		funcionario.salarioBruto = sc.nextDouble();
		funcionario.imposto = sc.nextDouble();
		
		
		System.out.println(funcionario);
		
		System.out.println("Qual o incremento do salário? ");
		double incremento = sc.nextDouble();
		funcionario.incrementoSalario(incremento);
		
		System.out.println();
		System.out.println("Salário incrementado: " + funcionario);
		
		
		System.out.println();
		sc.close();

	}

}
