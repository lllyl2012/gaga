package top.lllyl2012.controller;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import top.lllyl2012.bean.other.ResponseResult;
import top.lllyl2012.bean.other.ResultWang;
import top.lllyl2012.util.PropsUtil;

@Controller
@RequestMapping("/wangEditor")
public class WangEditorController {
	/**
	 * 编辑页面
	 */
	@RequestMapping("/editPage")
	public String editPage() {
		return "page/editPage";
	}
	
	@RequestMapping("/upload")
	@ResponseBody
	public ResultWang upload( @RequestParam("images") MultipartFile[] images, HttpServletRequest request) throws IllegalStateException, IOException {
		ResultWang resultWang = new ResultWang();
		String[] imagePath = new String[images.length];
		Properties properties = PropsUtil.loadProps("my.properties");
		//保存到文件系统 
		String path=properties.getProperty("upload");
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
		resultWang.setData(imagePath);
		return resultWang;
	}
}
