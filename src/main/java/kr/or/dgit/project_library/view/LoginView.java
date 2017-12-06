package kr.or.dgit.project_library.view;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import kr.or.dgit.project_library.common.JTextFieldComponent;
import kr.or.dgit.project_library.common.JPasswordFieldComponent;
import kr.or.dgit.project_library.common.JButtonComponent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class LoginView extends JPanel {
	
	public LoginView() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblNewLabel.setBounds(40, 10, 399, 62);
		add(lblNewLabel);
		
		JTextFieldComponent panel = new JTextFieldComponent("아이디");
		panel.setBounds(173, 164, 260, 25);
		add(panel);
		
		JPasswordFieldComponent panel_1 = new JPasswordFieldComponent("비밀번호");
		panel_1.setBounds(173, 188, 260, 25);
		add(panel_1);
		
		JButtonComponent panel_2 = new JButtonComponent("회원가입");
		panel_2.setBounds(337, 251, 96, 25);
		add(panel_2);
		
		JButtonComponent panel_3 = new JButtonComponent("로그인");
		panel_3.setBounds(264, 223, 84, 25);
		add(panel_3);
		
		JButtonComponent panel_4 = new JButtonComponent("취소");
		panel_4.setBounds(349, 223, 84, 25);
		add(panel_4);
		
		JButtonComponent panel_5 = new JButtonComponent("ID/비밀번호찾기");
		panel_5.setBounds(209, 251, 127, 25);
		add(panel_5);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon("C:\\Users\\DGIT3-7\\Desktop\\img1234.png"));
		lblBg.setBounds(0, 0, 542, 300);
		add(lblBg);

	}
}
