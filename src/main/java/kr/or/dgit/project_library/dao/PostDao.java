package kr.or.dgit.project_library.dao;

import java.util.List;

import kr.or.dgit.project_library.dto.Post;

public interface PostDao {
	List<Post> selectByDoroList(Post post);
	List<Post> selectBysidoList();
}
