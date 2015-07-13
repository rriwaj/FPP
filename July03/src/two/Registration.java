package two;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame {
	private Student st;
	JLabel lblFormTitle;
	JLabel lblFormTitle1;
	JLabel lblFirstName;
	JLabel lblLastName;
	JLabel lblStreet;
	JLabel lblCity;
	JLabel lblState;
	JLabel lblCountry;
	JLabel lblGender;
	JLabel lblCourse;
	JLabel lblSession;
	JLabel lblMessage;

	JTextField txtFirstName;
	JTextField txtLastName;
	JTextField txtStreet;
	JTextField txtCity;
	JTextField txtState;
	JTextField txtCountry;
	JRadioButton rbMale;
	JRadioButton rbFemale;
	JComboBox<String> cmbCourse;
	JCheckBox chkMorning;
	JCheckBox chkAfternoon;
	JCheckBox chkEvenning;
	JTextArea txtMessage;
	JButton btnSubmit;

	ButtonGroup rbGender;
	String[] courses = new String[] { "JAVA", ".NET", "PHP" };

	public Registration() {
		st = new Student();
		setTitle("Online class registration form");
		setLayout(null);
		// Form Title
		lblFormTitle = new JLabel(
				"Welcome to Maharishi University Of Management");

		lblFormTitle.setBounds(200, 0, 300, 20);
		add(lblFormTitle);
		lblFormTitle1 = new JLabel("Online class registration form");
		lblFormTitle1.setBounds(200, 25, 300, 10);
		add(lblFormTitle1);

		// First Name
		lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(20, 60, 150, 20);
		add(lblFirstName);
		txtFirstName = new JTextField();
		txtFirstName.setBounds(125, 60, 200, 20);
		add(txtFirstName);

		// Last Name
		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(20, 85, 150, 20);
		add(lblLastName);
		txtLastName = new JTextField();
		txtLastName.setBounds(125, 85, 200, 20);
		add(txtLastName);

		// Street
		lblStreet = new JLabel("Street");
		lblStreet.setBounds(20, 110, 150, 20);
		add(lblStreet);
		txtStreet = new JTextField();
		txtStreet.setBounds(125, 110, 200, 20);
		add(txtStreet);
		// City
		lblCity = new JLabel("City");
		lblCity.setBounds(20, 135, 150, 20);
		add(lblCity);
		txtCity = new JTextField();
		txtCity.setBounds(125, 135, 200, 20);
		add(txtCity);
		// State
		lblState = new JLabel("State");
		lblState.setBounds(20, 160, 150, 20);
		add(lblState);
		txtState = new JTextField();
		txtState.setBounds(125, 160, 200, 20);
		add(txtState);

		// Country
		lblCountry = new JLabel("Country");
		lblCountry.setBounds(20, 185, 150, 20);
		add(lblCountry);
		txtCountry = new JTextField();
		txtCountry.setBounds(125, 185, 200, 20);
		add(txtCountry);

		// Gender
		lblGender = new JLabel("Gender");
		lblGender.setBounds(20, 210, 150, 20);
		add(lblGender);
		rbMale = new JRadioButton("Male");
		rbMale.setBounds(125, 210, 60, 20);
		rbFemale = new JRadioButton("Female");
		rbFemale.setBounds(190, 210, 125, 20);
		rbGender = new ButtonGroup();
		rbGender.add(rbMale);
		rbGender.add(rbFemale);
		add(rbMale);
		add(rbFemale);

		// Course
		lblCourse = new JLabel("Select Course");
		lblCourse.setBounds(20, 235, 100, 20);
		add(lblCourse);
		cmbCourse = new JComboBox<>(courses);
		cmbCourse.setBounds(125, 235, 200, 20);
		cmbCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cmbCourse.getSelectedItem() == "JAVA") {
					txtMessage.setText("Reason to select JAVA");
				} else if (cmbCourse.getSelectedItem() == ".NET") {
					txtMessage.setText("Reason to select .NET");
				} else if (cmbCourse.getSelectedItem() == "PHP") {
					txtMessage.setText("Reason to select PHP");
				}

			}
		});
		add(cmbCourse);

		// Session
		lblSession = new JLabel("Suitable Session");
		lblSession.setBounds(20, 260, 150, 20);
		add(lblSession);
		chkMorning = new JCheckBox("Morning");
		chkMorning.setBounds(125, 260, 100, 20);
		add(chkMorning);
		chkAfternoon = new JCheckBox("Afternoon");
		chkAfternoon.setBounds(230, 260, 100, 20);
		add(chkAfternoon);
		chkEvenning = new JCheckBox("Evening");
		chkEvenning.setBounds(330, 260, 100, 20);
		add(chkEvenning);

		// Message
		lblMessage = new JLabel("Message");
		lblMessage.setBounds(20, 285, 100, 20);
		add(lblMessage);
		txtMessage = new JTextArea();
		txtMessage.setBounds(125, 285, 200, 100);
		add(txtMessage);
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(125, 400, 100, 30);
		add(btnSubmit);
		btnSubmit.addActionListener(new btnSubmit_Click());
	}

	class btnSubmit_Click implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			validateForm();
			printInConsole();
		}

		public boolean validateForm() {
			if (txtFirstName.getText().equals("")) {
				JOptionPane.showMessageDialog(new JFrame(), "Enter FirstName");
				return false;
			}
			if (txtLastName.getText().equals("")) {
				JOptionPane.showMessageDialog(new JFrame(), "Enter LastName");
				return false;
			}
			if (txtStreet.getText().equals("")) {
				JOptionPane.showMessageDialog(new JFrame(), "Enter Street");
				return false;
			}
			if (txtCity.getText().equals("")) {
				JOptionPane.showMessageDialog(new JFrame(), "Enter City");
				return false;
			}
			if (txtState.getText().equals("")) {
				JOptionPane.showMessageDialog(new JFrame(), "Enter State");
				return false;
			}
			if (txtCountry.getText().equals("")) {
				JOptionPane.showMessageDialog(new JFrame(), "Enter Country");
				return false;
			}
			if (rbGender.getSelection() == null) {
				JOptionPane.showMessageDialog(new JFrame(), "Choose Gender");
				return false;
			}
			if (!chkMorning.isSelected() || !chkMorning.isSelected()
					|| chkEvenning.isSelected()) {
				JOptionPane.showMessageDialog(new JFrame(),
						"Select Suitable Session");
				return false;
			}
			return true;
		}

		void printInConsole() {

		}
	}

}
