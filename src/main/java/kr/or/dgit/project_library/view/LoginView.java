package kr.or.dgit.project_library.view;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import kr.or.dgit.project_library.common.JTextFieldComponent;
import kr.or.dgit.project_library.common.JPasswordFieldComponent;
import kr.or.dgit.project_library.common.JButtonComponent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class LoginView extends JPanel {
	
	public LoginView() {
		setLayout(null);
		
		JTextFieldComponent panel = new JTextFieldComponent("아이디");
		panel.setBounds(99, 206, 260, 25);
		add(panel);
		
		JPasswordFieldComponent panel_1 = new JPasswordFieldComponent("비밀번호");
		panel_1.setBounds(99, 230, 260, 25);
		add(panel_1);
		
		JButtonComponent panel_2 = new JButtonComponent("회원가입");
		panel_2.setBounds(99, 265, 84, 25);
		add(panel_2);
		
		JButtonComponent panel_3 = new JButtonComponent("로그인");
		panel_3.setBounds(187, 265, 84, 25);
		add(panel_3);
		
		JButtonComponent panel_4 = new JButtonComponent("취소");
		panel_4.setBounds(275, 265, 84, 25);
		add(panel_4);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon("C:\\Users\\DGIT3-7\\Desktop\\loginBg1.PNG"));
		lblBg.setBounds(0, 0, 370, 300);
		add(lblBg);

	}
	
}
