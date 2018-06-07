package top.lllyl2012.bean.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.bean.IndexRank;
import top.lllyl2012.bean.IndexRankExample;

public interface IndexRankMapper {
    long countByExample(IndexRankExample example);

    int deleteByExample(IndexRankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexRank record);

    int insertSelective(IndexRank record);

    List<IndexRank> selectByExample(IndexRankExample example);

    IndexRank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexRank record, @Param("example") IndexRankExample example);

    int updateByExample(@Param("record") IndexRank record, @Param("example") IndexRankExample example);

    int updateByPrimaryKeySelective(IndexRank record);

    int updateByPrimaryKey(IndexRank record);
}