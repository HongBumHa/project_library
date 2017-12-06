package kr.or.dgit.project_library.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import kr.or.dgit.project_library.view.MenubarView;

public class UserUi extends JFrame {

	private JPanel contentPane;
	
	public UserUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1334, 853);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(167, 5, 1146, 804);
		contentPane.add(panel_1);
		
		MenubarView panel = new MenubarView();
		panel.setBounds(5, 5, 161, 804);
		contentPane.add(panel);
	}
}
