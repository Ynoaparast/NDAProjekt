package GuiLayer;

import CTRLLayer.CustomerCTRL;
import DBLayer.*;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;

public class RemoveCustomerGUI {

	protected Shell shell;
	private Text txtSearch;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			RemoveCustomerGUI window = new RemoveCustomerGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(700, 630);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		txtSearch = new Text(shell, SWT.BORDER);
		txtSearch.setBounds(171, 22, 261, 21);
		txtSearch.setText("Search");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(438, 22, 75, 20);
		btnNewButton.setText("Search");
		
		Label label = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(10, 49, 664, 2);
		
		Label lblSelect = new Label(shell, SWT.NONE);
		lblSelect.setBounds(10, 54, 55, 15);
		lblSelect.setText("Select:");
		
		Label lblName = new Label(shell, SWT.NONE);
		lblName.setBounds(71, 54, 55, 15);
		lblName.setText("Name:");
		
		Label lblAddress = new Label(shell, SWT.NONE);
		lblAddress.setText("Address:");
		lblAddress.setBounds(235, 54, 55, 15);
		
		Button button = new Button(shell, SWT.CHECK);
		button.setBounds(20, 103, 13, 16);
		
		
		
		
		
		Label lblNewname = new Label(shell, SWT.NONE);
		lblNewname.setBounds(71, 104, 142, 15);
		lblNewname.setText("newName");
		
		Label lblNewAddress = new Label(shell, SWT.NONE);
		lblNewAddress.setBounds(235, 104, 197, 15);
		lblNewAddress.setText("New Address");

	}
	
	private void findCustomerInfo(java.awt.event.ActionEvent evt){
		CustomerCTRL cusCtrl = new CustomerCTRL();
		String input = txtSearch.getText();
		if(input.length() == 0){
			
		}
		else{
			//ArrayList<Customer> cusList = cusCtrl.
		}
	}
	
	
}
