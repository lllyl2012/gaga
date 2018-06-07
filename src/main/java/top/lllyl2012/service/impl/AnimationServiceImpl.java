package top.lllyl2012.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.lllyl2012.bean.Animation;
import top.lllyl2012.bean.Image;
import top.lllyl2012.bean.IndexRank;
import top.lllyl2012.bean.News;
import top.lllyl2012.bean.Performer;
import top.lllyl2012.bean.mapper.AnimationMapper;
import top.lllyl2012.bean.mapper.ImageMapper;
import top.lllyl2012.bean.mapper.PerformerMapper;
import top.lllyl2012.service.AnimationService;
import top.lllyl2012.service.IndexRankService;
@Service
public class AnimationServiceImpl implements AnimationService{
	@Autowired
	private AnimationMapper animationMapper;
	
	@Autowired
	private ImageMapper imageMapper;
	
	@Autowired
	private PerformerMapper performerMapper;
	
	@Autowired
	private IndexRankService indexRankService; 
	
	@Override
	public Integer insert(Animation animation, String[] imagePath, String[] performerName) {
		Integer num =  animationMapper.insert(animation);
		if(imagePath != null) {
			for(int i=0;i<imagePath.length;i++) {
				Image image = new Image();
				image.setMovieId(animation.getId());
				image.setPath(imagePath[i]);
				imageMapper.insert(image);
			}
		}
		if(performerName != null) {
			for(int i=0;i<performerName.length;i++) {
				Performer performer = new Performer();
				performer.setMovieId(animation.getId());
				performer.setZhName(performerName[i]);
				performerMapper.insert(performer);
			}
		}
		return num;
	}

	@Override
	public List<Animation> selectAll() {
		List<Animation> animations = animationMapper.selectNew();
		return animations;
	}

	@Override
	public Animation selectById(int id) {
		Animation animation = animationMapper.selectByPrimaryKey(id);
		return animation;
	}
}
