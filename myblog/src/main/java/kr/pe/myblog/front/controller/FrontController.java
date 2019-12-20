package kr.pe.myblog.front.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.MemberVO;
import com.example.service.MemberService;

import kr.pe.myblog.front.dto.FrontinfoVO;
import kr.pe.myblog.front.service.FrontinfoService;
import kr.pe.myblog.team.dto.TeaminfoVO;
import kr.pe.myblog.team.service.TeaminfoService;

// Controller 추가 : Controller 클래스 생성 후 servlet-context.xml의
// <context:component-scan base-package="kr.pe.myblog.front.controller" /> 추가 필요
// @Controller 어노테이션 추가 필요. 	

//// git 확인용 수정  

@Controller
public class FrontController {
	
	private static final Logger logger = LoggerFactory.getLogger(FrontController.class);
	
	@Inject
	private MemberService service;
	// Service 추가
	@Inject
	private FrontinfoService frontService;
	
	@Inject
	private TeaminfoService teamService;
	
	@RequestMapping(value = "/index2.do")
	public String front(Locale locale, Model model) throws Exception{

		logger.info("/index2.do");

		List<FrontinfoVO> 	frontList 	= 	frontService.selectFrontinfo();
		model.addAttribute("frontList", frontList);
		
		List<TeaminfoVO>	teamList	=	teamService.selectTeaminfo();
		model.addAttribute("teamList", teamList);

		return "front";
	}
	
	
	
	
	@RequestMapping(value = "/home.do")
	public String home(Locale locale, Model model) throws Exception{

		logger.info("/home.do");

		List<FrontinfoVO> 	frontList 	= 	frontService.selectFrontinfo();
		model.addAttribute("frontList", frontList);
		
		List<TeaminfoVO>	teamList	=	teamService.selectTeaminfo();
		model.addAttribute("teamList", teamList);

		return "home";
	}
	
	

}
