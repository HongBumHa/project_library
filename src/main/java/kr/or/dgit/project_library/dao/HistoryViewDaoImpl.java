package kr.or.dgit.project_library.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.project_library.dto.HistoryView;
import kr.or.dgit.project_library.dto.Users;

public class HistoryViewDaoImpl implements HistoryViewDao {

	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(HistoryViewDao.class);
	private String namespace = "kr.or.dgit.library_project.dao.HistoryViewDao";

	public HistoryViewDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<HistoryView> selectAllHistoryView() {
		log.debug("selectAllHistoryView()");
		return sqlSession.getMapper(HistoryViewDao.class).selectAllHistoryView();
	}

	@Override
	public List<HistoryView> selectByWhereHistoryView(HistoryView historyView) {
		log.debug("selectAllHistoryView()");
		return sqlSession.getMapper(HistoryViewDao.class).selectByWhereHistoryView(historyView);
	}

	@Override
	public List<HistoryView> selectByUserHistory(HistoryView users) {
		log.debug("selectByUserHistory()");
		return sqlSession.getMapper(HistoryViewDao.class).selectByUserHistory(users);
	}

	@Override
	public List<HistoryView> selectAllHistoryViewMap() {
		log.debug("selectAllHistoryViewMap()");
		return sqlSession.selectList(namespace + ".selectAllHistoryViewMap");
	}

	@Override
	public List<HistoryView> selectByWhereHistoryViewMap(Map<String, Object> map) {
		log.debug("selectWhereHistoryViewMap()");
		return sqlSession.selectList(namespace + ".selectByWhereHistoryViewMap", map);
	}

	@Override
	public HistoryView selectByUserReturnCount(Users user) {
		log.debug("selectByUserReturnCount()");
		return sqlSession.selectOne(namespace +".selectByUserReturnCount",user);
	}
}
