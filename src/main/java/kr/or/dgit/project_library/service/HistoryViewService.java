package kr.or.dgit.project_library.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.project_library.dao.HistoryViewDao;
import kr.or.dgit.project_library.dao.HistoryViewDaoImpl;
import kr.or.dgit.project_library.dto.HistoryView;
import kr.or.dgit.project_library.dto.Users;
import kr.or.dgit.project_library.utill.MyBatisSqlSessionFactory;

public class HistoryViewService {
	private static final HistoryViewService instance= new HistoryViewService();
	private HistoryViewService() {}
	
	public static HistoryViewService getInstance() {
		return instance;
	}
	   public List<HistoryView> findAllHistoryViewData(){
	      try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
	         HistoryViewDao dao = new HistoryViewDaoImpl(sqlSession);
	         return dao.selectAllHistoryView();
	      }
	   }
	   
	   public List<HistoryView> findWhereHistoryViewData(HistoryView historyView){
	      try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
	         HistoryViewDao dao = new HistoryViewDaoImpl(sqlSession);
	         return dao.selectByWhereHistoryView(historyView);
	      }
	   }
	   
	   public List<HistoryView> findUserHistoryVide(HistoryView users){
	      try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
	         HistoryViewDao dao = new HistoryViewDaoImpl(sqlSession);
	         return dao.selectByUserHistory(users);
	      }
	   }
	   
	   public List<HistoryView> findAllHistoryViewDataMap(){
		   try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
		         HistoryViewDao dao = new HistoryViewDaoImpl(sqlSession);
		         return dao.selectAllHistoryViewMap();
		      }
	   }
	   
	   public List<HistoryView> findWhereHistoryViewMap(Map<String, Object> map){
		   try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
				HistoryViewDao dao=new HistoryViewDaoImpl(sqlSession);
				return dao.selectByWhereHistoryViewMap(map);
			}
	   }
	   
	   public HistoryView findUserReturnCount(Users user){
		   try(SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
				HistoryViewDao dao=new HistoryViewDaoImpl(sqlSession);
				return dao.selectByUserReturnCount(user);
			}
	   }
}
