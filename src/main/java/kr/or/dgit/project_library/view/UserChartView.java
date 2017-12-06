package kr.or.dgit.project_library.view;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserChartView extends JPanel {
	private JTextField textField;
	
	public UserChartView() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(97, 183, 116, 21);
		add(textField);
		textField.setColumns(10);
		
	}
}
