package GuiLayer;
import javax.swing.JButton;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import CTRLLayer.CustomerCTRL;

public class CustomerGUI {
	private static Text txtFirstname;
	private static Text txtLastname;
	private static Text txtAddress;
	private static Text txtZipcode;
	private static Text txtCountry;
	private static Text txtPhone;
	private static Text txtCity;
	private static Text txtEmail;
	private static Text txtOtherAnimals;
	private static Text txtGarden;
	private static Text txtDogsName;
	private static Text txtAge;
	private static Text txtRace;
	private static Text txtVeterinary;
	private static Text txtPreviousDogs;
	private static Text txtKids;
	
	private static Shell shlNda = new Shell();
	private static Combo combo_2 = new Combo(shlNda, SWT.BORDER);
	         

	
	
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlNda = new Shell();
		shlNda.setSize(739, 536);
		shlNda.setText("NDA");
		shlNda.setLayout(null);
		
		Label lblCustomerInformation = new Label(shlNda, SWT.NONE);
		lblCustomerInformation.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblCustomerInformation.setBounds(155, 34, 154, 21);
		lblCustomerInformation.setText("Customer information");
		
		Label lblDogInformation = new Label(shlNda, SWT.NONE);
		lblDogInformation.setText("Dog information");
		lblDogInformation.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblDogInformation.setBounds(416, 34, 154, 21);
		
		Label label = new Label(shlNda, SWT.SEPARATOR | SWT.VERTICAL);
		label.setBounds(360, 55, 2, 395);
		
		txtFirstname = new Text(shlNda, SWT.BORDER);
		txtFirstname.setText("Firstname");
		txtFirstname.setBounds(155, 61, 154, 21);
		
		txtLastname = new Text(shlNda, SWT.BORDER);
		txtLastname.setText("Lastname");
		txtLastname.setBounds(155, 88, 154, 21);
		
		txtAddress = new Text(shlNda, SWT.BORDER);
		txtAddress.setText("Address");
		txtAddress.setBounds(155, 115, 154, 21);
		
		txtZipcode = new Text(shlNda, SWT.BORDER);
		txtZipcode.setText("Zipcode");
		txtZipcode.setBounds(155, 142, 70, 21);
		
		txtCountry = new Text(shlNda, SWT.BORDER);
		txtCountry.setText("Country");
		txtCountry.setBounds(155, 169, 154, 21);
		
		txtPhone = new Text(shlNda, SWT.BORDER);
		txtPhone.setText("Phone");
		txtPhone.setBounds(155, 196, 154, 21);
		
		txtCity = new Text(shlNda, SWT.BORDER);
		txtCity.setText("City");
		txtCity.setBounds(239, 142, 70, 21);
		
		txtEmail = new Text(shlNda, SWT.BORDER);
		txtEmail.setText("Email");
		txtEmail.setBounds(155, 223, 154, 21);
		
		Label lblFamil = new Label(shlNda, SWT.NONE);
		lblFamil.setText("Family:");
		lblFamil.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblFamil.setBounds(155, 268, 133, 21);
		
		Menu menu = new Menu(shlNda, SWT.BAR);
		shlNda.setMenuBar(menu);
		
		MenuItem mntmFiles = new MenuItem(menu, SWT.CASCADE);
		mntmFiles.setText("Files");
		
		Menu menu_1 = new Menu(mntmFiles);
		mntmFiles.setMenu(menu_1);
		
