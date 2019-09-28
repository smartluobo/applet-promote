package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.TbAppletConfig;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbAppletConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbAppletConfig record);

    int insertSelective(TbAppletConfig record);

    TbAppletConfig selectByPrimaryKey(Integer id);

    TbAppletConfig selectByPrimaryParam(TbAppletConfig record);

    int updateByPrimaryKeySelective(TbAppletConfig record);

    int updateByPrimaryKey(TbAppletConfig record);
}