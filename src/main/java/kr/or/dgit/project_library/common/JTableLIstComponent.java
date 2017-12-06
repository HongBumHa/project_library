package kr.or.dgit.project_library.common;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import kr.or.dgit.project_library.dto.Book;
import kr.or.dgit.project_library.service.BookService;

public class JTableLIstComponent extends JPanel {
	private JTable table;
	
	public JTableLIstComponent() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
	public void loadData() {
		DefaultTableModel model = new DefaultTableModel(getData(),getColumnNames());
		table.setModel(model);		
	}
	private String[] getColumnNames() {

		return new String[] { "도서코드", "도서명", "저자", "출판사", "가격", "수량", "대여횟수" };
	}
	private Object[][] getData() {
		List<Book> lists = BookService.getInstance().selectBookByAll();

		Object[][] data = new Object[lists.size()][];
		for (int i = 0; i < lists.size(); i++) {
			data[i] = lists.get(i).toArray();
		}
		return data;
	}

}
