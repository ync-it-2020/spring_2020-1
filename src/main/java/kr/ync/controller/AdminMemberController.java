package kr.ync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.ync.domain.Criteria;
import kr.ync.domain.PageDTO;
import kr.ync.service.AdminMemberService;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/admin/member/*")
public class AdminMemberController {
	
	@Autowired
	AdminMemberService service;
	
	@GetMapping("list")
	public String list(Criteria cri,Model model) {
		
		model.addAttribute("member", service.ListWithPaging(cri));
		int total=service.getTotalCount();
		model.addAttribute("pageMaker", new PageDTO(cri, total));
		return "admin/member_manage";
	}
	@PostMapping("del")
	public String del(@RequestParam("userid") String id,RedirectAttributes rttr,Criteria cri) {
		System.out.println(id);
		int result=service.delete(id);
		if(result>0) {
			rttr.addFlashAttribute("del_result", "success");
		}else {
			rttr.addFlashAttribute("del_result", "fail");
		}
		return "redirect:/admin/member/list"+cri.getListLink();
	}
	
}
