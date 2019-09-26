package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.TbOwnApplet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TbOwnAppletMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbOwnApplet record);

    int insertSelective(TbOwnApplet record);

    TbOwnApplet selectByPrimaryKey(Integer id);

    List<TbOwnApplet> selectByParam(TbOwnApplet tbOwnApplet);

    int updateByPrimaryKeySelective(TbOwnApplet record);

    int updateByPrimaryKey(TbOwnApplet record);
}