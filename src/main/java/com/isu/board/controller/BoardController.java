package com.isu.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.isu.board.service.BoardService;
import com.isu.board.vo.BoardVO;
import com.webjjang.util.page.PageObject;

import lombok.Data;
import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/board")
@Data
public class BoardController {
	
	@Autowired
	@Qualifier("boardServiceImpl")
	private BoardService service;
	
	
	@GetMapping("/list.do")
	public String list(Model model, PageObject pageObject) {
		System.out.println("BoardController.list(pageObject)");
		System.out.println("service.list()");
		model.addAttribute("list",service.list(pageObject));
		System.out.println(model);
		return "board/list";
	}
	
	@GetMapping("/view.do")
	public String view(Long no, int inc, Model model) {
		System.out.println("BoardController.view().no / inc=");
		System.out.println(no+"/"+inc);
		model.addAttribute("vo", service.view(no, inc));
		return "board/view";
	}
	
	@GetMapping("/write.do")
	public String writeForm() {
		System.out.println("BoardController.wirteForm()");
		return "board/write";
	}
	
	@PostMapping("/write.do")
	public String write(BoardVO vo) {
		System.out.println("BoardController.wirte().vo");
		System.out.println(vo);
		service.write(vo);
		return "redirect:list.do";
	}
	
	@GetMapping("/update.do")
	public String updateForm(Long no, Model model) {
		System.out.println("BoardController.updateForm()");
		model.addAttribute("vo", service.view(no, 0));
		return "board/update";
	}
	
	@PostMapping("/update.do")
	public String update(BoardVO vo) {
		System.out.println("BoardController.update().vo");
		System.out.println(vo);
		service.update(vo);
		return "redirect:view.do?no="+vo.getNo()+"&inc=0";
	}
	
	@PostMapping("/delete.do")
	public String delete(BoardVO vo) {
		System.out.println("BoardController.delete().vo");
		System.out.println(vo);
		service.delete(vo);
		return "redirect:list.do";
	}
	
}
