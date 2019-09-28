package com.promote.appletpromote.cms.service;

import com.promote.appletpromote.entity.TbUvClick;

import java.util.List;

public interface CmsUvClickService {

    int deleteByPrimaryKey(Integer id);

    int insert(TbUvClick record);

    int insertSelective(TbUvClick record);

    TbUvClick selectByPrimaryKey(Integer id);

    List<TbUvClick> selectByPrimaryParm(TbUvClick record);

    int updateByPrimaryKeySelective(TbUvClick record);

    int updateByPrimaryKey(TbUvClick record);
}
