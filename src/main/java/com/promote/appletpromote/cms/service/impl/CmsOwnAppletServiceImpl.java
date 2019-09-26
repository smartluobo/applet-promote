package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.CmsOwnAppletService;
import com.promote.appletpromote.entity.TbOwnApplet;
import com.promote.appletpromote.mapper.TbOwnAppletMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CmsOwnAppletServiceImpl implements CmsOwnAppletService {

    @Resource
    private TbOwnAppletMapper tbOwnAppletMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tbOwnAppletMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbOwnApplet record) {
        return tbOwnAppletMapper.insert(record);
    }

    @Override
    public int insertSelective(TbOwnApplet record) {
        return tbOwnAppletMapper.insertSelective(record);
    }

    @Override
    public TbOwnApplet selectByPrimaryKey(Integer id) {
        return tbOwnAppletMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbOwnApplet> selectByParam(TbOwnApplet tbOwnApplet) {
        return tbOwnAppletMapper.selectByParam(tbOwnApplet);
    }

    @Override
    public int updateByPrimaryKeySelective(TbOwnApplet record) {
        return tbOwnAppletMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbOwnApplet record) {
        return tbOwnAppletMapper.updateByPrimaryKey(record);
    }
}
