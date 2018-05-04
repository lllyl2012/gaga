package top.lllyl2012.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TopController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String animate() {
		return "page/animateBody";
	}
}
