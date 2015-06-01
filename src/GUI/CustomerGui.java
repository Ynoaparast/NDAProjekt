package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import CTRL.*;
import DB.dbCustomer;
import Model.Customer;

import java.awt.BorderLayout;
import java.sql.SQLException;

import javax.swing.JMenuBar;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuItem;

import java.awt.Button;

public class CustomerGui {

	private JFrame frame;
	private static JTextField txtFirstname;
	private static JTextField txtLastname;
	private static JTextField txtAddress;
	private static JTextField txtZipcode;
	private static JTextField txtCity;
	private static JTextField txtCountry;
	private static JTextField txtPhone;
	private static JTextField txtEmail;
	private static JTextField txtKids;
	private static JTextField txtPrevdogs;
	private static JTextField txtOtherAnimals;
	private static JTextField txtAccommodation;
	private static JTextField txtGarden;
	private static JButton btnNewButton;
	private static JTextField txtSearch;
	private static JLabel lblFirstname;
	private static JLabel lblLastname;
	private static JLabel lblZipcode;
	private static JLabel lblCity;
	private static JLabel lblCountry;
	private static JLabel lblPhone;
	private static JLabel lblEmail;
	private static JLabel lblKids;
	private static JLabel lblOtherAnimals;
	private static JLabel lblAccommodation;
	private static JLabel lblGarden;
	private static JButton btnNewButton_2;
	private static JLabel lblAddress;
	private static JLabel lblPrevdog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerGui window = new CustomerGui();
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
	public CustomerGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Customer information");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(150, 50, 133, 17);
		frame.getContentPane().add(label);
		
		txtFirstname = new JTextField();
		txtFirstname.setText("Firstname");
		txtFirstname.setBounds(150, 78, 133, 20);
		frame.getContentPane().add(txtFirstname);
		txtFirstname.setColumns(10);
		
		txtLastname = new JTextField();
		txtLastname.setText("Lastname");
		txtLastname.setColumns(10);
		txtLastname.setBounds(150, 109, 133, 20);
		frame.getContentPane().add(txtLastname);
		
		txtZipcode = new JTextField();
		txtZipcode.setText("Zipcode");
		txtZipcode.setColumns(10);
		txtZipcode.setBounds(150, 174, 60, 20);
		frame.getContentPane().add(txtZipcode);
		
		txtCity = new JTextField();
		txtCity.setText("City");
		txtCity.setColumns(10);
		txtCity.setBounds(223, 174, 60, 20);
		frame.getContentPane().add(txtCity);
		
		txtCountry = new JTextField();
		txtCountry.setText("Country");
		txtCountry.setColumns(10);
		txtCountry.setBounds(150, 205, 133, 20);
		frame.getContentPane().add(txtCountry);
		
		txtPhone = new JTextField();
		txtPhone.setText("Phone");
		txtPhone.setColumns(10);
		txtPhone.setBounds(150, 236, 133, 20);
		frame.getContentPane().add(txtPhone);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setColumns(10);
		txtEmail.setBounds(150, 267, 133, 20);
		frame.getContentPane().add(txtEmail);
		
		txtKids = new JTextField();
		txtKids.setText("Kids");
		txtKids.setColumns(10);
		txtKids.setBounds(150, 298, 133, 20);
		frame.getContentPane().add(txtKids);
		
		txtOtherAnimals = new JTextField();
		txtOtherAnimals.setText("Other animals");
		txtOtherAnimals.setColumns(10);
		txtOtherAnimals.setBounds(150, 360, 133, 20);
		frame.getContentPane().add(txtOtherAnimals);
		
		txtAccommodation = new JTextField();
		txtAccommodation.setText("Accommodation");
		txtAccommodation.setColumns(10);
		txtAccommodation.setBounds(150, 391, 133, 20);
		frame.getContentPane().add(txtAccommodation);
		
		txtGarden = new JTextField();
		txtGarden.setText("Garden");
		txtGarden.setColumns(10);
		txtGarden.setBounds(150, 422, 133, 20);
		frame.getContentPane().add(txtGarden);
		
