package q2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class StringUtilityForm extends JFrame {

	private JButton btnCountLetters;
	private JButton btnReverseLetters;
	private JButton btnRemoveDuplicates;
	private JLabel lblInput;
	private JTextField txtInput;
	private JLabel lblOutput;
	private JTextField txtOutput;
	private String input;

	public StringUtilityForm() {
		setTitle("String Utility");
		setLayout(null);
		btnCountLetters = new JButton("Count Letters");
		btnCountLetters.setBounds(20, 10, 150, 30);
		add(btnCountLetters);
		btnCountLetters.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input = txtInput.getText();
				txtOutput.setText(Integer.toString(countLetters(input)));
			}
		});

		btnReverseLetters = new JButton("Reverse Letters");
		btnReverseLetters.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input = txtInput.getText();
				txtOutput.setText(reverseLetters(input));
			}
		});

		btnReverseLetters.setBounds(20, 50, 150, 30);
		add(btnReverseLetters);

		btnRemoveDuplicates = new JButton("Remove Duplicates");
		btnRemoveDuplicates.setBounds(20, 90, 150, 30);
		btnRemoveDuplicates.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input = txtInput.getText();
				txtOutput.setText(removeDuplicates(input));
			}
		});
		add(btnRemoveDuplicates);

		lblInput = new JLabel("Input");
		lblInput.setBounds(200, 30, 100, 20);
		add(lblInput);
		txtInput = new JTextField();
		txtInput.setBounds(200, 50, 200, 20);
		add(txtInput);

		lblOutput = new JLabel("Output");
		lblOutput.setBounds(200, 80, 100, 20);
		add(lblOutput);
		txtOutput = new JTextField();
		txtOutput.setBounds(200, 100, 200, 20);
		add(txtOutput);
	}

	private static int countLetters(String input) {
		return input.length();
	}

	private static String reverseLetters(String input) {
		String revString = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			revString += input.charAt(i);
		}
		return revString;
	}

	private static String removeDuplicates(String input) {
		String newString = "";
		newString += input.charAt(0);
		boolean duplicateFound = false;
		for (int i = 1; i < input.length(); i++) {
			char c = input.charAt(i);
			for (int j = 0; j < newString.length(); j++) {
				if (c == newString.charAt(j)) {
					duplicateFound = true;
					break;
				} else {
					duplicateFound = false;
				}
			}
			if (!duplicateFound) {
				newString += input.charAt(i);
			}

		}
		return newString;
	}
}