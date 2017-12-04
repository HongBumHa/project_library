package kr.or.dgit.project_library.dao;

import java.util.List;

import kr.or.dgit.project_library.dto.Publisher;

public interface PublisherDao {
	List<Publisher> selectPublisherByAll();
	Publisher selectPublisherByCodeName(Publisher publisher);
	int insertPublisher(Publisher publisher);
	int updatePublisher(Publisher publisher);
	int deletePublisher(Publisher publisher);
	
}
