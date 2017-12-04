package kr.or.dgit.project_library.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.project_library.dto.HistoryView;
import kr.or.dgit.project_library.dto.Users;

public interface HistoryViewDao {
	public List<HistoryView> selectAllHistoryView();
	public List<HistoryView> selectByWhereHistoryView(HistoryView historyView);
	
//	유저 히스토리
	List<HistoryView> selectByUserHistory(HistoryView users);   

	// manager historyView
	public List<HistoryView> selectAllHistoryViewMap();
	public List<HistoryView> selectByWhereHistoryViewMap(Map<String, Object> map);
	  
	HistoryView selectByUserReturnCount(Users user);
}
