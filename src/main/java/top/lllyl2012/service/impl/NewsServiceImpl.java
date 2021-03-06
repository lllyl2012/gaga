package top.lllyl2012.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.lllyl2012.bean.News;
import top.lllyl2012.bean.mapper.NewsMapper;
import top.lllyl2012.service.NewsService;
@Service
public class NewsServiceImpl implements NewsService{

	@Autowired
	private NewsMapper newsMapper;
	
	@Override
	public News selectById(int id) {
		News news = newsMapper.selectByPrimaryKey(id);
		return news;
	}

}
