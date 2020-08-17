package Classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enum.PurchaseStatus;

public class Purchase {
	private static final SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");
	
	Date moment;
	PurchaseStatus status;
	Client client;
	
	private List<OrderItem> products= new ArrayList<>();
	
	public Purchase() {
	}

	public Purchase(Date moment, PurchaseStatus status, Client client) {
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

	public PurchaseStatus getStatus() {
		return status;
	}

	public void setStatus(PurchaseStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getProducts() {
		return products;
	}

	public void addItem(OrderItem item) {
		products.add(item);
	}
	
	public void remItem(OrderItem item) {
		products.remove(item);
	}
	
	public double total() {
		double soma=0.0;
		for (OrderItem item: products) {
			soma+= item.subTotal();
		}
		return soma;
			
	}
	
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment)+ "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client+ "\n");
		sb.append("Order items: "+ "\n");
		for (OrderItem item: products) {
			sb.append(item+ "\n");
		}
		sb.append("Total price: ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
	}
	
}
