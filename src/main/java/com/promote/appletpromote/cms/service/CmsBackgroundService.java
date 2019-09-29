package com.promote.appletpromote.cms.service;

import com.promote.appletpromote.entity.TbBackground;

public interface CmsBackgroundService {

    int deleteByPrimaryKey(Integer id);

    int insert(TbBackground record);

    int insertSelective(TbBackground record);

    TbBackground selectByPrimaryKey(Integer id);

    TbBackground selectByPrimaryParam(TbBackground record);

    int updateByPrimaryKeySelective(TbBackground record);

    int updateByPrimaryKey(TbBackground record);
}
