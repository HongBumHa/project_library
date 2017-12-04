package kr.or.dgit.project_library.dao;

import java.util.List;

import kr.or.dgit.project_library.dto.RentalBook;
import kr.or.dgit.project_library.dto.Users;

public interface RentalBookDao {
	public List<RentalBook> selectRentalBookByCode(RentalBook rentalBook);
	public int insertData(RentalBook rentalBook);
	public int deleteByWhereRentalBook(RentalBook rentalBook);
	
	RentalBook selectByUserRentalCount(Users user);
}
