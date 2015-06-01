package ModelLayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Order {
	private int ID;
	private String amount, totalPrice;
	
		public int getID(){
			return ID;
		}
		
		public int getCustomerID(Customer cus){
			return cus.getID();
		}
		
		public String getAmount(){
				return amount;
		}
	
		public String getTotalPrice(){
			return totalPrice;
		}
		
		public void setAmount(String amount){
			amount = this.amount;
		}
		
		public void setTotalPrice(String totalPrice){
			totalPrice = this.totalPrice;
		}
		
		public static void createOrder(Connection con) throws SQLException{
			Statement stmt;
			try{
				stmt = con.createStatement();
				stmt.executeQuery("INSERT INTO Order(amount, totalPrice) VALUES('4', '123')");
				stmt.close();
				con.close();
			}
			catch(Exception e){
	            e.printStackTrace();
			}
		}
		public static Statement updateOrder(Connection con, Order o) throws SQLException{
			Statement stmt;
			stmt = con.createStatement();
			stmt.executeUpdate("UPDATE Order SET amount = '999', totalPrice = '0' WHERE id = "+ o.getID());
			stmt.close();
			con.close();
			return stmt;
			
			
			
		}
		public static Statement deleteOrder(Connection con, Order o) throws SQLException{
			Statement stmt;
			stmt = con.createStatement();
			stmt.executeUpdate("DELETE Order WHERE id =" + o.getID());
			stmt.close();
			con.close();
			return stmt;
		}
		
		public static Statement addPartOrder(Connection con, Order o, PartOrder po, Dog d, Treatment t) throws SQLException{
			Statement stmt;
			stmt = con.createStatement();
		 	stmt.executeUpdate("INSERT INTO PartOrder(serviceName, hours, type, servicePrice, OrderID, DogID, TreatmentID)"
							+ " VALUES('test', 'hest', 'tester', '700','"+ o.getID() +"','" + d.getID() + "','" + t.getID() + "')");
			stmt.close();
			con.close();
			return stmt;
		}
}
