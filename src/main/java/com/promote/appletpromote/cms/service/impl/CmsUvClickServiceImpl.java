package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.CmsUvClickService;
import com.promote.appletpromote.entity.TbUvClick;
import com.promote.appletpromote.mapper.TbUvClickMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsUvClickServiceImpl implements CmsUvClickService {


    @Resource
    private TbUvClickMapper tbUvClickMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tbUvClickMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbUvClick record) {
        return tbUvClickMapper.insert(record);
    }

    @Override
    public int insertSelective(TbUvClick record) {
        return tbUvClickMapper.insertSelective(record);
    }

    @Override
    public TbUvClick selectByPrimaryKey(Integer id) {
        return tbUvClickMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TbUvClick record) {
        return tbUvClickMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbUvClick record) {
        return tbUvClickMapper.updateByPrimaryKey(record);
    }
}
