package kr.or.dgit.project_library.common;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import kr.or.dgit.project_library.ui.UserUi;

public class JButtonComponent extends JPanel {

	public JButtonComponent(String title) {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton(title);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("로그인")) {
					UserUi frame = UserUi.getInstance();
					frame.setVisible(true);
				};
				
			}
		});
		add(btnNewButton);
		
	}

}
