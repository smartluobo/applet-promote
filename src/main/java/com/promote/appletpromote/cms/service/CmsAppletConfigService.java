package com.promote.appletpromote.cms.service;

import com.promote.appletpromote.entity.TbAppletConfig;

public interface CmsAppletConfigService {

    int deleteByPrimaryKey(Integer id);

    int insert(TbAppletConfig record);

    int insertSelective(TbAppletConfig record);

    TbAppletConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbAppletConfig record);

    TbAppletConfig selectByPrimaryParam(TbAppletConfig record);

    int updateByPrimaryKey(TbAppletConfig record);
}
