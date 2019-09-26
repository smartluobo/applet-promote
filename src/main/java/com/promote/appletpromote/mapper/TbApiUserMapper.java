package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.TbApiUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbApiUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbApiUser record);

    int insertSelective(TbApiUser record);

    TbApiUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbApiUser record);

    int updateByPrimaryKey(TbApiUser record);
}