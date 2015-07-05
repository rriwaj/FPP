package q3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

public class ConverterForm extends JFrame {

	JLabel lblMile;
	JTextField txtMile;
	JLabel lblKm;
	JTextField txtKm;
	JLabel lblPound;
	JTextField txtPound;
	JLabel lblKg;
	JTextField txtKg;
	JLabel lblGallon;
	JTextField txtGallon;
	JLabel lblLitre;
	JTextField txtLiter;
	JLabel lblFahrn;
	JTextField txtFahrn;
	JLabel lblCent;
	JTextField txtCent;
	JLabel lblEmptyLabel;

	JButton btnCalculate;

	public ConverterForm() {
		setTitle("Metric Conversion Assistant");

		setLayout(null);
		lblMile = new JLabel("Mile:");
		lblMile.setBounds(50, 10, 50, 20);
		add(lblMile);

		txtMile = new JTextField();
		txtMile.setBounds(100, 10, 200, 20);
		add(txtMile);

		lblKm = new JLabel("Kilometer:");
		lblKm.setBounds(320, 10, 100, 20);
		add(lblKm);
		txtKm = new JTextField();
		txtKm.setBounds(400, 10, 200, 20);
		add(txtKm);
		txtKm.setEditable(false);

		lblPound = new JLabel("Pound:");
		lblPound.setBounds(40, 40, 50, 20);
		add(lblPound);
		txtPound = new JTextField();
		txtPound.setBounds(100, 40, 200, 20);
		add(txtPound);

		lblKg = new JLabel("Kilogram:");
		lblKg.setBounds(320, 40, 100, 20);
		add(lblKg);
		txtKg = new JTextField();
		txtKg.setBounds(400, 40, 200, 20);
		add(txtKg);
		txtKg.setEditable(false);

		lblGallon = new JLabel("Gallon:");
		lblGallon.setBounds(40, 70, 50, 20);
		add(lblGallon);
		txtGallon = new JTextField();
		txtGallon.setBounds(100, 70, 200, 20);
		add(txtGallon);

		lblLitre = new JLabel("Litre:");
		lblLitre.setBounds(350, 70, 100, 20);
		add(lblLitre);
		txtLiter = new JTextField();
		txtLiter.setBounds(400, 70, 200, 20);
		add(txtLiter);
		txtLiter.setEditable(false);

		lblFahrn = new JLabel("Fahrenheit:");
		lblFahrn.setBounds(10, 100, 100, 20);
		add(lblFahrn);
		txtFahrn = new JTextField();
		txtFahrn.setBounds(100, 100, 200, 20);
		add(txtFahrn);

		lblCent = new JLabel("Centigrade:");
		lblCent.setBounds(310, 100, 100, 20);
		add(lblCent);
		txtCent = new JTextField();
		txtCent.setBounds(400, 100, 200, 20);
		add(txtCent);
		txtCent.setEditable(false);

		btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(300, 140, 100, 30);
		add(btnCalculate);
		btnCalculate.addActionListener(new btnCalculate_Click());

	}

	private class btnCalculate_Click implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double mile = Double.parseDouble(txtMile.getText());
			txtKm.setText(Double.toString(1.60934 * mile));

			double pound = Double.parseDouble(txtPound.getText());
			txtKg.setText(Double.toString(0.45359237 * pound));

			double gallon = Double.parseDouble(txtGallon.getText());
			txtLiter.setText(Double.toString(3.78541178 * gallon));

			double fahn = Double.parseDouble(txtFahrn.getText());
			txtCent.setText(Double.toString((fahn - 32) * 5 / 9));
		}
	}
}
