package com.promote.appletpromote.cms.service;

import com.promote.appletpromote.entity.TbPvClick;

public interface CmsPvClickService {

    int deleteByPrimaryKey(Integer id);

    int insert(TbPvClick record);

    int insertSelective(TbPvClick record);

    TbPvClick selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbPvClick record);

    int updateByPrimaryKey(TbPvClick record);
}
