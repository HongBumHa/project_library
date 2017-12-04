package kr.or.dgit.project_library.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.project_library.dao.PublisherDao;
import kr.or.dgit.project_library.dao.PublisherDaoImpl;
import kr.or.dgit.project_library.dto.Publisher;
import kr.or.dgit.project_library.utill.MyBatisSqlSessionFactory;

public class PublisherService{

	private static final PublisherService instance = new PublisherService();
	
	public static PublisherService getInstance() {
		return instance;
	}
	
	public PublisherService() {
		super();
	}

	public List<Publisher> selectPublisherByAll() {
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			PublisherDao dao=new PublisherDaoImpl(sqlSession);
			return dao.selectPublisherByAll();
		}
	}
	
	public Publisher selectPublisherByCodeName(Publisher publisher) {
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			PublisherDao dao=new PublisherDaoImpl(sqlSession);
			return dao.selectPublisherByCodeName(publisher);
		}
	}
	
	public int insertPublisher(Publisher publisher) {
		int res=-1;
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			PublisherDao dao=new PublisherDaoImpl(sqlSession);
			res=dao.insertPublisher(publisher);
			sqlSession.commit();
		}
		return res;
	}
	
	public int updatePublisher(Publisher publisher) {
		SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			PublisherDao dao=new PublisherDaoImpl(sqlSession);
			int res=dao.updatePublisher(publisher);
			sqlSession.commit();
			return res;
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
	}
	
	public int deletePublisher(Publisher publisher) {
		SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			PublisherDao dao=new PublisherDaoImpl(sqlSession);
			int res= dao.deletePublisher(publisher);
			sqlSession.commit();
			return res;
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
	}
	
}
