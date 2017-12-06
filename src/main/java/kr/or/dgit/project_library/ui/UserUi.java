package kr.or.dgit.project_library.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.project_library.view.MenubarView;
import kr.or.dgit.project_library.view.RentalBookView;
import java.awt.BorderLayout;

public class UserUi extends JFrame {
	private static final UserUi instance = new UserUi();
	private JPanel contentPane;
	private JPanel pContent;
	
	public static UserUi getInstance() {
		return instance;
	}
	public JPanel getpContent() {
		return pContent;
	}
	public void setpContent(JPanel pContent) {
		this.pContent = pContent;
	}
	public JPanel getContentPane() {
		return contentPane;
	}
	private UserUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1334, 853);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pContent = new RentalBookView();
		pContent.setBounds(164, 5, 1149, 804);
		contentPane.add(pContent);
		pContent.setLayout(new BorderLayout(0, 0));
		
		MenubarView pMenuBar = new MenubarView("도서 대여","도서 반납","개인 정보", "현황 보기");
		pMenuBar.setBounds(0, 5, 161, 804);
		contentPane.add(pMenuBar);
	}
	
	public void changePanel(JPanel pChange) {
		pContent.removeAll();
		
		pContent.add(pChange,BorderLayout.CENTER);
		contentPane.add(pContent);
		revalidate();
		repaint();
	}
}
