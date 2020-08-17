import java.util.Date;

import Classes.Order;
import Enum.OrderStatus;

public class enumeração {

	public static void main(String[] args) {
		
		Order pedido= new Order(1000, new Date(),OrderStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		OrderStatus s1= OrderStatus.PROCESSANDO;
		OrderStatus s2= OrderStatus.valueOf("PROCESSANDO");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
