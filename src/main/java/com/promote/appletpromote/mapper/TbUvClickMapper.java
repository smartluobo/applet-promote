package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.TbUvClick;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TbUvClickMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUvClick record);

    int insertSelective(TbUvClick record);

    TbUvClick selectByPrimaryKey(Integer id);

    List<TbUvClick> selectByPrimaryParm(TbUvClick record);

    int updateByPrimaryKeySelective(TbUvClick record);

    int updateByPrimaryKey(TbUvClick record);
}