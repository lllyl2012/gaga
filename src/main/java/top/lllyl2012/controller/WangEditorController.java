package top.lllyl2012.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
