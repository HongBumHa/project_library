package kr.or.dgit.project_library.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.project_library.dto.Users;

public class UsersDaoImpl implements UsersDao{
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(UsersDaoImpl.class);
	
	
	public UsersDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}


	@Override
	public List<Users> selectUserByAll() {
		log.debug("selectUserByAll()");
		return sqlSession.getMapper(UsersDao.class).selectUserByAll();
	}


	@Override
	public int insertUser(Users users) {
		log.debug("insertUser()");
		return sqlSession.getMapper(UsersDao.class).insertUser(users);
	}


	@Override
	public int deleteUsers(String id) {
		log.debug("deleteSql()");
		return sqlSession.getMapper(UsersDao.class).deleteUsers(id);
	}


	@Override
	public Users selectUsersByNo(Users users) {
		log.debug("selectUsersByNo()");
		return sqlSession.getMapper(UsersDao.class).selectUsersByNo(users);
	}


	@Override
	public int updateUser(Users users) {
		log.debug("updateUser()");
		return sqlSession.getMapper(UsersDao.class).updateUser(users);
	}


	@Override
	public List<Users> selectByUserList(Map<String,Object> map) {
		log.debug("selectByUserList()");
		return sqlSession.getMapper(UsersDao.class).selectByUserList(map);
	}


}
