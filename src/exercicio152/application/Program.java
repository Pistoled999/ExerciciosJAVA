package exercicio152.application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicio152.entites.Client;
import exercicio152.entites.Order;
import exercicio152.entites.OrderItem;
import exercicio152.entites.Product;
import exercicio152.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Client client;
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name:");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		client = new Client (name, email);
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		client.readBirthDate();
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println();
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			System.out.println("Enter " + i +  "# item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double pp = sc.nextDouble();
			
						
			Product product = new Product( productName , pp);
			
			System.out.print("Quantity: ");
			int qt = sc.nextInt();
			
			OrderItem item = new OrderItem(qt,pp,product);
			order.addItem(item);
		}
			System.out.println();
			System.out.println("ORDER SUMMARY: ");
			System.out.println(order);
		
		sc.close();
		
		
	}

}
