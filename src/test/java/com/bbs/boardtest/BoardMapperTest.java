package com.bbs.boardtest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbs.mapper.BoardMapper;
import com.bbs.model.BoardDTO;
import com.bbs.page.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	@Autowired
	private BoardMapper boardMapper;
	
//	@Test
	public void boardInsertTest() {
				
		for(int i=1; i<=1000; i++) {
			BoardDTO dto = new BoardDTO();
			dto.setBtitle(i+"번 제목입니다.");
			dto.setBcontent(i+"번 내용입니다.");
			dto.setBwriter(i+"번 작성자입니다.");
			
			boardMapper.insert(dto);
		}
	}
	
//	@Test
	public void boardListAllTest() {
		List<BoardDTO> list = boardMapper.list_all();
		
		for(BoardDTO i : list) {
			System.out.println(i);
		}	
	}
	

	
	@Test
	public void deleteTest() {
		
		boardMapper.delete(1007L);
		
	}
	
//	@Test
	public void boardContentTest() {
		
		BoardDTO dto = boardMapper.boardContent(1007L);
		System.out.println(dto);
	}
	
//	@Test
	public void boardUpdateTest() {
		
		BoardDTO dto = new BoardDTO();
		dto.setBno(1007L);
		dto.setBtitle("수정된 제목입니다.");
		dto.setBcontent("수정된 내용입니다.");
		
		boardMapper.update(dto);
	}
	
//	@Test
	public void pagingTest() {
		Criteria cri = new Criteria();
		cri.setPageNum(10);
		cri.setAmount(20);
		List<BoardDTO> list = boardMapper.getListPaging(cri);
		list.forEach(i -> System.out.println(i));
	}
	
	
}
