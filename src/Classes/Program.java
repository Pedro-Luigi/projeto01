package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Enum.PurchaseStatus;



public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner ler= new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Nome: ");
		String nome=ler.nextLine();
		System.out.print("E-mail: ");
		String email=ler.next();
		System.out.print("Birth date(DD/MM/YYYY): ");
		Date birth= sdf.parse(ler.next());
		
		Client client= new Client(nome,email,birth);	
		
		System.out.println("Enter order data");
		System.out.print("Status: ");
		PurchaseStatus status = PurchaseStatus.valueOf(ler.next());
		
		Purchase order= new Purchase (new Date(),status, client);
		
		System.out.println("How many items to this order?");
		int n=ler.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name: ");
			String productName=ler.next();
			System.out.print("Product price:");
			double productPrice= ler.nextDouble();
			
			Product product =new Product (productName, productPrice);
			
			System.out.print("Quantity:");
			int quantity= ler.nextInt();	
			
			OrderItem orderItem = new OrderItem(quantity,productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		ler.close();
	}

}
