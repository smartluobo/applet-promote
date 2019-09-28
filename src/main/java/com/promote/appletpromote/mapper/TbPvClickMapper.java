package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.TbPvClick;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbPvClickMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPvClick record);

    int insertSelective(TbPvClick record);

    TbPvClick selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbPvClick record);

    int updateByPrimaryKey(TbPvClick record);
}