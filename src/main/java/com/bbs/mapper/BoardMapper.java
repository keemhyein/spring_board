package com.bbs.mapper;

import java.util.List;

import com.bbs.model.BoardDTO;
import com.bbs.page.Criteria;

public interface BoardMapper {

	public void insert(BoardDTO dto);
	
	public List<BoardDTO> list_all();
	public List<BoardDTO> getListPaging(Criteria cri);
	public int getTotal();
	
	public void delete(Long bno);

	public BoardDTO boardContent(Long bno);

	public void update(BoardDTO dto);
	
}