		MenuItem mntmRemoveCustomer = new MenuItem(menu_1, SWT.NONE);
		mntmRemoveCustomer.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				RemoveCustomerGUI reCus = new RemoveCustomerGUI();
				reCus.open();
			}
		});
		mntmRemoveCustomer.setText("Remove Customer");
		
		MenuItem mntmSetting = new MenuItem(menu, SWT.CASCADE);
		mntmSetting.setText("Setting");
		
		Menu menu_2 = new Menu(mntmSetting);
		mntmSetting.setMenu(menu_2);
		
		MenuItem mntmView = new MenuItem(menu, SWT.CASCADE);
		mntmView.setText("View");
		
		Menu menu_4 = new Menu(mntmView);
		mntmView.setMenu(menu_4);
		
		MenuItem mntmHelp = new MenuItem(menu, SWT.CASCADE);
		mntmHelp.setText("Help");
		
		Menu menu_3 = new Menu(mntmHelp);
		mntmHelp.setMenu(menu_3);
		
		Label label_1 = new Label(shlNda, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setBounds(155, 260, 154, 2);
		
		txtKids = new Text(shlNda, SWT.BORDER);
		txtKids.setText("Kids");
		txtKids.setBounds(155, 297, 154, 21);
		
		txtOtherAnimals = new Text(shlNda, SWT.BORDER);
		txtOtherAnimals.setText("Other animals");
		txtOtherAnimals.setBounds(155, 407, 154, 21);
		
		txtGarden = new Text(shlNda, SWT.BORDER);
		txtGarden.setText("Garden");
		txtGarden.setBounds(155, 353, 154, 21);
		
		txtDogsName = new Text(shlNda, SWT.BORDER);
		txtDogsName.setText("Name");
		txtDogsName.setBounds(416, 61, 154, 21);
		
		txtAge = new Text(shlNda, SWT.BORDER);
		txtAge.setText("Age");
		txtAge.setBounds(416, 88, 70, 21);
		
		txtRace = new Text(shlNda, SWT.BORDER);
		txtRace.setText("Race");
		txtRace.setBounds(416, 115, 154, 21);
		
		txtVeterinary = new Text(shlNda, SWT.BORDER);
		txtVeterinary.setText("Veterinary");
		txtVeterinary.setBounds(416, 142, 154, 21);
		
		Label lblTreatments = new Label(shlNda, SWT.NONE);
		lblTreatments.setText("Treatments");
		lblTreatments.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblTreatments.setBounds(416, 169, 154, 21);
		
		CCombo combo = new CCombo(shlNda, SWT.BORDER);
		combo.setText("Gender");
		combo.setBounds(500, 88, 70, 21);
		
		
//		final Combo combo_2 = new Combo(shlNda, SWT.DROP_DOWN);
//		combo_2.setBounds(155, 324, 154, 23);
//	    String items[] = { "House", "Appartment"};
//	    combo_2.setItems(items);
//	    combo_2.addMenuDetectListener(listener);
	    

		Combo combo_2 = new Combo(shlNda, SWT.DROP_DOWN);
		combo_2.add("House");
		combo_2.add("Appartment");
		//combo_2.setItems(new String[] {"House", "Appartment"});
		combo_2.setBounds(155, 324, 154, 23);
//		combo_2.addSelectionListener(new SelectionAdapter() {
//		      public void widgetSelected(SelectionEvent e) {
//		    	  combo_2.getText();
//		      }
//		    });

		
		
		//combo_2.setText("Accommodation");
		
		JButton btnNextStep = new javax.swing.JButton();
		btnNextStep.setVisible(true);
		btnNextStep.setLocation(638, 442);
		btnNextStep.setSize(99, 25);
	//	Button btnNextStep2 = new Button(shlNda, SWT.NONE);

		btnNextStep.setBounds(614, 442, 99, 25);
		btnNextStep.setText("Create customer");
		btnNextStep.addActionListener(new java.awt.event.ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent evt){
					insertCustomer(evt);
				}
		});
		
		////////////////////////////
		
		List list = new List(shlNda, SWT.BORDER);
		list.setItems(new String[] {"Massage", "Problem", "Training schedule"});
		list.setBounds(416, 196, 154, 178);	
		
		txtPreviousDogs = new Text(shlNda, SWT.BORDER);
		txtPreviousDogs.setText("Previous dogs");
		txtPreviousDogs.setBounds(155, 380, 154, 21);
		
		Button btnNewButton = new Button(shlNda, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				btnNextStep.doClick();
			}
		});
		btnNewButton.setBounds(614, 442, 99, 25);
		btnNewButton.setText("Create customer");
		

		shlNda.open();
		shlNda.layout();
		while (!shlNda.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public static void insertCustomer(java.awt.event.ActionEvent e){
		CustomerCTRL cusCtrl = new CustomerCTRL();
		String firstname = txtFirstname.getText();
		String lastname = txtLastname.getText();
		String phone = txtPhone.getText();
		String email = txtEmail.getText();
		String country = txtCountry.getText();
		String city = txtCity.getText();
		String zipCode = txtZipcode.getText();
		String address = txtAddress.getText();
		String prevDogs = txtPreviousDogs.getText();
		String ref = "ref";
		String eanNumber = "eanNumber";
		String kids = txtKids.getText();
		String animals = txtOtherAnimals.getText();		
		String accommodation = combo_2.getItem(combo_2.getSelectionIndex());
		String gardenDescr = txtGarden.getText();
		try{
			cusCtrl.insertNew(firstname, lastname, phone, email, country, city, zipCode, address, prevDogs, ref, eanNumber, gardenDescr, kids, animals, accommodation);
		}
		catch(Exception evt){
			evt.printStackTrace();
		}
	}
}
