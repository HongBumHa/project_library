package kr.or.dgit.project_library.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.project_library.dto.Book;
import kr.or.dgit.project_library.dto.RentalView;

public interface RentalViewDao {
	public List<RentalView> selectAllRentalView();
//	public Vector<RentalView> selectByWhereRentalView(RentalView rentalview);
	public List<RentalView> selectByWhereRentalView(RentalView rentalview);
	
	public List<RentalView> selectAllRentalViewMap();
	
	public List<RentalView> selectByWhereRentalViewMap(Map<String, Object> map);
	
	public RentalView selectByBookDataRentalView(Book book);
}
