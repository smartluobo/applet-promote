package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.ApiGame;
import com.promote.appletpromote.entity.TbClientApplet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TbClientAppletMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbClientApplet record);

    int insertSelective(TbClientApplet record);

    TbClientApplet selectByPrimaryKey(Integer id);

    ApiGame selectById(Integer id);

    List<TbClientApplet> selectByParam(TbClientApplet record);

    int updateByPrimaryKeySelective(TbClientApplet record);

    int updateByPrimaryKey(TbClientApplet record);
}