package com.isu.board.mapper;

import java.util.List;

import com.isu.board.vo.BoardVO;
import com.webjjang.util.page.PageObject;


public interface BoardMapper {
	
	public List<BoardVO> list(PageObject pageObject);
	
	public Integer write(BoardVO vo);
	
	public BoardVO view(Long no);
	
	public Integer increase(Long no);
	
	public Integer update(BoardVO vo);

	public Integer delete(BoardVO vo);

}
