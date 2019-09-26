package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.TbClientApplet;

import java.util.List;

public interface TbClientAppletMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbClientApplet record);

    int insertSelective(TbClientApplet record);

    TbClientApplet selectByPrimaryKey(Integer id);

    List<TbClientApplet> selectByParam(TbClientApplet record);

    int updateByPrimaryKeySelective(TbClientApplet record);

    int updateByPrimaryKey(TbClientApplet record);
}