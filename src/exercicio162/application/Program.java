package exercicio162.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio162.entites.Product;
import exercicio162.entites.importedProduct;
import exercicio162.entites.usedProduct;

public class Program {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			List <Product> list = new ArrayList<>();
			
			System.out.print("Enter the number of products: ");
			int n = sc.nextInt();
			
			for (int j = 1 ; j <= n ; j++) {
				System.out.println("Product #" + j + " data:");
				System.out.print("Common, used or imported (c/u/i)? ");
				char cui = sc.next().charAt(0);
				
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				if (cui == 'c') {
					list.add(new Product(name, price));
					
				} else if (cui == 'u') {
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					sc.nextLine();
					LocalDate md = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					list.add(new usedProduct(name, price, md));
				} else if (cui == 'i') {
					System.out.print("Customs fee: ");
					double cf = sc.nextDouble();
					list.add(new importedProduct(name, price, cf));
				} else {
					System.out.println("Invalid option");
				}
			}
			System.out.println();
			System.out.println("PRICE TAGS:" );
			for(Product emp : list) {
				System.out.println(emp.priceTag());
			}
			
			sc.close();
	}

}
