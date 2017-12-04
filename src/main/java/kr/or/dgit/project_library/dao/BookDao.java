package kr.or.dgit.project_library.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.project_library.dto.Book;

public interface BookDao {
	List<Book> selectBookByAll();
	List<Book> selectBookBySomething(Map<String, Object> map);
	Book selectBookByCode(Book book);
	Book selectBookForChart(Book book);
	Book selectBookGroupRow(Book book);
	int insertBook(Book Book);
	int updateBook(Book book);
	int deleteBook(Book book);
	
	List<Book> selectByRank();
	
	List<Book> selectByWhereBookData(Book book);
	List<Book> selectByBigMiddleGroupCode(Book book);
}
