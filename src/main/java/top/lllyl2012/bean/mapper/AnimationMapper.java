package top.lllyl2012.bean.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.bean.Animation;
import top.lllyl2012.bean.AnimationExample;

public interface AnimationMapper {
    long countByExample(AnimationExample example);

    int deleteByExample(AnimationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Animation record);

    int insertSelective(Animation record);

    List<Animation> selectByExample(AnimationExample example);

    Animation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Animation record, @Param("example") AnimationExample example);

    int updateByExample(@Param("record") Animation record, @Param("example") AnimationExample example);

    int updateByPrimaryKeySelective(Animation record);

    int updateByPrimaryKey(Animation record);

	List<Animation> selectNew();
}