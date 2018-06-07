package top.lllyl2012.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import top.lllyl2012.bean.Animation;
import top.lllyl2012.bean.IndexLunbo;
import top.lllyl2012.bean.IndexNews;
import top.lllyl2012.bean.IndexRank;
import top.lllyl2012.bean.News;
import top.lllyl2012.service.AnimationService;
import top.lllyl2012.service.IndexLunboService;
import top.lllyl2012.service.IndexNewsService;
import top.lllyl2012.service.IndexRankService;

@Controller
public class TopController {
	
	@Autowired
	private AnimationService animationService;
	
	@Autowired
	private IndexRankService indexRankService;
	
	@Autowired
	private IndexNewsService indexNewsService;
	
	@Autowired
	private IndexLunboService indexLunboService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String animate(Model model) {
		List<Animation> animations = animationService.selectAll();
		List<IndexRank> indexRanks =  indexRankService.selectAll();
		List<IndexNews> indexNews = indexNewsService.selectAll();
		List<IndexLunbo> indexLunbos = indexLunboService.selectAll();
		model.addAttribute("animations",animations);
		model.addAttribute("indexRanks",indexRanks);
		model.addAttribute("indexNews",indexNews);
		model.addAttribute("indexLunbos",indexLunbos);
		return "page/animateBody";
	}
}
