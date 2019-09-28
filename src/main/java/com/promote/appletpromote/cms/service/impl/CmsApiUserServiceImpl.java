package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.CmsApiUserService;
import com.promote.appletpromote.entity.TbApiUser;
import com.promote.appletpromote.mapper.TbApiUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmsApiUserServiceImpl implements CmsApiUserService {


    @Resource
    private TbApiUserMapper tbApiUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tbApiUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbApiUser record) {
        return tbApiUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TbApiUser record) {
        return tbApiUserMapper.insertSelective(record);
    }

    @Override
    public TbApiUser selectByPrimaryKey(Integer id) {
        return tbApiUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TbApiUser record) {
        return tbApiUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbApiUser record) {
        return tbApiUserMapper.updateByPrimaryKey(record);
    }
}
