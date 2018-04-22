package top.lllyl2012.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {
	@RequestMapping("/index")
	public String index() {
		return "view";
	}
	
	@RequestMapping("/")
	public String animate() {
		return "page/animateBody";
	}
}
