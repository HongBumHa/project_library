package kr.or.dgit.project_library.dao;

import java.util.List;

import kr.or.dgit.project_library.dto.Reading;

public interface ReadingDao {
	List<Reading> selectByAll();
	int insertReading(Reading book);
	int deleteReading(Reading book);
}
