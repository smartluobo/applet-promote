package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.TbApiUser;

public interface TbApiUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbApiUser record);

    int insertSelective(TbApiUser record);

    TbApiUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbApiUser record);

    int updateByPrimaryKey(TbApiUser record);
}