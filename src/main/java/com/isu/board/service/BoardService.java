package com.isu.board.service;

import java.util.List;

import com.isu.board.vo.BoardVO;
import com.webjjang.util.page.PageObject;


public interface BoardService {
	
	public List<BoardVO> list(PageObject pageObject);
	
	public Integer write(BoardVO vo);
	
	public BoardVO view(Long no,int inc);
	
	public Integer update(BoardVO vo);

	public Integer delete(BoardVO vo);
	
}
