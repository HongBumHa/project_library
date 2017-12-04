package kr.or.dgit.project_library.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.project_library.dao.RentalViewDao;
import kr.or.dgit.project_library.dao.RentalViewDaoImpl;
import kr.or.dgit.project_library.dto.Book;
import kr.or.dgit.project_library.dto.RentalView;
import kr.or.dgit.project_library.utill.MyBatisSqlSessionFactory;

public class RentalViewService {
	
private static final RentalViewService instance = new RentalViewService();
	
	public static RentalViewService getInstance() {
		return instance;
	}

	public RentalViewService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<RentalView> findAllRentalView(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			RentalViewDao dao = new RentalViewDaoImpl(sqlSession);
			return dao.selectAllRentalView();
		}
	}
	
	public List<RentalView> findByWhereRentalView(RentalView rentalView){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			RentalViewDao dao = new RentalViewDaoImpl(sqlSession);
			return dao.selectByWhereRentalView(rentalView);
		}
	}
	
	public List<RentalView> findAllRentalViewMap(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			RentalViewDao dao = new RentalViewDaoImpl(sqlSession);
			return dao.selectAllRentalViewMap();
		}
	}
	
	public List<RentalView> findByWhereRentalViewMap(Map<String, Object> map){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			RentalViewDao dao=new RentalViewDaoImpl(sqlSession);
			return dao.selectByWhereRentalViewMap(map);
		}
	}
	
	public RentalView findByBookDataRentalView(Book book){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			RentalViewDao dao=new RentalViewDaoImpl(sqlSession);
			return dao.selectByBookDataRentalView(book);
		}
	}
}
