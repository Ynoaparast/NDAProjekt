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

	private static JTextField txtFirstname2;
	private static JTextField txtLastname2;
	private static JTextField txtZipcode2;
	private static JTextField txtCity2;
	private static JTextField txtCountry2;
	private static JTextField txtPhone2;
	private static JTextField txtEmail2;
	private static JTextField txtKids2;
	private static JTextField txtOtherAnimals2;
	private static JTextField txtAccommodation2;
	private static JTextField txtAddress2;
	private static JTextField txtPrevdogs2;
	private static JTextField textGarden2;
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
	private static JTextField hiddenTextField;

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
				
				hiddenTextField.setText(String.valueOf(cus.getID()));
				
				txtFirstname2.setText(cus.getFirstName());
				txtLastname2.setText(cus.getLastName());
				txtAddress2.setText(cus.getAddress());
				txtZipcode2.setText(cus.getZipCode());
				txtCity2.setText(cus.getCity());
				txtCountry2.setText(cus.getCountry());
				txtPhone2.setText(cus.getPhone());
				txtEmail2.setText(cus.getEmail());
				txtKids2.setText(cus.getKids());
				txtPrevdogs2.setText(cus.getPreviousDogs());
				txtOtherAnimals2.setText(cus.getAnimals());
				txtAccommodation2.setText(cus.getAccommodation());
				textGarden2.setText(cus.getGardenDescription());
				
				
				
			}
		});
		btnNewButton_1.setBounds(698, 22, 146, 20);
		frame.getContentPane().add(btnNewButton_1);
		
		btnUpdateCustomer = new JButton("Update Customer");
		btnUpdateCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				updateCustomer(evt);
			}
		});
		btnUpdateCustomer.setBounds(510, 468, 157, 50);
		frame.getContentPane().add(btnUpdateCustomer);
		
		
		btnNewButton_2 = new JButton("Delete Customer");
		btnNewButton_2.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
			deleteCustomer(evt);
			}
		});
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
		
		txtFirstname2 = new JTextField();
		txtFirstname2.setColumns(10);
		txtFirstname2.setBounds(510, 78, 133, 20);
		frame.getContentPane().add(txtFirstname2);
		
		txtLastname2 = new JTextField();
		txtLastname2.setColumns(10);
		txtLastname2.setBounds(510, 109, 133, 20);
		frame.getContentPane().add(txtLastname2);
		
		txtZipcode2 = new JTextField();
		txtZipcode2.setColumns(10);
		txtZipcode2.setBounds(510, 174, 60, 20);
		frame.getContentPane().add(txtZipcode2);
		
		txtCity2 = new JTextField();
		txtCity2.setColumns(10);
		txtCity2.setBounds(607, 174, 60, 20);
		frame.getContentPane().add(txtCity2);
		
		txtCountry2 = new JTextField();
		txtCountry2.setColumns(10);
		txtCountry2.setBounds(510, 205, 133, 20);
		frame.getContentPane().add(txtCountry2);
		
		txtPhone2 = new JTextField();
		txtPhone2.setColumns(10);
		txtPhone2.setBounds(510, 236, 133, 20);
		frame.getContentPane().add(txtPhone2);
		
		txtEmail2 = new JTextField();
		txtEmail2.setColumns(10);
		txtEmail2.setBounds(510, 267, 133, 20);
		frame.getContentPane().add(txtEmail2);
		
		txtKids2 = new JTextField();
		txtKids2.setColumns(10);
		txtKids2.setBounds(510, 298, 133, 20);
		frame.getContentPane().add(txtKids2);
		
		txtOtherAnimals2 = new JTextField();
		txtOtherAnimals2.setColumns(10);
		txtOtherAnimals2.setBounds(510, 360, 133, 20);
		frame.getContentPane().add(txtOtherAnimals2);
		
		txtAccommodation2 = new JTextField();
		txtAccommodation2.setColumns(10);
		txtAccommodation2.setBounds(510, 391, 133, 20);
		frame.getContentPane().add(txtAccommodation2);
		
		txtAddress2 = new JTextField();
		txtAddress2.setColumns(10);
		txtAddress2.setBounds(510, 140, 133, 20);
		frame.getContentPane().add(txtAddress2);
		
		txtPrevdogs2 = new JTextField();
		txtPrevdogs2.setColumns(10);
		txtPrevdogs2.setBounds(510, 329, 133, 20);
		frame.getContentPane().add(txtPrevdogs2);
		
		textGarden2 = new JTextField();
		textGarden2.setColumns(10);
		textGarden2.setBounds(510, 422, 133, 20);
		frame.getContentPane().add(textGarden2);
		
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
		
		hiddenTextField = new JTextField();
		hiddenTextField.setBounds(575, 50, 25, 20);
		frame.getContentPane().add(hiddenTextField);
		hiddenTextField.setColumns(10);
		
		
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
	
	public static void updateCustomer(ActionEvent e){
		
		CustomerCTRL cusCtrl = new CustomerCTRL();
	    
		int id = Integer.parseInt(hiddenTextField.getText());
		
		String firstname = txtFirstname2.getText();
		String lastname = txtLastname2.getText();
		String phone = txtPhone2.getText();
		String email = txtEmail2.getText();
		String country = txtCountry2.getText();
		String city = txtCity2.getText();
		String zipCode = txtZipcode2.getText();
		String address = txtAddress2.getText();
		String prevDogs = txtPrevdogs2.getText();
		String ref = "ref";
		String eanNumber = "eanNumber";
		String gardenDescr = textGarden2.getText();
		String kids = txtKids2.getText();
		String animals = txtOtherAnimals2.getText();
		String accommodation = txtAccommodation2.getText();
		
		
		try{
			cusCtrl.updateCustomer(firstname, lastname, phone, email, country, city, zipCode, address, prevDogs, ref, eanNumber, gardenDescr, kids, animals, accommodation, id);
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
	
	public static void deleteCustomer(ActionEvent evt){
		int id = Integer.parseInt(hiddenTextField.getText());
		CustomerCTRL cusCTRL = new CustomerCTRL();
		
		cusCTRL.deleteCustomer(id);
	}
}
