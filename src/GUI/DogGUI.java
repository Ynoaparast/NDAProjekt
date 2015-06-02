package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;

import CTRL.CustomerCTRL;
import CTRL.DogCTRL;
import DB.dbConnection;
import Model.Customer;

public class DogGUI {

	private JFrame frame;
	private static JTextField txtName;
	private static JTextField txtAge;
	private static JTextField txtGender;
	private static JTextField txtRace;
	private static JTextField txtVet;
	private static JTextField txtInjuries;
	private static JTextField txtIllness;
	private static JTextField txtMaturity;
	private static JTextField txtHeat;
	private static JTextField txtPseudopregnancy;
	private static JTextField txtCastrated;
	private static JTextField txtRelatives;
	private static JTextField txtArrival;
	private static JTextField txtPrevioushomes;
	private static JButton btnCreateDog;
	private static JTextField txtOwnerphone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DogGUI window = new DogGUI();
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
	public DogGUI() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 791, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(40, 31, 107, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setText("Age");
		txtAge.setBounds(40, 62, 107, 20);
		frame.getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		txtGender = new JTextField();
		txtGender.setText("Gender");
		txtGender.setBounds(40, 93, 107, 20);
		frame.getContentPane().add(txtGender);
		txtGender.setColumns(10);
		
		txtRace = new JTextField();
		txtRace.setText("Race");
		txtRace.setBounds(40, 124, 107, 20);
		frame.getContentPane().add(txtRace);
		txtRace.setColumns(10);
		
		txtVet = new JTextField();
		txtVet.setText("Vet");
		txtVet.setBounds(40, 155, 107, 20);
		frame.getContentPane().add(txtVet);
		txtVet.setColumns(10);
		
		txtInjuries = new JTextField();
		txtInjuries.setText("Injuries");
		txtInjuries.setBounds(40, 186, 107, 20);
		frame.getContentPane().add(txtInjuries);
		txtInjuries.setColumns(10);
		
		txtIllness = new JTextField();
		txtIllness.setText("Illness");
		txtIllness.setBounds(40, 217, 107, 20);
		frame.getContentPane().add(txtIllness);
		txtIllness.setColumns(10);
		
		txtMaturity = new JTextField();
		txtMaturity.setText("Maturity");
		txtMaturity.setBounds(40, 248, 107, 20);
		frame.getContentPane().add(txtMaturity);
		txtMaturity.setColumns(10);
		
		txtHeat = new JTextField();
		txtHeat.setText("Heat");
		txtHeat.setBounds(40, 279, 107, 20);
		frame.getContentPane().add(txtHeat);
		txtHeat.setColumns(10);
		
		txtPseudopregnancy = new JTextField();
		txtPseudopregnancy.setText("Pseudopregnancy");
		txtPseudopregnancy.setBounds(40, 310, 107, 20);
		frame.getContentPane().add(txtPseudopregnancy);
		txtPseudopregnancy.setColumns(10);
		
		txtCastrated = new JTextField();
		txtCastrated.setText("Castrated");
		txtCastrated.setBounds(40, 341, 107, 20);
		frame.getContentPane().add(txtCastrated);
		txtCastrated.setColumns(10);
		
		txtRelatives = new JTextField();
		txtRelatives.setText("Relatives");
		txtRelatives.setBounds(40, 372, 107, 20);
		frame.getContentPane().add(txtRelatives);
		txtRelatives.setColumns(10);
		
		txtArrival = new JTextField();
		txtArrival.setText("Arrival");
		txtArrival.setBounds(40, 403, 107, 20);
		frame.getContentPane().add(txtArrival);
		txtArrival.setColumns(10);
		
		txtPrevioushomes = new JTextField();
		txtPrevioushomes.setText("PreviousHomes");
		txtPrevioushomes.setBounds(40, 434, 107, 20);
		frame.getContentPane().add(txtPrevioushomes);
		txtPrevioushomes.setColumns(10);
		
		txtOwnerphone = new JTextField();
		txtOwnerphone.setText("OwnerPhone");
		txtOwnerphone.setBounds(157, 31, 86, 20);
		frame.getContentPane().add(txtOwnerphone);
		txtOwnerphone.setColumns(10);
		
		btnCreateDog = new JButton("Create Dog");
		btnCreateDog.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent evt) {		
				CreateDog(evt);
			}

		});
		btnCreateDog.setBounds(40, 480, 200, 50);
		frame.getContentPane().add(btnCreateDog);
		
		
	}
	protected void CreateDog(ActionEvent evt) {
		
//		CustomerCTRL cusCTRL = new CustomerCTRL();
//		Customer c = cusCTRL.findCustomer(txtOwnerphone.getText());
//		int id = c.getID();
		
		
		DogCTRL DCtrl = new DogCTRL();
		String name = txtName.getText();
		String age = txtAge.getText();
		String gender = txtGender.getText(); 
		String race = txtRace.getText(); 
		String vet = txtVet.getText(); 
		String injuries = txtInjuries.getText(); 
		String illness = txtIllness.getText(); 
		String maturity = txtMaturity.getText(); 
		String heat = txtHeat.getText(); 
		String pseudopregnancy = txtPseudopregnancy.getText();
		String castrated = txtCastrated.getText(); 
		String relatives = txtRelatives.getText();
		String arrival = txtArrival.getText();
		String previousHomes = txtPrevioushomes.getText();
		int CustomerID = 49;
		try{
			DCtrl.CreateDog(name, age, gender, race, vet, injuries, illness, maturity, heat, pseudopregnancy, castrated, relatives, arrival, previousHomes, CustomerID);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
