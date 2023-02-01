package exercicio165.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio165.entites.Company;
import exercicio165.entites.Individual;
import exercicio165.entites.Payer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Payer> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n ; i++) {
			System.out.printf("Tax payer #%d data: ", i);
			System.out.print("Individual or company (i/c)? ");
			char ic = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double ai = sc.nextDouble();
			
			if (ic == 'i') {
				System.out.print("Health expenditures: ");
				double hc = sc.nextDouble();
				list.add(new Individual(name, ai, hc));
			}else if (ic == 'c') {
				System.out.print("Number of employees: ");
				int ne = sc.nextInt();
				
				list.add(new Company(name, ai, ne));
			}else {
				System.out.print("Invalid Option");
			}
		}
			System.out.println();
			System.out.println("TAXES PAID: ");
		for (Payer payer : list) {
			System.out.println( payer.toString());
		}
		double sum = 0.0;
		for (Payer payer : list) {
			sum += payer.taxes();
		}
				System.out.println();
				System.out.println("TOTAL TAXES: $ %.2f" + sum);
			
	
		sc.close();
	}

}
