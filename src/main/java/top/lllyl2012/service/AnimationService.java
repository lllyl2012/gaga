package top.lllyl2012.service;

import java.util.List;

import top.lllyl2012.bean.Animation;

public interface AnimationService {
	
	Integer insert(Animation animation, String[] imagePath, String[] performerName);
	
	List<Animation> selectAll();
	
	Animation selectById(int id);
}
