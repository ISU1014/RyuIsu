package com.isu.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.isu.board.mapper.BoardMapper;
import com.isu.board.vo.BoardVO;
import com.webjjang.util.page.PageObject;

import lombok.Data;

@Service
@Qualifier("boardServiceImpl")
@Data
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;

	@Override
	public List<BoardVO> list(PageObject pageObject) {
		System.out.println("BoardService.list()");
		return mapper.list(pageObject);
	}

	@Override
	public Integer write(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.write(vo);
	}

	@Override
	public BoardVO view(Long no,int inc) {
		if(inc==1) mapper.increase(no);
		return mapper.view(no);
	}

	@Override
	public Integer update(BoardVO vo) {
		return mapper.update(vo);
	}

	@Override
	public Integer delete(BoardVO vo) {
		return mapper.delete(vo);
	}

	

}
