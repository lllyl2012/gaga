package top.lllyl2012.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.lllyl2012.bean.IndexNews;
import top.lllyl2012.bean.IndexNewsExample;
import top.lllyl2012.bean.News;
import top.lllyl2012.bean.mapper.IndexNewsMapper;
import top.lllyl2012.service.IndexNewsService;
import top.lllyl2012.service.NewsService;

@Service
public class IndexNewsServiceImpl implements IndexNewsService{
	
	@Autowired
	private IndexNewsMapper indexNewsMapper;
	
	@Autowired
	private NewsService newsService;
	
	@Override
	public List<IndexNews> selectAll() {
		IndexNewsExample example = new IndexNewsExample();
		List<IndexNews> indexNews = indexNewsMapper.selectByExample(example); 
		for (IndexNews indexNews2 : indexNews) {
			News news = newsService.selectById(indexNews2.getNewsId());
			indexNews2.setNews(news);
		}
		return indexNews;
	}
}
