package top.lllyl2012.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.jdbc.Driver;

import top.lllyl2012.service.impl.EditMovieServiceImpl;
@Controller
public class AdminController {
	@Resource
	private EditMovieServiceImpl editMovieService;
	
	@RequestMapping("/editMovie")
	public String editMovie(Model model) {
		model.addAttribute("countries",editMovieService.getCountryList());
		model.addAttribute("languages" , editMovieService.getLanguageList());
		model.addAttribute("formats",editMovieService.getFormatList());
		model.addAttribute("resolutionRatios" , editMovieService.getResolutionRatioList());
		return "page/editMovie";
	}
}
