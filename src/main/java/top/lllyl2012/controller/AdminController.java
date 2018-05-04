package top.lllyl2012.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.mysql.jdbc.Driver;

import top.lllyl2012.service.impl.EditMovieServiceImpl;
@Controller
public class AdminController {
	@Resource
	private EditMovieServiceImpl editMovieService;
	/**
	 * 电影编辑/增加页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/editMovie")
	public String editMovie(Model model) {
		model.addAttribute("countries",editMovieService.getCountryList());
		model.addAttribute("languages" , editMovieService.getLanguageList());
		model.addAttribute("formats",editMovieService.getFormatList());
		model.addAttribute("resolutionRatios" , editMovieService.getResolutionRatioList());
		return "page/editMovie";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	/**
	 * 电影编辑/增加逻辑
	 */
	@RequestMapping("/edit")
	@ResponseBody
	public String edit() {
		
		return "";
	}

	@RequestMapping(value="uploadImage.do")
	@ResponseBody 
	public String uploadImage() {
		return "{gaag}";
	}
	/** * 处理上载请求, 保存多个文件 */ 
	@RequestMapping(value="uploadImages.do", method=RequestMethod.POST) 
	@ResponseBody 
	public String uploadImages( @RequestParam("images") MultipartFile[] images, HttpServletRequest request) throws IOException { 
		//保存到文件系统 
		String path="d:\\gaga";
		//WEB路径 
//		path = request.getServletContext().getRealPath(path); System.out.println(path); 
		//创建upload文件夹 
		File dir = new File(path);  
		for (MultipartFile image : images) {
			File file=new File(dir, image.getOriginalFilename());
			System.out.println("save:"+file); //将上载文件保存到文件中 
			image.transferTo(file); 
		}
		return "上载成功";
	}
}
