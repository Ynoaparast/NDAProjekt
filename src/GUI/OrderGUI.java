package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import CTRL.CustomerCTRL;
import CTRL.OrderCTRL;
import Model.Customer;
import Model.Order;

public class OrderGUI {

	private JFrame frame;
	private static JTextField txtAmount;
	private static JTextField txtTotalprice;
	private static JTextField txtPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderGUI window = new OrderGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OrderGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtAmount = new JTextField();
		txtAmount.setText("Amount");
		txtAmount.setBounds(10, 11, 86, 20);
		frame.getContentPane().add(txtAmount);
		txtAmount.setColumns(10);
		
		txtTotalprice = new JTextField();
		txtTotalprice.setText("TotalPrice");
		txtTotalprice.setBounds(10, 42, 86, 20);
		frame.getContentPane().add(txtTotalprice);
		txtTotalprice.setColumns(10);
		
		JButton btnCreateOrder = new JButton("Create Order");
		btnCreateOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createOrder(arg0);
			}
		});
		btnCreateOrder.setBounds(10, 83, 89, 23);
		frame.getContentPane().add(btnCreateOrder);
		
		txtPhone = new JTextField();
		txtPhone.setText("Phone");
		txtPhone.setBounds(149, 11, 86, 20);
		frame.getContentPane().add(txtPhone);
		txtPhone.setColumns(10);
	}
	
	public static void createOrder(ActionEvent e){
		
		CustomerCTRL cusCTRL = new CustomerCTRL();
		Customer c = cusCTRL.findCustomer(txtPhone.getText());
		int id = c.getID();
		
		OrderCTRL oCTRL = new OrderCTRL();
		
		Order o = new Order();
		
				o.setAmount(txtAmount.getText());
				o.setTotalPrice(txtAmount.getText());
				o.setCustomerID(id);
		
		try{
			oCTRL.createOrder(o);
		}catch(Exception evt){
			evt.printStackTrace();
		}
	}
}
