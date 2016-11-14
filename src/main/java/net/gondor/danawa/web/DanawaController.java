package net.gondor.danawa.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.gondor.danawa.common.util.pager.ClassicPageExplorer;
import net.gondor.danawa.common.util.pager.PageExplorer;
import net.gondor.danawa.service.DanawaService;
import net.gondor.danawa.vo.DanawaListVO;
import net.gondor.danawa.vo.DanawaSearchVO;
import net.gondor.danawa.vo.DanawaVO;

@Controller
public class DanawaController {

	DanawaService danawaService;

	public void setDanawaService(DanawaService danawaService) {
		this.danawaService = danawaService;
	}

	@RequestMapping("/")
	public String viewIndexPage() {
		return "index";
	}
	
	@RequestMapping("/list")
	public ModelAndView viewListPage(DanawaSearchVO danawaSearchVO){
		DanawaListVO danawaList = danawaService.getAllDanawaList(danawaSearchVO);
		PageExplorer pageExplorer = new ClassicPageExplorer(danawaList.getPager());
		String page = pageExplorer.getPagingList("pageNumber", "[@]", "", "", "searchForm");
		
		ModelAndView view =new ModelAndView();
		view.addObject("danawaList", danawaList);
		view.addObject("page", page);
		view.setViewName("list");
		view.addObject("searchVO", danawaSearchVO);
		return view;
	}
	
	@RequestMapping("/write")
	public String viewWritePage(){
		return "write";
	}
	
	@RequestMapping("/doWrite")
	public ModelAndView doWriteAction(DanawaVO danawaVO){
		ModelAndView view = new ModelAndView();
		String content = danawaVO.getContent();
		content = content.replaceAll("<br/>", "\n");
		danawaVO.setContent(content);
		boolean isSuccess = danawaService.addDanawa(danawaVO);
		view.setViewName("redirect:/list");
		return view;
	}
	
	@RequestMapping("delete/{id}")
	public String doDeleteAction(@PathVariable String id){
		boolean isSuccess = danawaService.removeDanawaById(id);
		return "redirect:/list";
	}
	
	@RequestMapping("/detail/{id}")
	public ModelAndView viewDetailPage(@PathVariable String id){
		DanawaVO danawa = danawaService.getDanawaById(id);
		String content = danawa.getContent();
		content = content.replaceAll("\n", "<br/>");
		danawa.setContent(content);
		
		ModelAndView view = new ModelAndView();
		view.addObject("danawa", danawa);
		view.setViewName("detail");
		return view;
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView viewEditPage(@PathVariable String id){
		DanawaVO danawa = danawaService.getDanawaById(id);
		
		String content = danawa.getContent();
		content = content.replaceAll("<br/>", "\n");
		danawa.setContent(content);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("edite");
		view.addObject("danawa", danawa);
		return view;
	}
	
	@RequestMapping("/doEdit")
	public String doEditAction(DanawaVO danawaVO){
		boolean isSuccess = danawaService.editDanawa(danawaVO);
		return "redirect:/detail/"+danawaVO.getId();
	}
}