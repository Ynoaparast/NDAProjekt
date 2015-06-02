package Model;

public class Order {
	
	private static int ID;
	private static String amount;
	private static String totalPrice;
	
	public Order(){
		
	}
	
	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}
	
	public static String getAmount() {
		return amount;
	}
	public static void setAmount(String amount) {
		Order.amount = amount;
	}
	public static String getTotalPrice() {
		return totalPrice;
	}
	public static void setTotalPrice(String totalPrice) {
		Order.totalPrice = totalPrice;
	}

	
}
