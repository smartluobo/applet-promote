package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.CmsAppletConfigService;
import com.promote.appletpromote.entity.TbAppletConfig;
import com.promote.appletpromote.mapper.TbAppletConfigMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsAppletConfigServiceImpl implements CmsAppletConfigService {

    @Resource
    private TbAppletConfigMapper tbAppletConfigMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(TbAppletConfig record) {
        return 0;
    }

    @Override
    public int insertSelective(TbAppletConfig record) {
        return 0;
    }

    @Override
    public TbAppletConfig selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TbAppletConfig record) {
        return 0;
    }

    @Override
    public TbAppletConfig selectByPrimaryParam(TbAppletConfig record) {
        return tbAppletConfigMapper.selectByPrimaryParam(record);
    }

    @Override
    public int updateByPrimaryKey(TbAppletConfig record) {
        return 0;
    }
}
