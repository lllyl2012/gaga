package top.lllyl2012.bean.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.bean.Performer;
import top.lllyl2012.bean.PerformerExample;

public interface PerformerMapper {
    long countByExample(PerformerExample example);

    int deleteByExample(PerformerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Performer record);

    int insertSelective(Performer record);

    List<Performer> selectByExample(PerformerExample example);

    Performer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Performer record, @Param("example") PerformerExample example);

    int updateByExample(@Param("record") Performer record, @Param("example") PerformerExample example);

    int updateByPrimaryKeySelective(Performer record);

    int updateByPrimaryKey(Performer record);
}