package CTRL;

import DB.dbOrder;
import Model.Order;

public class OrderCTRL {
	
	public void createOrder(Order o) throws Exception{
		dbOrder dbO = new dbOrder();
		dbO.insertOrder(o);
		
	}

}
