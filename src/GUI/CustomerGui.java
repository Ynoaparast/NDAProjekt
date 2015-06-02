package GUI;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

import CTRL.CustomerCTRL;
import Model.Customer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private static JButton btnNewButton_2;
	private static JButton btnUpdateButton;
	private static JTextField txtSearch;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblLastname_1;
	private JLabel lblAddress_1;
	private JLabel lblZip;
	private JLabel lblCity_1;
	private JLabel lblCountry_1;
	private JLabel lblPhone_1;
	private JLabel lblEmail_1;
	private JLabel lblKids_1;
	private JLabel lblPreviousDogs;
	private JLabel lblOtherAnimals_1;
	private JLabel lblAccommodation_1;
	private JLabel lblGarden_1;
	private JButton btnUpdateCustomer;

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
		
		btnNewButton = new JButton("Create Customer");
		btnNewButton.addActionListener(new java.awt.event.ActionListener()  {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				createCustomer(evt);
			}
		});
		btnNewButton.setBounds(150, 468, 133, 50);
		frame.getContentPane().add(btnNewButton);
		
		
		txtSearch = new JTextField();
		txtSearch.setText("Search");
		txtSearch.setBounds(510, 22, 157, 20);
		frame.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Find customer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				Customer cus = findCustomer(txtSearch.getText());
				
				textField.setText(cus.getFirstName());
				textField_1.setText(cus.getLastName());
				textField_2.setText(cus.getAddress());
				textField_3.setText(cus.getZipCode());
				textField_4.setText(cus.getCity());
				textField_5.setText(cus.getCountry());
				textField_6.setText(cus.getPhone());
				textField_7.setText(cus.getEmail());
				textField_8.setText(cus.getKids());
				textField_9.setText(cus.getPreviousDogs());
				textField_10.setText(cus.getAnimals());
				textField_11.setText(cus.getAccommodation());
				textField_12.setText(cus.getGardenDescription());
				
				
				
			}
		});
		btnNewButton_1.setBounds(698, 22, 146, 20);
		frame.getContentPane().add(btnNewButton_1);
		
		btnUpdateCustomer = new JButton("Update Customer");
		btnUpdateCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
			}
		});
		btnUpdateCustomer.setBounds(510, 468, 157, 50);
		frame.getContentPane().add(btnUpdateCustomer);
		
		
		btnNewButton_2 = new JButton("Delete Customer");
		btnNewButton_2.setBounds(510, 528, 157, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		txtAddress = new JTextField();
		txtAddress.setText("Address");
		txtAddress.setColumns(10);
		txtAddress.setBounds(150, 140, 133, 20);
		frame.getContentPane().add(txtAddress);
		
		
		txtPrevdogs = new JTextField();
		txtPrevdogs.setText("PrevDogs");
		txtPrevdogs.setColumns(10);
		txtPrevdogs.setBounds(150, 329, 133, 20);
		frame.getContentPane().add(txtPrevdogs);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(510, 78, 133, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(510, 109, 133, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(510, 174, 60, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(607, 174, 60, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(510, 205, 133, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(510, 236, 133, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(510, 267, 133, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(510, 298, 133, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(510, 360, 133, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(510, 391, 133, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(510, 140, 133, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(510, 329, 133, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(510, 422, 133, 20);
		frame.getContentPane().add(textField_12);
		
		JLabel lblFirstname_1 = new JLabel("Firstname");
		lblFirstname_1.setBounds(446, 75, 54, 17);
		frame.getContentPane().add(lblFirstname_1);
		
		lblLastname_1 = new JLabel("Lastname");
		lblLastname_1.setBounds(446, 109, 72, 20);
		frame.getContentPane().add(lblLastname_1);
		
		lblAddress_1 = new JLabel("Address");
		lblAddress_1.setBounds(446, 140, 72, 20);
		frame.getContentPane().add(lblAddress_1);
		
		lblZip = new JLabel("ZIP");
		lblZip.setBounds(469, 174, 72, 20);
		frame.getContentPane().add(lblZip);
		
		lblCity_1 = new JLabel("City");
		lblCity_1.setBounds(580, 174, 72, 20);
		frame.getContentPane().add(lblCity_1);
		
		lblCountry_1 = new JLabel("Country");
		lblCountry_1.setBounds(446, 205, 72, 20);
		frame.getContentPane().add(lblCountry_1);
		
		lblPhone_1 = new JLabel("Phone");
		lblPhone_1.setBounds(446, 236, 72, 20);
		frame.getContentPane().add(lblPhone_1);
		
		lblEmail_1 = new JLabel("Email");
		lblEmail_1.setBounds(446, 267, 72, 20);
		frame.getContentPane().add(lblEmail_1);
		
		lblKids_1 = new JLabel("Kids");
		lblKids_1.setBounds(446, 298, 72, 20);
		frame.getContentPane().add(lblKids_1);
		
		lblPreviousDogs = new JLabel("Previous Dogs");
		lblPreviousDogs.setBounds(432, 329, 72, 20);
		frame.getContentPane().add(lblPreviousDogs);
		
		lblOtherAnimals_1 = new JLabel("Other Animals");
		lblOtherAnimals_1.setBounds(432, 360, 72, 20);
		frame.getContentPane().add(lblOtherAnimals_1);
		
		lblAccommodation_1 = new JLabel("Accommodation");
		lblAccommodation_1.setBounds(428, 391, 90, 20);
		frame.getContentPane().add(lblAccommodation_1);
		
		lblGarden_1 = new JLabel("Garden");
		lblGarden_1.setBounds(432, 422, 72, 20);
		frame.getContentPane().add(lblGarden_1);
		
		
	}
	
	public static void createCustomer(ActionEvent e){
		
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
			cusCtrl.createCustomer(firstname, lastname, phone, email, country, city, zipCode, address, prevDogs, ref, eanNumber, gardenDescr, kids, animals, accommodation);
		}
		catch(Exception evt){
			evt.printStackTrace();
		}
	}
	
	public static Customer findCustomer(String phone){
		CustomerCTRL ctrlCus = new CustomerCTRL();
		Customer cus = ctrlCus.findCustomer(phone);
		return cus;	
	}
}
