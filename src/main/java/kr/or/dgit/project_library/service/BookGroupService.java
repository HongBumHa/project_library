package kr.or.dgit.project_library.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.project_library.dao.BookGroupDao;
import kr.or.dgit.project_library.dao.BookGroupDaoImpl;
import kr.or.dgit.project_library.dto.BookGroup;
import kr.or.dgit.project_library.utill.MyBatisSqlSessionFactory;

public class BookGroupService {

	private static final BookGroupService instance = new BookGroupService();

	public static BookGroupService getInstance() {
		return instance;
	}

	public BookGroupService() {
		super();
	}

	public List<BookGroup> findAllBookBigGroup() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			BookGroupDao dao = new BookGroupDaoImpl(sqlSession);
			return dao.selectAllBookBigGroup();
		}
	}

	public List<BookGroup> findAllMiddleGroup(BookGroup bookGroup) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			System.out.println("sqlSession " + sqlSession);
			BookGroupDao dao = new BookGroupDaoImpl(sqlSession);
			return dao.selectAllMiddleGroup(bookGroup);
		}
	}

	public BookGroup findByNoBigGroup(BookGroup bookGroup) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			BookGroupDao dao = new BookGroupDaoImpl(sqlSession);
			return dao.selectByNoBigGroup(bookGroup);
		}
	}

	public BookGroup findByNoMiddleGroup(BookGroup bookGroup) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			BookGroupDao dao = new BookGroupDaoImpl(sqlSession);
			return dao.selectByNoMiddleGroup(bookGroup);
		}
	}
}
