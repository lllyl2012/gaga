package top.lllyl2012.bean.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.bean.IndexNews;
import top.lllyl2012.bean.IndexNewsExample;

public interface IndexNewsMapper {
    long countByExample(IndexNewsExample example);

    int deleteByExample(IndexNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexNews record);

    int insertSelective(IndexNews record);

    List<IndexNews> selectByExample(IndexNewsExample example);

    IndexNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexNews record, @Param("example") IndexNewsExample example);

    int updateByExample(@Param("record") IndexNews record, @Param("example") IndexNewsExample example);

    int updateByPrimaryKeySelective(IndexNews record);

    int updateByPrimaryKey(IndexNews record);
}