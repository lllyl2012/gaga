package top.lllyl2012.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.lllyl2012.bean.Animation;
import top.lllyl2012.bean.Image;
import top.lllyl2012.bean.Performer;
import top.lllyl2012.bean.mapper.AnimationMapper;
import top.lllyl2012.bean.mapper.ImageMapper;
import top.lllyl2012.bean.mapper.PerformerMapper;
import top.lllyl2012.service.AnimationService;
@Service
public class AnimationServiceImpl implements AnimationService{
	@Autowired
	private AnimationMapper animationMapper;
	
	@Autowired
	private ImageMapper imageMapper;
	
	@Autowired
	private PerformerMapper performerMapper;
	
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

}
