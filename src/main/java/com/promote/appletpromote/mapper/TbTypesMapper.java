package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.TbTypes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TbTypesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbTypes record);

    int insertSelective(TbTypes record);

    TbTypes selectByPrimaryKey(Integer id);

    List<TbTypes> selectByParam(TbTypes record);

    int updateByPrimaryKeySelective(TbTypes record);

    int updateByPrimaryKey(TbTypes record);
}