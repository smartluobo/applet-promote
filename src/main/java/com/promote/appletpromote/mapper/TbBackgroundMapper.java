package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.TbBackground;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbBackgroundMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbBackground record);

    int insertSelective(TbBackground record);

    TbBackground selectByPrimaryKey(Integer id);

    TbBackground selectByPrimaryParam(TbBackground record);


    int updateByPrimaryKeySelective(TbBackground record);

    int updateByPrimaryKey(TbBackground record);
}