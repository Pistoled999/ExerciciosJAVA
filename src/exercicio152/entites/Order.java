package exercicio152.entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicio152.enums.OrderStatus;

public class Order {
	private Date moment = new Date();
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> item = new ArrayList<>();

	public Order() {

	}


	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}







	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItem() {
		return item;
	}
	
	public void addItem (OrderItem orderItem) {
		item.add(orderItem);
			
		}
	public void removeItem (OrderItem orderItem) {
		item.remove(orderItem);
			
		}
	
	public double total() {
		double sum = 0;
		for (OrderItem items : item) {
			sum+= items.subTotal();
		}	return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(moment + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (@SuppressWarnings("unused") OrderItem items : item) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
}


