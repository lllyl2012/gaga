package top.lllyl2012.bean.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.bean.IndexLunbo;
import top.lllyl2012.bean.IndexLunboExample;

public interface IndexLunboMapper {
    long countByExample(IndexLunboExample example);

    int deleteByExample(IndexLunboExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexLunbo record);

    int insertSelective(IndexLunbo record);

    List<IndexLunbo> selectByExample(IndexLunboExample example);

    IndexLunbo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexLunbo record, @Param("example") IndexLunboExample example);

    int updateByExample(@Param("record") IndexLunbo record, @Param("example") IndexLunboExample example);

    int updateByPrimaryKeySelective(IndexLunbo record);

    int updateByPrimaryKey(IndexLunbo record);
}