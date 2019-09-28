package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.TbUvClick;

public interface TbUvClickMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUvClick record);

    int insertSelective(TbUvClick record);

    TbUvClick selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUvClick record);

    int updateByPrimaryKey(TbUvClick record);
}