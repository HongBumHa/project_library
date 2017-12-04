package kr.or.dgit.project_library.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.project_library.dto.Users;

public interface UsersDao {
	List<Users> selectUserByAll();
	int insertUser(Users users);
	int deleteUsers(String id);
	Users selectUsersByNo(Users users); 
	int updateUser(Users users);
	
	List<Users> selectByUserList(Map<String,Object> map);
}
