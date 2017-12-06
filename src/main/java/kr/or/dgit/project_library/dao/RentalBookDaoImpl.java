package kr.or.dgit.project_library.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.project_library.dto.RentalBook;
import kr.or.dgit.project_library.dto.Users;

public class RentalBookDaoImpl implements RentalBookDao {

	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(RentalBookDao.class);
	private String namespace = "kr.or.dgit.project_library.dao.RentalBookDao";

	public RentalBookDaoImpl() {
	}

	public RentalBookDaoImpl(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public static Log getLog() {
		return log;
	}

	@Override
	public List<RentalBook> selectRentalBookByCode(RentalBook rentalBook) {
		log.debug("selectRentalBookByCode()");
		return sqlSession.selectList(namespace+".selectRentalBookByCode", rentalBook);
	}
	
	@Override
	public int insertData(RentalBook rentalBook) {
		log.debug("insertData()");
		return sqlSession.insert(namespace + ".insertData", rentalBook);
	}

	@Override
	public int deleteByWhereRentalBook(RentalBook rentalBook) {
		log.debug("deleteByWhereRentalBook()");
		return sqlSession.insert(namespace + ".deleteByWhereRentalBook", rentalBook);
	}

	@Override
	public RentalBook selectByUserRentalCount(Users user) {
		log.debug("selectByUserRentalCount()");
		return sqlSession.selectOne(namespace + ".selectByUserRentalCount", user);
	}


	

}
