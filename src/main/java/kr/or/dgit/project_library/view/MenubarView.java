package kr.or.dgit.project_library.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;

import org.apache.ibatis.annotations.Case;

public class MenubarView extends JPanel {
	private JLabel lblChartBorder;
	private JLabel lblUserinfoBorder;
	private JLabel lblBookReturnBorder;
	private JLabel lblBookRentalBorder;
	private JLabel lblBookRental;
	private JLabel lblBookReturn;
	private JLabel lblUserinfo;
	private JLabel lblChart;

	
	public MenubarView() {
		setLayout(null);
		
		lblBookRental = new JLabel("도서 대여");
		lblBookRental.setIcon(null);
		lblBookRental.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 14));
		lblBookRental.setForeground(Color.BLACK);
		lblBookRental.setBackground(Color.WHITE);
		lblBookRental.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClick(1);
			}
		});
		lblBookRental.setBounds(48, 131, 81, 44);
		add(lblBookRental);
		
		JLabel lblBookRental1 = new JLabel("");
		lblBookRental1.setBorder(new LineBorder(new Color(230, 230, 250), 5));
		lblBookRental1.setBounds(34, 136, 10, 32);
		add(lblBookRental1);
		
		lblBookRentalBorder = new JLabel("");
		lblBookRentalBorder.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblBookRentalBorder.setBounds(48, 164, 81, 3);
		add(lblBookRentalBorder);
		
		lblBookReturn = new JLabel("도서 반납");
		lblBookReturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClick(2);
			}
		});
		lblBookReturn.setForeground(Color.GRAY);
		lblBookReturn.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 14));
		lblBookReturn.setBackground(Color.WHITE);
		lblBookReturn.setBounds(48, 185, 81, 44);
		add(lblBookReturn);
		
		JLabel lblBookReturn1 = new JLabel("");
		lblBookReturn1.setEnabled(false);
		lblBookReturn1.setBorder(new LineBorder(new Color(230, 230, 250), 5));
		lblBookReturn1.setBounds(34, 190, 10, 32);
		add(lblBookReturn1);
		
		lblBookReturnBorder = new JLabel("");
		lblBookReturnBorder.setEnabled(false);
		lblBookReturnBorder.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblBookReturnBorder.setBounds(48, 218, 81, 3);
		add(lblBookReturnBorder);
		
		lblUserinfo = new JLabel("개인 정보");
		lblUserinfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClick(3);
			}
		});
		lblUserinfo.setForeground(Color.GRAY);
		lblUserinfo.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 14));
		lblUserinfo.setBackground(Color.WHITE);
		lblUserinfo.setBounds(48, 245, 81, 44);
		add(lblUserinfo);
		
		JLabel lblUserinfo1 = new JLabel("");
		lblUserinfo1.setBorder(new LineBorder(new Color(230, 230, 250), 5));
		lblUserinfo1.setBounds(34, 250, 10, 32);
		add(lblUserinfo1);
		
		lblUserinfoBorder = new JLabel("");
		lblUserinfoBorder.setEnabled(false);
		lblUserinfoBorder.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblUserinfoBorder.setBounds(48, 278, 81, 3);
		add(lblUserinfoBorder);
		
		lblChart = new JLabel("현황 보기");
		lblChart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClick(4);
			}
		});
		lblChart.setForeground(Color.GRAY);
		lblChart.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 14));
		lblChart.setBackground(Color.WHITE);
		lblChart.setBounds(48, 299, 81, 44);
		add(lblChart);
		
		JLabel lblChart1 = new JLabel("");
		lblChart1.setBorder(new LineBorder(new Color(230, 230, 250), 5));
		lblChart1.setBounds(34, 304, 10, 32);
		add(lblChart1);
		
		lblChartBorder = new JLabel("");
		lblChartBorder.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblChartBorder.setBounds(48, 332, 81, 3);
		add(lblChartBorder);
		
		JLabel menuBarBgIcon = new JLabel("");
		menuBarBgIcon.setIcon(new ImageIcon("C:\\Users\\DGIT3-7\\Desktop\\menubarBG.PNG"));
		menuBarBgIcon.setBounds(0, 0, 187, 853);
		add(menuBarBgIcon);
		lblBookReturnBorder.setVisible(false);
		lblUserinfoBorder.setVisible(false);
		lblChartBorder.setVisible(false);
	}
	private void mouseClick(int i) {
		switch (i) {
		case 1:
			selectItem(lblBookRental);
			break;
		case 2:
			selectItem(lblBookReturn);
			break;
		case 3:
			selectItem(lblUserinfo);
			break;
		case 4:
			selectItem(lblChart);
			break;
		}
	}
	
	private void selectItem(JLabel j) {
		lblBookRentalBorder.setVisible(false);
		lblBookReturnBorder.setVisible(false);
		lblUserinfoBorder.setVisible(false);
		lblChartBorder.setVisible(false);
		lblBookRental.setForeground(Color.GRAY);
		lblBookReturn.setForeground(Color.GRAY);
		lblUserinfo.setForeground(Color.GRAY);
		lblChart.setForeground(Color.GRAY);
		
		if(j.getText().equals("도서 대여")) {
			lblBookRentalBorder.setVisible(true);
			lblBookReturnBorder.setVisible(false);
			lblUserinfoBorder.setVisible(false);
			lblChartBorder.setVisible(false);
			lblBookRental.setForeground(Color.BLACK);
			lblBookReturn.setForeground(Color.GRAY);
			lblUserinfo.setForeground(Color.GRAY);
			lblChart.setForeground(Color.GRAY);
		}else if(j.getText().equals("도서 반납")) {
			lblBookRentalBorder.setVisible(false);
			lblBookReturnBorder.setVisible(true);
			lblUserinfoBorder.setVisible(false);
			lblChartBorder.setVisible(false);
			lblBookRental.setForeground(Color.GRAY);
			lblBookReturn.setForeground(Color.BLACK);
			lblUserinfo.setForeground(Color.GRAY);
			lblChart.setForeground(Color.GRAY);
		}else if(j.getText().equals("개인 정보")) {
			lblBookRentalBorder.setVisible(false);
			lblBookReturnBorder.setVisible(false);
			lblUserinfoBorder.setVisible(true);
			lblChartBorder.setVisible(false);
			lblBookRental.setForeground(Color.GRAY);
			lblBookReturn.setForeground(Color.GRAY);
			lblUserinfo.setForeground(Color.BLACK);
			lblChart.setForeground(Color.GRAY);
		}else if(j.getText().equals("현황 보기")) {
			lblBookRentalBorder.setVisible(false);
			lblBookReturnBorder.setVisible(false);
			lblUserinfoBorder.setVisible(false);
			lblChartBorder.setVisible(true);
			lblBookRental.setForeground(Color.GRAY);
			lblBookReturn.setForeground(Color.GRAY);
			lblUserinfo.setForeground(Color.GRAY);
			lblChart.setForeground(Color.BLACK);
		}
		
		
		
	}
}
