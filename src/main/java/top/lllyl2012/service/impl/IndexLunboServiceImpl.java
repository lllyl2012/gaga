package top.lllyl2012.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.lllyl2012.bean.Animation;
import top.lllyl2012.bean.IndexLunbo;
import top.lllyl2012.bean.IndexLunboExample;
import top.lllyl2012.bean.mapper.AnimationMapper;
import top.lllyl2012.bean.mapper.IndexLunboMapper;
import top.lllyl2012.service.IndexLunboService;

@Service
public class IndexLunboServiceImpl implements IndexLunboService{

	@Autowired
	private IndexLunboMapper indexLunboMapper;
	
	@Autowired
	private AnimationMapper animationMapper;
	
	@Override
	public List<IndexLunbo> selectAll() {
		IndexLunboExample example = new IndexLunboExample();
		List<IndexLunbo> indexLunbos = indexLunboMapper.selectByExample(example);
		for (IndexLunbo indexLunbo : indexLunbos) {
			Integer animationId = indexLunbo.getAnimationId();
			Animation animation = animationMapper.selectByPrimaryKey(animationId);
			indexLunbo.setAnimation(animation);
		}
		return indexLunbos;
	}

}
