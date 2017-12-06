package kr.or.dgit.project_library.common;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class JComboBoxComponent extends JPanel {
	private JComboBox<String> comboBox;
	public JComboBoxComponent() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		comboBox = new JComboBox<String>();
		add(comboBox);
	}
	public void setComboBoxModel(Vector<String> lists){
		ComboBoxModel<String> model = new DefaultComboBoxModel<>(lists);
		comboBox.setModel(model);
	}
	public String getSelectedItem(){
		return (String)comboBox.getSelectedItem();
	}
}