		btnNewButton = new JButton("Create customer");
		btnNewButton.addActionListener(new java.awt.event.ActionListener()  {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				createCustomer(evt);
			}
		});
		btnNewButton.setBounds(150, 528, 133, 50);
		frame.getContentPane().add(btnNewButton);
		
		txtSearch = new JTextField();
		txtSearch.setText("Search");
		txtSearch.setBounds(510, 22, 157, 20);
		frame.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Find customer");
		btnNewButton_1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				selectByPhone(txtSearch.getText());
			}
		});
		btnNewButton_1.setBounds(698, 22, 146, 20);
		frame.getContentPane().add(btnNewButton_1);
		
		lblFirstname = new JLabel("FirstName:");
		lblFirstname.setBounds(510, 81, 157, 14);
		frame.getContentPane().add(lblFirstname);
		
		lblLastname = new JLabel("LastName:");
		lblLastname.setBounds(510, 112, 157, 14);
		frame.getContentPane().add(lblLastname);
		
		lblZipcode = new JLabel("Zipcode:");
		lblZipcode.setBounds(510, 174, 105, 14);
		frame.getContentPane().add(lblZipcode);
		
		lblCity = new JLabel("City:");
		lblCity.setBounds(621, 174, 91, 14);
		frame.getContentPane().add(lblCity);
		
		lblCountry = new JLabel("Country:");
		lblCountry.setBounds(510, 205, 157, 14);
		frame.getContentPane().add(lblCountry);
		
		lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(510, 236, 157, 14);
		frame.getContentPane().add(lblPhone);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setBounds(510, 267, 157, 14);
		frame.getContentPane().add(lblEmail);
		
		lblKids = new JLabel("Kids:");
		lblKids.setBounds(510, 298, 157, 14);
		frame.getContentPane().add(lblKids);
		
		lblOtherAnimals = new JLabel("Other animals");
		lblOtherAnimals.setBounds(510, 360, 157, 14);
		frame.getContentPane().add(lblOtherAnimals);
		
		lblAccommodation = new JLabel("Accommodation:");
		lblAccommodation.setBounds(510, 391, 157, 14);
		frame.getContentPane().add(lblAccommodation);
		
		lblGarden = new JLabel("Garden:");
		lblGarden.setBounds(510, 422, 157, 14);
		frame.getContentPane().add(lblGarden);
		
		btnNewButton_2 = new JButton("Delete Customer");
		btnNewButton_2.setBounds(510, 528, 157, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		txtAddress = new JTextField();
		txtAddress.setText("Address");
		txtAddress.setColumns(10);
		txtAddress.setBounds(150, 140, 133, 20);
		frame.getContentPane().add(txtAddress);
		
		lblAddress = new JLabel("Address:");
		lblAddress.setBounds(510, 143, 157, 14);
		frame.getContentPane().add(lblAddress);
		
		txtPrevdogs = new JTextField();
		txtPrevdogs.setText("PrevDogs");
		txtPrevdogs.setColumns(10);
		txtPrevdogs.setBounds(150, 329, 133, 20);
		frame.getContentPane().add(txtPrevdogs);
		
		lblPrevdog = new JLabel("PrevDog:");
		lblPrevdog.setBounds(510, 332, 157, 14);
		frame.getContentPane().add(lblPrevdog);
		
	}
	
	public static void createCustomer(java.awt.event.ActionEvent e){
		
		CustomerCTRL cusCtrl = new CustomerCTRL();
		
		String firstname = txtFirstname.getText();
		String lastname = txtLastname.getText();
		String phone = txtPhone.getText();
		String email = txtEmail.getText();
		String country = txtCountry.getText();
		String city = txtCity.getText();
		String zipCode = txtZipcode.getText();
		String address = txtAddress.getText();
		String prevDogs = txtPrevdogs.getText();
		String ref = "ref";
		String eanNumber = "eanNumber";
		String gardenDescr = txtGarden.getText();
		String kids = "kids";
		String animals = txtOtherAnimals.getText();
		String accommodation = "accommodation";
		try{
			cusCtrl.CreateCustomer(firstname, lastname, phone, email, country, city, zipCode, address, prevDogs, ref, eanNumber, gardenDescr, kids, animals, accommodation);
		}
		catch(Exception evt){
			evt.printStackTrace();
		}
	}
	
	public static void selectByPhone(String phone){
		CustomerCTRL ctrlCus = new CustomerCTRL();
		ctrlCus.findByPhone(phone);
	}
}
