package one;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {
	Container con;
	void CreateScreen() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Background Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set frame to center of screen
		frame.setLocationRelativeTo(null);
		frame.setSize(600, 300);
		con = frame.getContentPane();
		con.setLayout(new FlowLayout());

		// Create Red Button
		JButton btn = new JButton("RED");
		// add button to Frame
		con.add(btn);

		// Create Blue button
		JButton btnr = new JButton("BLUE");
		// add button to Frame
		con.add(btnr);

		// Create pink button
		JButton btnp = new JButton("PINK");
		// add button to Frame
		con.add(btnp);

		// add click event
		ButtonClick btnClick = new ButtonClick();
		btn.addActionListener(btnClick);
		btnr.addActionListener(btnClick);
		btnp.addActionListener(btnClick);
	}

	class ButtonClick implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == "BLUE") {
				con.setBackground(Color.BLUE);
			} else if (e.getActionCommand() == "RED") {
				con.setBackground(Color.RED);
			} else if (e.getActionCommand() == "PINK") {
				con.setBackground(Color.PINK);
			}
		}
	}
}
