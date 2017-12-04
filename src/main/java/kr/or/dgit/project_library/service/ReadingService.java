package kr.or.dgit.project_library.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.project_library.dao.ReadingDao;
import kr.or.dgit.project_library.dao.ReadingDaoImpl;
import kr.or.dgit.project_library.dto.Reading;
import kr.or.dgit.project_library.utill.MyBatisSqlSessionFactory;

public class ReadingService {
	private static final ReadingService instance = new ReadingService();

	public static ReadingService getInstance() {
		return instance;
	}

	private ReadingService() {}
	
	public List<Reading> findselectByAll(){
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			ReadingDao dao =new ReadingDaoImpl(sqlSession);
			return dao.selectByAll();
		}
	}
	
	public int findinsert(Reading reading){
		int res=-1;
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			ReadingDao dao =new ReadingDaoImpl(sqlSession);
			res = dao.insertReading(reading);
			sqlSession.commit();
		}
		System.out.println(res);
		return res;
	}
	
	public int deleteByName(Reading reading){
		int res=-1;
		try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			ReadingDao dao =new ReadingDaoImpl(sqlSession);
			res =  dao.deleteReading(reading);
			sqlSession.commit();
		}
		return res;
	}
}
