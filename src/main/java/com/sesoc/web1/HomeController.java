package com.sesoc.web1;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";					// views폴더의 home.jsp로 포워딩
	}
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String home2() {
		return "testView";					// views폴더의 home2.jsp로 포워딩
	}
	
	@RequestMapping(value = "test2", method = RequestMethod.GET)
	public String home3(Model m) {			//Model 객체를 받음
		String str = "서버에서 가져온 문자열";
		int num = 9999;
		
		m.addAttribute("string", str);		//Model에 값을 저장
		m.addAttribute("number", num);
		
		return "test2";					// views폴더의 home2.jsp로 포워딩(이동)
	}
	
}
