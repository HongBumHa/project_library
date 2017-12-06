package kr.or.dgit.project_library.view;

import java.util.Vector;

import javax.swing.JPanel;

import kr.or.dgit.project_library.common.JComboBoxComponent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import kr.or.dgit.project_library.common.JButtonComponent;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.LineBorder;
import kr.or.dgit.project_library.common.JTableLIstComponent;

public class RentalBookView extends JPanel {

	private JComboBoxComponent panel_1;
	private JTextField textField;
	private JPanel panel_2;
	private JTableLIstComponent panel_3;
	public RentalBookView() {
		setLayout(null);
		
		
		
		panel_1 = new JComboBoxComponent();
		panel_1.setBounds(73, 57, 109, 21);
		add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField = new JTextField();
		textField.setBounds(185, 56, 445, 24);
		add(textField);
		textField.setColumns(10);
		
		JButtonComponent panel = new JButtonComponent("검색");
		panel.setBounds(634, 57, 84, 24);
		add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "도서 검색", TitledBorder.LEADING, TitledBorder.TOP, new Font("맑은 고딕", Font.BOLD, 20), new Color(0, 0, 0)));
		panel_2.setBounds(12, 10, 779, 758);
		add(panel_2);
		panel_2.setLayout(null);
		
		panel_3 = new JTableLIstComponent();
		panel_3.loadData();
		panel_3.setBounds(12, 85, 755, 663);
		panel_2.add(panel_3);
		setCobModel();
	}
	
	private void setCobModel() {
		Vector<String> lists = new Vector<>();
		lists.add("전체보기");
		lists.add("도서코드");
		lists.add("도서명");
		lists.add("저자");
		panel_1.setComboBoxModel(lists);
		
	}
}
