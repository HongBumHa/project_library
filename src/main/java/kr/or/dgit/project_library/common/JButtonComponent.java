package kr.or.dgit.project_library.common;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JButtonComponent extends JPanel {

	public JButtonComponent(String title) {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton(title);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton);
		
	}

}
