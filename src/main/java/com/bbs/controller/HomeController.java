package com.bbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bbs.model.BoardDTO;
import com.bbs.model.UserDTO;
import com.bbs.page.Criteria;
import com.bbs.page.ViewPage;
import com.bbs.service.BoardService;
import com.bbs.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		
		return "home";
	}
	
	@GetMapping("/register")
	public String goRegister() {
		
		return "register";
	}
	
	@PostMapping("/register")
	public String register(BoardDTO dto) {
		
		boardService.insert(dto);
		
		return "redirect:/";
	}
	
//	@GetMapping("/boardList")
//	public String boardList(Model model) {
//		
//		List<BoardDTO> boardList = boardService.list_all();
//		model.addAttribute("boardList", boardList);
//		
//		return "boardList";
//	}
	
	@GetMapping("/boardList")
	public String boardList(Model model, Criteria cri) {
		
		List<BoardDTO> boardList = boardService.getListPaging(cri);
		model.addAttribute("boardList", boardList);
		
		int total = boardService.getTotal();
		ViewPage vp = new ViewPage(cri, total);
		model.addAttribute("pageMaker", vp);
		
		return "boardList";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("bno")String ubno) {
		
		Long bno = Long.parseLong(ubno);
		boardService.delete(bno);
		
		return "redirect:/boardList";
	}
	
	
	@GetMapping("/boardContent")
	public String boardContent(Model model, @RequestParam("bno")String ubno) {
		
		Long bno = Long.parseLong(ubno);
		BoardDTO dto = boardService.boardContent(bno);
		model.addAttribute("dto", dto);
		
		return "boardContent";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(Model model, @RequestParam("bno")String ubno) {
		
		Long bno = Long.parseLong(ubno);
		BoardDTO dto = boardService.boardContent(bno);
		model.addAttribute("dto", dto);
		
		return "updateForm";
	}
	
	@PostMapping("/update")
	public String update(BoardDTO dto) {
			
		boardService.update(dto);
		
		return "redirect:/boardContent?bno="+dto.getBno();
	}
	
	@GetMapping("/userList")
	public String userList(Model model) {
		
		List<UserDTO> userList = userService.userList();
		model.addAttribute("userList", userList);
		
		return "userList";
	}
	
	@GetMapping("/userInfo")
	public String userInfo(Model model, @RequestParam("uno")String uuno) {
		
		Long uno = Long.parseLong(uuno);
		UserDTO userInfo = userService.userInfo(uno);
		model.addAttribute("userInfo", userInfo);
		
		return "userInfo";
	}
	
	@GetMapping("/insertUserForm")
	public String insertUserForm() {
		
		return "insertUserForm";
	}
	
	@PostMapping("/insertUser")
	public String insertUser(UserDTO dto) {
		
		userService.insert(dto);
		
		return "redirect:/userList";
	}
	
	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("uno")String uuno) {
		
		Long uno = Long.parseLong(uuno);
		userService.delete(uno);
		
		return "redirect:/userList";
	}
	
	@GetMapping("/updateUserForm")
	public String updateUserForm(@RequestParam("uno")String uuno, Model model) {
		
		Long uno = Long.parseLong(uuno);
		UserDTO userInfo = userService.userInfo(uno);
		model.addAttribute("userInfo", userInfo);
		
		return "updateUserForm";
	}
	
	@PostMapping("/updateUser")
	public String update(UserDTO dto) {
		
		userService.update(dto);
		
		return "redirect:/userInfo?uno="+dto.getUno();
	}
	
	
	
	
}
