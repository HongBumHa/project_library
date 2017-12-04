package kr.or.dgit.project_library.common;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JTextFieldComponent extends JPanel {
	private JTextField textField;
	
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextFieldComponent(String title) {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel(title);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);

	}

}
