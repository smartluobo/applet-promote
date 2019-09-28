package com.promote.appletpromote.cms.service;

import com.promote.appletpromote.entity.TbApiUser;

public interface CmsApiUserService {

    int deleteByPrimaryKey(Integer id);

    int insert(TbApiUser record);

    int insertSelective(TbApiUser record);

    TbApiUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbApiUser record);

    int updateByPrimaryKey(TbApiUser record);
}
