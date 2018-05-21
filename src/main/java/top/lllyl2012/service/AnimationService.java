package top.lllyl2012.service;

import top.lllyl2012.bean.Animation;

public interface AnimationService {
	Integer insert(Animation animation, String[] imagePath, String[] performerName);
}
