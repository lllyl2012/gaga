package top.lllyl2012.controller;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import top.lllyl2012.bean.Animation;
import top.lllyl2012.bean.other.ResponseResult;
import top.lllyl2012.service.AnimationService;
import top.lllyl2012.service.EditMovieService;
import top.lllyl2012.util.PropsUtil;
@Controller
public class AdminController {
	@Autowired
	private EditMovieService editMovieService;
	
	@Autowired
	private AnimationService animationService;
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
	@RequestMapping(value="uploadImages.do", method=RequestMethod.POST,produces = "text/json;charset=UTF-8") 
	@ResponseBody 
	public ResponseResult<String[]> uploadImages( @RequestParam("images") MultipartFile[] images, HttpServletRequest request) throws IOException { 
		ResponseResult<String[]> responseResult = new ResponseResult<>();
		String[] imagePath = new String[images.length];
		Properties properties = PropsUtil.loadProps("my.properties");
		//保存到文件系统 
		String path=properties.getProperty("upload");
		//WEB路径 
//		path = request.getServletContext().getRealPath(path); System.out.println(path); 
		//创建upload文件夹 
		File dir = new File(path);  
		File file = null;
		int i = 0;
		for (MultipartFile image : images) {
			file=new File(dir, image.getOriginalFilename());
			System.out.println("save:"+file); //将上载文件保存到文件中 
			image.transferTo(file); 
			imagePath[i++] = file.toString();
		}
		responseResult.setData(imagePath);
		return responseResult;
	}
	
	
	/**
	 * 处理编辑请求
	 * @return
	 */
	@RequestMapping(value="/addMovieHandle.do",method=RequestMethod.POST,produces = "text/json;charset=UTF-8")
	@ResponseBody
	public String addMovieHandle(Model model,Animation animation,String[] imagePath,String[] performerName) {
		animationService.insert(animation,imagePath,performerName);
		return "ok";
	}
}
