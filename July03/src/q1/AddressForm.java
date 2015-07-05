package q1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddressForm extends JFrame {

	private JLabel lblSpace;
	private JLabel lblName;
	private JTextField txtName;
	private JLabel lblStreet;
	private JTextField txtStreet;
	private JLabel lblCity;
	private JTextField txtCity;
	private JLabel lblState;
	private JTextField txtState;
	private JLabel lblZip;
	private JTextField txtZip;
	private JButton btnSubmit;
	private String result;

	public AddressForm() {
		setTitle("Address Form");
		setLayout(null);
		lblSpace = new JLabel();
		lblSpace.setBounds(40, 0, 50, 20);
		add(lblSpace);
		// Name
		lblName = new JLabel("Name");
		lblName.setBounds(40, 0, 50, 20);
		add(lblName);
		txtName = new JTextField();
		txtName.setBounds(40, 20, 200, 20);
		add(txtName);

		// Street
		lblStreet = new JLabel("Street");
		lblStreet.setBounds(260, 0, 50, 20);
		add(lblStreet);
		txtStreet = new JTextField();
		txtStreet.setBounds(260, 20, 200, 20);
		add(txtStreet);

		// City
		lblCity = new JLabel("City");
		lblCity.setBounds(480, 0, 50, 20);
		add(lblCity);
		txtCity = new JTextField();
		txtCity.setBounds(480, 20, 200, 20);
		add(txtCity);

		// State
		lblState = new JLabel("State");
		lblState.setBounds(80, 60, 50, 20);
		add(lblState);
		txtState = new JTextField();
		txtState.setBounds(80, 80, 200, 20);
		add(txtState);

		// Zip
		lblZip = new JLabel("Zip");
		lblZip.setBounds(300, 60, 50, 20);
		add(lblZip);
		txtZip = new JTextField();
		txtZip.setBounds(300, 80, 200, 20);
		add(txtZip);

		// button
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(250, 120, 100, 40);
		add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(),
						"Values Printed in console");
				printValueToConsole();
			}
		});

	}

	void printValueToConsole() {
		StringBuilder output = new StringBuilder();
		output.append("Name:");
		output.append(txtName.getText());
		output.append("\nStreet:");
		output.append(txtStreet.getText());
		output.append("\nCity:");
		output.append(txtCity.getText());
		output.append("\nState:");
		output.append(txtState.getText());
		output.append("\nZip");
		output.append(txtZip.getText());
		System.out.println(output.toString());
	}

	public static void main(String[] args) {
		AddressForm frm = new AddressForm();
		frm.setVisible(true);
		frm.setBounds(0, 0, 700, 300);
	}
}
