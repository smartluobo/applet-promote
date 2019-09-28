package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.CmsPvClickService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsPvClickServiceImpl implements CmsPvClickService {


    @Resource
    private TbPvClickMapper tbPvClickMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tbPvClickMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbPvClick record) {
        return tbPvClickMapper.insert(record);
    }

    @Override
    public int insertSelective(TbPvClick record) {
        return tbPvClickMapper.insertSelective(record);
    }

    @Override
    public TbPvClick selectByPrimaryKey(Integer id) {
        return tbPvClickMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TbPvClick record) {
        return tbPvClickMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbPvClick record) {
        return tbPvClickMapper.updateByPrimaryKey(record);
    }
}
