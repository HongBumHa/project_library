package kr.or.dgit.project_library.common;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class JPasswordFieldComponent extends JPanel {
	private JPasswordField passwordField;


	public JPasswordField getPasswordField() {
		return passwordField;
	}


	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}


	public JPasswordFieldComponent(String title) {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel(title);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel);
		
		passwordField = new JPasswordField();
		add(passwordField);

	}

}
