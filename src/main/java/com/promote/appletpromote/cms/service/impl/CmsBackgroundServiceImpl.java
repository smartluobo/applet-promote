package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.CmsBackgroundService;
import com.promote.appletpromote.entity.TbBackground;
import com.promote.appletpromote.mapper.TbBackgroundMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsBackgroundServiceImpl implements CmsBackgroundService {

    @Resource
    private TbBackgroundMapper tbBackgroundMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(TbBackground record) {
        return 0;
    }

    @Override
    public int insertSelective(TbBackground record) {
        return 0;
    }

    @Override
    public TbBackground selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public TbBackground selectByPrimaryParam(TbBackground record) {
        return tbBackgroundMapper.selectByPrimaryParam(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TbBackground record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TbBackground record) {
        return 0;
    }
}
