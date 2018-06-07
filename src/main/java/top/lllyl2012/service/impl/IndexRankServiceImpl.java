package top.lllyl2012.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.lllyl2012.bean.Animation;
import top.lllyl2012.bean.IndexRank;
import top.lllyl2012.bean.IndexRankExample;
import top.lllyl2012.bean.mapper.IndexRankMapper;
import top.lllyl2012.service.AnimationService;
import top.lllyl2012.service.IndexRankService;

@Service
public class IndexRankServiceImpl implements IndexRankService{
	
	@Autowired
	private IndexRankMapper indexRankMapper;
	
	@Autowired
	private AnimationService animationService; 
	
	@Override
	public List<IndexRank> selectAll() {
		IndexRankExample example = new IndexRankExample();
		List<IndexRank> indexRanks = indexRankMapper.selectByExample(example);
		for (IndexRank indexRank : indexRanks) {
			Animation animation = animationService.selectById(indexRank.getAnimationId());
			indexRank.setAnimation(animation);
		}
		return indexRanks;
	}
}
