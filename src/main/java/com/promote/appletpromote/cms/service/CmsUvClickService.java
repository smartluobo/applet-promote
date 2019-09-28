package com.promote.appletpromote.cms.service;

import com.promote.appletpromote.entity.TbUvClick;

public interface CmsUvClickService {

    int deleteByPrimaryKey(Integer id);

    int insert(TbUvClick record);

    int insertSelective(TbUvClick record);

    TbUvClick selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUvClick record);

    int updateByPrimaryKey(TbUvClick record);
}
